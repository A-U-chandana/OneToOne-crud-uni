package com.ty.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class InVoice {
	@Id
private int id;
private String billingAddress;
private String name;
private String gstNumber;
private double tax;
@OneToOne
private Item item;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBillingAddress() {
	return billingAddress;
}
public void setBillingAddress(String billingAddress) {
	this.billingAddress = billingAddress;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGstNumber() {
	return gstNumber;
}
public void setGstNumber(String gstNumber) {
	this.gstNumber = gstNumber;
}
public double getTax() {
	return tax;
}
public void setTax(double tax) {
	this.tax = tax;
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}

}
