package com.company.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
	Company findByCode(String companyCode);

	@Transactional
	void deleteByCode(String companyCode);
}
