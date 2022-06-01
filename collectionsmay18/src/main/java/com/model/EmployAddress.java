package com.model;

public class EmployAddress {
	private int houseId;
	private String StretName;
	private String city;
	
	
	public String getStretName() {
		return StretName;
	}

	public void setStretName(String stretName) {
		StretName = stretName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public EmployAddress(int houseId) {
		super();
		this.houseId = houseId;
	}

	public int getHouseId() {
		return houseId;
	}

	public EmployAddress(int houseId, String stretName, String city) {
		super();
		this.houseId = houseId;
		StretName = stretName;
		this.city = city;
	}

	
}
