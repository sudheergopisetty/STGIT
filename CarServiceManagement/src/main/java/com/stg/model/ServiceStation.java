package com.stg.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "service_station")
public class ServiceStation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_station_id")
	private int servieStationId;
	@Column(name = "service_station_name")
	private String serviceStationName;
	@Column(name = "openingTime")
	private String ServiceStationOpeningTime;
	@Column(name = "closingTime")
	private String serviceStationClosingTime;

	@ManyToMany
	@JoinTable(name = "users_in_service_station", 
	joinColumns = @JoinColumn(name = "service_station_id"), 
	inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> users_in_service_station = new ArrayList<>();

	@JsonManagedReference(value = "services")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "serviceRef")
	private List<Address> address;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locationId", nullable = false, referencedColumnName = "location_id")
	@JsonBackReference(value = "locations")
	private Location locationRef;

	public void enrollUser(User user) {
		users_in_service_station.add(user);
		
	}


}
