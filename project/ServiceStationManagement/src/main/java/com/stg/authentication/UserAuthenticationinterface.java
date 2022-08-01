package com.stg.authentication;


import com.stg.dto.EmployeDto;
import com.stg.dto.UserLog;



public interface UserAuthenticationinterface {
	
	public abstract UserLog userAuthentivation(EmployeDto employe);

}
