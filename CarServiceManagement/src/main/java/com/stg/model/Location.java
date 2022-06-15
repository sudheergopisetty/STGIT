package com.stg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id")
	private int locationId;
	@Column(name = "location_name")
	private String locationName;

	

	public Location() {
		super();
	}

	public Location(String locationName) {
		super();
		this.locationName = locationName;
	}

	public Location(int locationId, String locationName) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}
