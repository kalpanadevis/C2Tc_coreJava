package com.tnsif.sm.productservice;


import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

    
@Entity    
@Table(name="products")
public class Product  
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer productId;
	@Column(name="name")
    private String name;
	@Column(name="description")
    private String description;
	@Column(name="price")
    private float price;
	@Column(name="stockQuantity")
    private Integer stockQuantity;
	@Column(name="category")
    private String category;
	@Column(name="storeId")
    private Integer storeId; 
	
	public Product()
	{
		
		
	}
	public Product(Integer productId, String name, String description, float price, Integer stockQuantity,
			String category, Integer storeId) {
		
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.category = category;
		this.storeId = storeId;
		
	}
	

	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public String getCategory() {
		return category;
	}  

	public void setCategory(String category) {
		this.category = category;
	}

    public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	
	
	
} 
