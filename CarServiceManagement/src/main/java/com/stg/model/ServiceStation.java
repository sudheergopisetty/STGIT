package com.stg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "service_station")
public class ServiceStation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_staton_id")
	private int servieStationId;
	@Column(name = "service_staton_name")
	private String serviceStationName;
	@Column(name = "openingTime")
	private String ServiceStationOpeningTime;
	@Column(name = "closingTime")
	private String ServiceStationClosingTime;


	public ServiceStation() {
		super();
	}

	public ServiceStation(int servieStationId, String serviceStationName, String serviceStationOpeningTime,
			String serviceStationClosingTime) {
		super();
		this.servieStationId = servieStationId;
		this.serviceStationName = serviceStationName;
		ServiceStationOpeningTime = serviceStationOpeningTime;
		ServiceStationClosingTime = serviceStationClosingTime;
	}

	public int getServieStationId() {
		return servieStationId;
	}

	public void setServieStationId(int servieStationId) {
		this.servieStationId = servieStationId;
	}

	public String getServiceStationName() {
		return serviceStationName;
	}

	public void setServiceStationName(String serviceStationName) {
		this.serviceStationName = serviceStationName;
	}

	public String getServiceStationOpeningTime() {
		return ServiceStationOpeningTime;
	}

	public void setServiceStationOpeningTime(String serviceStationOpeningTime) {
		ServiceStationOpeningTime = serviceStationOpeningTime;
	}

	public String getServiceStationClosingTime() {
		return ServiceStationClosingTime;
	}

	public void setServiceStationClosingTime(String serviceStationClosingTime) {
		ServiceStationClosingTime = serviceStationClosingTime;
	}

}
