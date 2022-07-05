package com.stg.model;

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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	@Column(name = "user_name", length = 60)
	private String userName;
	@Column(name = "mobile_number")
	private long mobileNumber;
	@Column(name = "gmail_id", length = 60)
	private String gmailId;
	@Column(name = "password", length = 60)
	private String password;

	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "admin_id", nullable = false, referencedColumnName =
	 * "admin_id")
	 * 
	 * @JsonBackReference(value = "admins") // @JsonIgnore private User adminRef;
	 */
	
	@JsonManagedReference(value = "cars")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "userRef")
	@JsonIgnore
	private List<Car> cars;

}
