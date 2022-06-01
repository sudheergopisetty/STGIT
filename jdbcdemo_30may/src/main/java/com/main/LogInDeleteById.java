package com.main;

import java.util.Scanner;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
public class LogInDeleteById {

	public static void main(String[] args) {
		UserDao usert = new UserDaoImpl();	
	  	try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter User Id");
			int id = scanner.nextInt();

			int userInput = usert.deleteByUserId(id);
			if(userInput != 0) {
				System.out.println("deleted");
			}else {
				System.out.println("not deleted");
			}
			
			
		}catch(Exception e) {
			e.getMessage();
		}
	}

}
