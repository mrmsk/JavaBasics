package com.test;

public class Address implements Cloneable {

	private String streetName;
	private String city;
	private String pinCode;

	public Address(String streetName, String city, String pinCode) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	public  Object  clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
