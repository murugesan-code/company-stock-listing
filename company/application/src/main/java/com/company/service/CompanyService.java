package com.company.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.company.mapper.EntityMapper;
import com.company.model.Company;
import com.company.model.StockPrice;
import com.company.repository.CompanyRepository;
import com.company.restclient.StockClient;

import lombok.extern.slf4j.Slf4j;

@RestController
@Service
@Slf4j
@CrossOrigin
public class CompanyService implements com.company.api.CompanyApi {

	@Autowired
	CompanyRepository repository;

	@Autowired
	StockClient StockClient;

	@Override
	public ResponseEntity<String> createCompany(@Valid Company company) {
		com.company.entity.CompanyEntity companyEntity = EntityMapper.toCompany(company);
		try {
			repository.save(companyEntity);
		} catch (Exception e) {
			log.error("Error on registering company", e);
		}
		return new ResponseEntity<String>("Company saved", HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Company>> getCompanies() {
		List<Company> companyModels = new ArrayList<Company>();
		try {
			List<com.company.entity.CompanyEntity> companies = repository.findAll();
			for (com.company.entity.CompanyEntity company : companies) {
				List<StockPrice> stockPrices = StockClient.getStockPricesByComapnyCode(company.getCode());
				for (StockPrice stockPrice : stockPrices) {
					log.info("Stock price:" + stockPrice.getStockPrice());
				}
				Company companyModel = EntityMapper.toComapnyModel(company, stockPrices);
				companyModels.add(companyModel);
			}
		} catch (Exception e) {
			log.error("Error on registering company", e);
		}
		return new ResponseEntity<List<Company>>(companyModels, HttpStatus.OK);
	}

}
