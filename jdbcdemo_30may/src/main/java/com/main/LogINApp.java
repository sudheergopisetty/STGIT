package com.main;

import java.util.List;
import java.util.Scanner;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;


public class LogINApp {

	public static void main(String[] args) {
	
		  UserDao usert = new UserDaoImpl();
		  List<User> coll= usert.readAllUsers();
		  coll.stream().forEach((arg) -> { 
			  System.out.println(arg); 
			  });
		  			
	
			
			  try (Scanner scanner = new Scanner(System.in)) {
			  
			  System.out.println("Enter User Name"); String userName = scanner.next();
			  System.out.println("Enter User Password"); String userPassword =
			  scanner.next();
			  
			  User user = new User(userName, userPassword); User userInput =
			  usert.createUser(user);
			  System.out.println("User Successfully updated with Id " +
			  userInput.getUser_id()); }catch(Exception e) { e.getMessage(); }
			 
			}
		
		
			
	}

	


