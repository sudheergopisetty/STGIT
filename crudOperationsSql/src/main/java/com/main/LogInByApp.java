package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.EmployInterface;
import com.dao.EmployInterfaceImpl;
import com.dao.Options;
import com.model.Employ;


public class LogInByApp {

	public static void main(String[] args) {
		Options.getOPtions();
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
						System.out.println();
						Options.getOPtions();
						System.out.println();
						System.out.println("Select above option");

						break;
					case 2:
						System.out.println("Enter 6 for Read All Employ Details");
						System.out.println("Enter 7 for Read employ Details by Id");
						System.out.println("Enter 8 for Read employ Details by Name");
						
						System.out.println("Slect above option");
						int get = scanner.nextInt();
						EmployInterface employInterface = new EmployInterfaceImpl();
						
						switch(get) {
						case 6:
							List<Employ> employ = employInterface.readAllEmployers();
							employ.stream().forEach((arg) -> {
								System.out.println(arg);
							});
							System.out.println();
							Options.getOPtions();
							System.out.println();
							System.out.println("Select above option");

							break;
						case 7:
							System.out.println("Enter Employ Id");
							int id = scanner.nextInt();
							Employ employ1 = employInterface.readByEmployId(id);
							if(employ1 != null) {
								System.out.println("Employ id : " + employ1.getEmploy_id());
								System.out.println("Employ name : " + employ1.getEmploy_Name());
							}else {
								System.out.println("error");
								break;
							}
							System.out.println();
							Options.getOPtions();
							System.out.println();
							System.out.println("Select above option");

							break;
						case 8:
							System.out.println("Enter Employ Name");
							String name = scanner.next();
							List<Employ> employs = employInterface.readByEmployName(name);
							employs.stream().forEach((arg) ->{
								System.out.println(arg);

							});
							System.out.println();
							Options.getOPtions();
							System.out.println();
							System.out.println("Select above option");

							break;
							default:
								//
								break;
						}
						break;
						
					case 3:
							EmployInterface employInterface1 = new EmployInterfaceImpl();
							System.out.println("Enter 9 for Update employ Details by Id");
							System.out.println("Enter 10 for Update employ Details by Name");
							
							System.out.println("Select above Option");
							int choice = scanner.nextInt();
							System.out.println();
							Options.getOPtions();
							System.out.println();
							System.out.println("Select above option");

						break;
					case 5:
						EmployInterface employInterface2 = new EmployInterfaceImpl();

						System.out.println("Enter Employ Id");
						int id = scanner.nextInt();
						System.out.println("Enter Employ Password");
						String name = scanner.next();
						Employ employ1 = employInterface2.readByEmployId(id);
						if(employ1.getEmploy_id()== id && employ1.getEmploy_Password().equalsIgnoreCase(name)) {
							System.out.println("Successfully loged in");
						}else {
							System.err.println("You Entered the wrong User Id or wrong Password");
						}
						System.out.println();
						Options.getOPtions();
						System.out.println();
						System.out.println("Select above option");
						break;
					default :
						//
						break;
					}
			}
		}
	}
}
	
