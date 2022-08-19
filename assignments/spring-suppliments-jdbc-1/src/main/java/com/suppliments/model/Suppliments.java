package com.suppliments.model;

public class Suppliments {
	
   private String brandName;
   private Integer prodId;
   private double price;
   private String type;
public String getBrand() {
	return brandName;
}
public void setBrandName(String brandname) {
	this.brandName = brandname;
}
public Integer getProdId() {
	return prodId;
}
public void setProdId(Integer prodId) {
	this.prodId = prodId;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Suppliments() {
	super();
}
public Suppliments(String brand, Integer prodId, double price, String type) {
	super();
	this.brandName = brand;
	this.prodId = prodId;
	this.price = price;
	this.type = type;
}
@Override
public String toString() {
	return "Suppliments [brand=" + brandName + ", prodId=" + prodId + ", price=" + price + ", type=" + type + "]";
}

   
   
}
