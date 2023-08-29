package com.training.set;

import java.util.Objects;

public class Product {
   
	private Integer productId;
	private String productName;
	private float  price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer productId, String productName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, productId, productName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
				&& Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName);
	}

}
