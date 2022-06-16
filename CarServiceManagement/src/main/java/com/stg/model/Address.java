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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
*/
@Entity
@Table(name = "address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int addressId;
	@Column(name = "door_number")
	private int doorNumber;
	@Column(name = "road_number")
	private int roadNumber;
	@Column(name = "street_name")
	private String streetName;
	@Column(name = "landmark")
	private String landMark;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "serviceStationId", nullable = false, referencedColumnName = "service_station_id")
	@JsonBackReference(value = "services")
	private ServiceStation serviceRef;

}
