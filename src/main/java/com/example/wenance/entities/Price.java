package com.example.wenance.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Price {

	@Id
	@GeneratedValue
	private Long id;
	private Date date;
	private BigDecimal price;
	private String currencyOrigin;
	private String currency;
	

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getCurrencyOrigin() {
		return currencyOrigin;
	}
	public void setCurrencyOrigin(String currencyOrigin) {
		this.currencyOrigin = currencyOrigin;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
