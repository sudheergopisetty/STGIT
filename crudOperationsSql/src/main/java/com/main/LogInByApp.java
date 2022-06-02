package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.EmployInterface;
import com.dao.EmployInterfaceImpl;
import com.model.Employ;

public class LogInByApp {

	public static void main(String[] args) {
		System.out.println("Enter 1 for Create employ Details");
		System.out.println("Enter 2 for Read Employ Details");
		System.out.println("Enter 3 for Update Employ Details");
		System.out.println("Enter 4 for Delete employ Details");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select above option");
		while(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			if(num>0 || num<5) {
					switch(num) {
					case 1:
						try{
							EmployInterface employInterface = new EmployInterfaceImpl();
							System.out.println("Enter User Name");
							String userName = scanner.next();
							System.out.println("Enter User Password");
							String userPassword = scanner.next();
							Employ user = new Employ(userName, userPassword);
							Employ userInput = employInterface.createEmploy(user);
							System.out.println("User Successfully updated with Id " + userInput.getEmploy_id());
						}catch(Exception e) {
							e.getMessage();
						}
						
						
						break;
					case 2:
						System.out.println("Enter 5 for Read All Employ Details");
						System.out.println("Enter 6 for Read employ Details by Id");
						System.out.println("Enter 7 for Read employ Details by Name");
						
						System.out.println("Slect above option");
						int option = scanner.nextInt();
						
						switch(option) {
							case 5:
								
							
							
							EmployInterface employInterface = new EmployInterfaceImpl();
							List<Employ> employ = employInterface.readAllEmployers();
							employ.stream().forEach((arg) -> {
								System.out.println(arg);
							});
							break;
						}
							
						case 3:
								EmployInterface employInterface1 = new EmployInterfaceImpl();
								System.out.println("Enter 8 for Update Employ Name by Employ Id");
								
								
								System.out.println("Select above Option");
								int choice = scanner.nextInt();
								
								
									
							break;
					default:
						//
			}
		
		}
}
}}