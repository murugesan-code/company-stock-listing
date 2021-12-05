package com.stock.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {
	List<Stock> findByCompanyCode(String companyCode);

	@Transactional
	void deleteByCompanyCode(String companyCode);

}
