package com.stg.entity;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "car_id")
	private int carId;
	@Column(name = "car_model_name", length = 45)
	private String carModel;
	@Column(name = "car_brand", length = 45)
	private String carBrand;
	@Column(name = "car_color", length = 45)
	private String carColor;
	@Column(name = "car_model_year", length = 45)
	private String carModelYear;
	@Column(name = "car_travelled_kilo_meters")
	private float carTravelledKiloMeters;
	@Column(name = "car_number_plate", length = 45,unique=true)
	private String carNumberPlate;
	


	@JsonBackReference(value = "user")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employe_id", nullable = false)
	private Employe user;
	
	/*
	 * @JsonManagedReference(value = "car")
	 * 
	 * @OneToMany( fetch = FetchType.LAZY, mappedBy = "car", cascade =
	 * CascadeType.ALL) private List<ServiceOfCar> services ;
	 */
	


	@JsonManagedReference(value = "car2")
	@OneToMany( fetch = FetchType.LAZY, mappedBy = "car2", cascade = CascadeType.ALL)
	private List<BookingTable> bookings;	
}
