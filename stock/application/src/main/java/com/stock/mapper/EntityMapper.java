package com.stock.mapper;

import java.util.ArrayList;
import java.util.List;

import com.stock.entity.Stock;
import com.stock.model.StockPrice;

public class EntityMapper {

	public static Stock toStockPrice(String companyCode, StockPrice stockPrice) {
		Stock stockEntity = new Stock();
		stockEntity.setStockPrice(stockPrice.getStockPrice());
		stockEntity.setStartDate(stockPrice.getStartDate());
		stockEntity.setEndDate(stockPrice.getEndDate());
		stockEntity.setCompanyCode(companyCode);
		return stockEntity;
	}

	public static List<StockPrice> toStockPriceModel(List<Stock> stocks) {
		List<StockPrice> stockPrices = new ArrayList<StockPrice>();
		for (Stock stock : stocks) {
			StockPrice stockPrice = new StockPrice();
			stockPrice.setStockPrice(stock.getStockPrice());
			stockPrice.setId(stock.getId());
			stockPrice.setStartDate(stock.getStartDate());
			stockPrice.setEndDate(stock.getEndDate());
			stockPrices.add(stockPrice);
		}
		return stockPrices;
	}

}
