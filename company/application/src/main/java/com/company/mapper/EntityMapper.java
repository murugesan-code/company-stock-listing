package com.company.mapper;

import javax.validation.Valid;

import com.company.entity.Company;

public class EntityMapper {

	public static Company toCompany(com.company.model.@Valid Company company) {
		Company companyEntity = new Company();
		companyEntity.setCode(company.getCode());
		companyEntity.setName(company.getName());
		companyEntity.setCeo(company.getCeo());
		companyEntity.setTurnover(company.getTurnover());
		companyEntity.setWebsite(company.getWebsite());
		companyEntity.setStockExchange(company.getStockExchange());
		return companyEntity;
	}

}
