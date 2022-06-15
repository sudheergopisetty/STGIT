package com.stg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = "adress")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int addressId;
	@Column(name = "door_id")
	private int doorNumber;
	@Column(name = "road_id")
	private int roadNumber;
	@Column(name = "street_name")
	private String streetName;
	@Column(name = "landmark")
	private String landMark;
	
	
	

}
