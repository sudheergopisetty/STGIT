package com.main;

import java.util.List;
import java.util.Scanner;

import com.dao.UserDaoImpl;
import com.model.User;
import com.music.Music;
import com.service.Checkpassword;

public class LoginApp {

	public static void main(String[] args) {
		// interface varName = new InterfaceImpl;
		
		
		UserDaoImpl userDao = new UserDaoImpl();
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter want you want 1 - create; 2 - update ; 3 - read; 4
		// - delete");
		boolean check = true;
		while (check) {
			System.out.println("Enter want you want 1 - create; 2 - update ; 3 - read; 4 - delete");
			boolean a = sc.hasNext();
			String number = "";
			if (a) {
				number = sc.next();
			}

			switch (number) {

			case "1":

				System.out.print("Enter User_name : ");
				String user_name = sc.next();
				System.out.print("Password must contain 8 digits and have aleast one uppercase, lowercase,number and special character");
				System.out.println("Enter Password : ");
				String password = sc.next();
				// User user = new User(user_name, password);
				
					if (Checkpassword.isValidPassword(password)) {
						User userFromDao = userDao.createUser(user_name, password);
						Music.createAudi();
						System.err.println("User Added Sucessfully");
						System.out.println("\ud83d\ude02");
						System.out.println("User id : " + userFromDao.getUser_id() + "  User Name : "
								+ userFromDao.getUser_name());
					} else {
						Music.passwordInvalid();
						System.err.println("Password Must contain aleast 1 Upper ,lower,special,and digit ");
					}

				break;
			case "2":

				UserDaoImpl userDao1 = new UserDaoImpl();
				System.out.print("Enter user_id Which you want update : ");
				int user_id = sc.nextInt();
				User user12 = userDao.readByUserId(user_id);
				if (user12.getUser_name() != null) {
					User user1 = userDao1.updateByUserId(user_id);
					if (user1.getUser_name() != null) {
						System.out.println("Updated Successfully :)");
						Music.userUpdated();
					} else {
						System.out.println("Not updated please try again :(");
					}
				} else {
					System.out.println("User Id  Not Foud .So, unable to update it :(");
				}

				break;
			case "3":
				List<User> coll = userDao.readAllUser();
				coll.stream().forEach((arg) -> {
					System.out.println("User id : " + arg.getUser_id() + "  User Name : " + arg.getUser_name());
				});
				break;
			case "4":
				System.out.print("Enter user_id Which you want delete : ");
				int delete_id = sc.nextInt();
				User delete = userDao.readByUserId(delete_id);
				if (delete.getUser_name() != null) {
					userDao.deleteByUserId(delete_id);
					Music.deleteAudio();
					System.out.println("User is deleted from the data base with id " + delete_id + ". Succesfully :)");
				} else {
					System.out.println("User Id  Not Foud, So unable to delete it :(");
				}

				break;

			default:
				check = false;
				System.out.println("Terminated plz run the file again! :)");
				break;
			}
		}
		sc.close();
	}

}
