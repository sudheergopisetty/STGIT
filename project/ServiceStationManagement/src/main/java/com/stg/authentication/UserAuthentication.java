package com.stg.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.dto.EmployeDto;
import com.stg.dto.UserLog;
import com.stg.entity.Employe;
import com.stg.service.EmployeService;

@Service
public class UserAuthentication implements UserAuthenticationinterface{
	
	@Autowired
	private EmployeService employeService;

	@Override
	public UserLog userAuthentivation(EmployeDto employe) {
		String name = employe.getUserName();
		String password = employe.getPassword();
		
		UserLog user  = new UserLog();
		Employe employe1 = employeService.readEmployeByName(name);
		if(employe1.getPassword().equals(password) ) {
			
			user.setUserName(employe1.getUserName());
			user.setEmployeType(employe1.getEmployeType());
			return user;
		}
			return null;
		
		
		
	}
	


}
