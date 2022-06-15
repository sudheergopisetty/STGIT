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

import com.fasterxml.jackson.annotation.JsonManagedReference;


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
	

	public User() {
		super();
	}

	public User(String userName, long mobileNumber, String gmailId) {
		super();
		this.userName = userName;
		this.mobileNumber = mobileNumber;
		this.gmailId = gmailId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGmailId() {
		return gmailId;
	}

	public void setGmailId(String gmailId) {
		this.gmailId = gmailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	  @JsonManagedReference(value = "cars")
	  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy ="userRef") 
	  private List<Car> list;
	 
	 
	 
	 
}
