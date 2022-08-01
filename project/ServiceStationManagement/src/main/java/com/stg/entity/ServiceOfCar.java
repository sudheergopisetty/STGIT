package com.stg.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ServiceOfCar")
public class ServiceOfCar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_id")
	private int serviceId;
	
	@Column(name = "name")
	private String name;

	@Column(name = "quantity")
	private int quantity;

	
	@Column(name = "cost")  
	private float cost;	
	
	@Column(name = "total_cost")
	private float totalCost;
	
	/*
	 * @JsonBackReference(value = "car")
	 * 
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "car_id", nullable = false) private Car car;
	 */
	  
	@JsonBackReference(value = "employe")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employe_id",   nullable = false)
	private Employe employe;
	
	
	@JsonBackReference(value = "booking")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "booking_id",   nullable = false)
	private BookingTable booking;
	
		
	 
	 
}
