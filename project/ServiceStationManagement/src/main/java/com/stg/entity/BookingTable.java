package com.stg.entity;
import java.util.Date;
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
import javax.persistence.Transient;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.stg.enumdata.BookingData;
import com.stg.enumdata.ServiceCompleted;
import com.stg.enumdata.SetviceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking_table")
public class BookingTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id")
	private int bookingId;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date serviceBookingDate;
	
	@Column(name = "service_type", length = 45)
	private SetviceType serviceType;
	
	@Column(name = "service_description")
	private String serviceDescription; 

	
	private ServiceCompleted working;
	
	private BookingData status; 
	
	@Transient
	private int carId;
	
	@JsonBackReference(value = "user1")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employe_id", nullable = false)
	private Employe user1;

	@JsonBackReference(value = "car2")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "car_id", nullable = false) 
	private Car car2;
	
	
	
	
	@JsonManagedReference(value = "booking")
	@OneToMany( fetch = FetchType.LAZY, mappedBy = "booking", cascade = CascadeType.ALL)
	private List<ServiceOfCar> services;
	/*
	 * @ManyToMany(mappedBy = "bookings", cascade = { CascadeType.ALL }) private
	 * Set<User> employees = new HashSet<User>();
	 */

}
