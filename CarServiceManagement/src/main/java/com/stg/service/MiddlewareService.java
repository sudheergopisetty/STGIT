package com.stg.service;

import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

//import org.springframework.beans.factory.annotation.Autowired;

import com.stg.Exception.NotAuthorisedException;
import com.stg.model.User;
@Service
public class MiddlewareService {

	
	public boolean authenticate(User customer,String password) throws NotAuthorisedException{
		if(customer.getPassword().equals(password)) {
			return true;
		}else {
			throw new NotAuthorisedException("Authentication failed !!!");
		}
	}
	
	public boolean checkPassword1(String str) {
	    char ch;
	    boolean capitalFlag = false;
	    boolean lowerCaseFlag = false;
	    boolean numberFlag = false;
	    for(int i=0;i < str.length();i++) {
	        ch = str.charAt(i);
	        if( Character.isDigit(ch)) {
	            numberFlag = true;
	        }
	        else if (Character.isUpperCase(ch)) {
	            capitalFlag = true;
	        } else if (Character.isLowerCase(ch)) {
	            lowerCaseFlag = true;
	        }
	        if(numberFlag && capitalFlag && lowerCaseFlag)
	            return true;
	    }
	    return false;
	}
	
	/*
	 * ^(?=.*[a-z])(?=.*[A-Z])(?=.*\d).+$
	 * 
	 * descriptions are as follow (?=.*[a-z]) -- check lower case letter (?=.*[A-Z])
	 * -- check upper case letter (?=.*\d) -- check one digit exists
	 */
	
	public boolean checkPassword2(String textToCheck) {
		Pattern textPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
		return textPattern.matcher(textToCheck).matches();
		}
}
