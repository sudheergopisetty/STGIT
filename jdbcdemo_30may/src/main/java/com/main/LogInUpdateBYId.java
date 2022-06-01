package com.main;

import java.util.Scanner;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;

public class LogInUpdateBYId {

	public static void main(String[] args) {
		UserDao usert = new UserDaoImpl();
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter User Id");
			int id = scanner.nextInt();
			System.out.println("Enter User Name");
			String userName = scanner.next();
			System.out.println("Enter User Password");
			String userPassword = scanner.next();
			
			User user = new User(id, userName, userPassword);
			User userInput = usert.updateUserById(id,user);
			System.out.println("User Successfully updated with Id :" + userInput.getUser_id());
		}catch(Exception e) {
			System.out.println("not updated");
		}
		
	


	}

}
