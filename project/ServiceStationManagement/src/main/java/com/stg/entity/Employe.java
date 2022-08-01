package com.stg.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.stg.enumdata.EmployeType;
import com.stg.enumdata.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employe")
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employe_id")
	private int employeId;
	@Column(name = "first_name", length = 45)
	private String firstName;
	
	@Column(name = "last_name", length = 45)
	private String lastName;
	
	@Column(name = "employe_type" )
	private EmployeType employeType;
	
	@Column(name = "user_name " ,unique=true)
	private String userName;
	@Column(name = "password", length=45	)
	private String password;
	@Column(name = "mobilenumber")
	private String mobileNumber;
	@Column(name = "employe_gmail", length=45)
	private String employeGmail; 
	
	@Column(name = "gender", length=45) 
	private Gender gender;
	
	@JsonManagedReference(value = "employe")
	@OneToMany( fetch = FetchType.LAZY, mappedBy = "employe", cascade = CascadeType.ALL)
	private List<ServiceOfCar> services;
	
	@JsonManagedReference(value = "user")
	@OneToMany( fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
	private List<Car> cars;
	
	@JsonManagedReference(value = "user1")
	@OneToMany( fetch = FetchType.LAZY, mappedBy = "user1", cascade = CascadeType.ALL)
	private List<BookingTable> bookings;
	
}
