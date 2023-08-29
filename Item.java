package com.training.set;

import java.util.Objects;

public class Item{

	private Integer itemId;
	private String  itemName;
	private float  price;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(Integer itemId, String itemName, float price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
	
	
}
