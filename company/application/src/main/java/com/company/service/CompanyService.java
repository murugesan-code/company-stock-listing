package com.company.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.company.mapper.EntityMapper;
import com.company.model.Company;
import com.company.repository.CompanyRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Service
@Slf4j
@CrossOrigin
public class CompanyService implements com.company.api.CompanyApi {

	@Autowired
	CompanyRepository repository;

	@Override
	public ResponseEntity<String> createCompany(@Valid Company company) {
		com.company.entity.Company companyEntity = EntityMapper.toCompany(company);
		try {
			repository.save(companyEntity);
		} catch (Exception e) {
			// log.error("Error on registering company", e);
		}
		return new ResponseEntity<String>("Company saved", HttpStatus.OK);
	}

	/*
	 * @Override public ResponseEntity<List<Company>> getCompanies() { List<Company>
	 * companyList = new ArrayList<Company>(); List<com.company.entity.Company>
	 * companies = repository.findAll();
	 * 
	 * }
	 */
}
