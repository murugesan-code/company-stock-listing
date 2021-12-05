package com.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CompanyEntity {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "code")
	private String code;

	@Column(name = "name")
	private String name;

	@Column(name = "ceo")
	private String ceo;

	@Column(name = "turnover")
	private Integer turnover;

	@Column(name = "website")
	private String website;

	@Column(name = "stockExchange")
	private String stockExchange;
}
