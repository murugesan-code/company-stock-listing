package com.stock.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.stock.api.StockApi;
import com.stock.entity.Stock;
import com.stock.mapper.EntityMapper;
import com.stock.model.StockPrice;
import com.stock.repository.StockRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Service
@Slf4j
@CrossOrigin
public class StockService implements StockApi {

	@Autowired
	StockRepository stockRepository;

	@Override
	public ResponseEntity<String> createStockPrice(String companyCode, @Valid StockPrice stockPrice) {

		Stock stockEntity = EntityMapper.toStockPrice(companyCode, stockPrice);
		try {
			stockRepository.save(stockEntity);
		} catch (Exception e) {
			log.error("Error on creating stock price for companycode", e);
		}
		return new ResponseEntity<String>("Stock price created successfully", HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> deleteStockPrice(String companyCode) {
		try {
			stockRepository.deleteByCompanyCode(companyCode);
		} catch (Exception e) {
			log.error("Error on creating stock price for companycode", e);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<StockPrice>> getAllStockPrice(String companyCode) {
		List<StockPrice> stockPrices = null;
		try {
			List<Stock> stocks = stockRepository.findByCompanyCode(companyCode);
			stockPrices = EntityMapper.toStockPriceModel(stocks);
		} catch (Exception e) {
			log.error("Error on creating stock price for companycode", e);
		}
		return new ResponseEntity<List<StockPrice>>(stockPrices, HttpStatus.OK);
	}

}
