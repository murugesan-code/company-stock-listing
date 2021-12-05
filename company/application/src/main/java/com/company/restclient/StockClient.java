package com.company.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.company.model.StockPrice;

@FeignClient("STOCK-SERVICE")
public interface StockClient {

	@GetMapping("/api/v1.0/market/stock/getall/{companyCode}")
	List<StockPrice> getStockPricesByComapnyCode(@PathVariable("companyCode") String companyCode);

}
