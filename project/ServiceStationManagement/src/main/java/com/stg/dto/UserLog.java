package com.stg.dto;

import com.stg.enumdata.EmployeType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLog {
	
	private String userName;
	
	private String password;
	
	private EmployeType employeType;

}
