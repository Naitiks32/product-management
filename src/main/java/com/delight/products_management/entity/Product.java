package com.delight.products_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private String description;
	private Double rate;
	private int popularityScore;
	private int shelfLife;
	private String sku;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public int getPopularityScore() {
		return popularityScore;
	}

	public void setPopularityScore(int popularityScore) {
		this.popularityScore = popularityScore;
	}

	public int getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Product() {
		super();
	}

	public Product(int id, String name, String description, Double rate, int popularityScore, int shelfLife,
			String sku) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.rate = rate;
		this.popularityScore = popularityScore;
		this.shelfLife = shelfLife;
		this.sku = sku;
	}

}
