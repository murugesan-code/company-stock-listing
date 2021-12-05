package com.company.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {
	CompanyEntity findByCode(String companyCode);

	@Transactional
	void deleteByCode(String companyCode);
}
