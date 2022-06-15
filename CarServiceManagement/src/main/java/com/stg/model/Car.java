package com.stg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "car_id")
	private int carId;
	@Column(name = "car_model_name")
	private String carModel;
	@Column(name = "car_brand")
	private String carBrand;
	@Column(name = "car_color")
	private String carColor;
	@Column(name = "car_number_plate")
	private String carNumberPlate;

	public Car() {
		super();
	}

	public Car(String carModel, String carBrand, String carColor, String carNumberPlate) {
		super();
		this.carModel = carModel;
		this.carBrand = carBrand;
		this.carColor = carColor;
		this.carNumberPlate = carNumberPlate;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getcarBrand() {
		return carBrand;
	}

	public void setCarName(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarNumberPlate() {
		return carNumberPlate;
	}

	public void setCarNumberPlate(String carNumberPlate) {
		this.carNumberPlate = carNumberPlate;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "user_id")
	  @JsonBackReference(value = "cars")
	  private User userRef;

}
