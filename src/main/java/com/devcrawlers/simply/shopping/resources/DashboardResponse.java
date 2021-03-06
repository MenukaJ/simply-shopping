package com.devcrawlers.simply.shopping.resources;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class DashboardResponse {

	private String totalItems;
	
	private String totalCategories;
	
	private String totalBrands;
	
	private String totalSellers;
	
	private String totalBuyers;
	
	private String totalOrders;

	public String getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(String totalItems) {
		this.totalItems = totalItems;
	}

	public String getTotalCategories() {
		return totalCategories;
	}

	public void setTotalCategories(String totalCategories) {
		this.totalCategories = totalCategories;
	}

	public String getTotalBrands() {
		return totalBrands;
	}

	public void setTotalBrands(String totalBrands) {
		this.totalBrands = totalBrands;
	}

	public String getTotalSellers() {
		return totalSellers;
	}

	public void setTotalSellers(String totalSellers) {
		this.totalSellers = totalSellers;
	}

	public String getTotalBuyers() {
		return totalBuyers;
	}

	public void setTotalBuyers(String totalBuyers) {
		this.totalBuyers = totalBuyers;
	}

	public String getTotalOrders() {
		return totalOrders;
	}

	public void setTotalOrders(String totalOrders) {
		this.totalOrders = totalOrders;
	}
	
}
