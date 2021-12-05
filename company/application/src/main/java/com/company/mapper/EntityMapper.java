package com.company.mapper;

import java.util.List;

import com.company.entity.CompanyEntity;
import com.company.model.Company;
import com.company.model.StockPrice;

public class EntityMapper {

	public static CompanyEntity toCompany(Company company) {
		CompanyEntity companyEntity = new CompanyEntity();
		companyEntity.setCode(company.getCode());
		companyEntity.setName(company.getName());
		companyEntity.setCeo(company.getCeo());
		companyEntity.setTurnover(company.getTurnover());
		companyEntity.setWebsite(company.getWebsite());
		companyEntity.setStockExchange(company.getStockExchange());
		return companyEntity;
	}

	public static Company toComapnyModel(CompanyEntity company, List<StockPrice> stockPrice) {

		Company companyModel = new Company();
		companyModel.setId(company.getId());
		companyModel.setCode(company.getCode());
		companyModel.setName(company.getName());
		companyModel.setWebsite(company.getWebsite());
		companyModel.setCeo(company.getCeo());
		companyModel.setStockExchange(company.getStockExchange());
		
		return companyModel;
	}
}
