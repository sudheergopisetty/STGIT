package Main;

import Model.StudentModel;
import Service.StudentCode;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;
public class StudentMain {

	public static void main(String[] args) {
		
		StudentModel studentModel1= new StudentModel(100, "kumar", "civil", 25000);
		StudentModel[] studentModels = {studentModel1};
		studentModels[0] = studentModel1;
		//System.out.println(studentModels[0].getStudentName());
		
		
		System.out.println("Enter 1 for Add details of student");
		System.out.println("Enter 2 for Read details of student");
		System.out.println("Enter 3 for Update details of student");
		System.out.println("Enter 4 for Delete details of student");
		System.out.println("Enter any key which is not in above option for go out");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Select the one in above options");
		
	while(scan.hasNextInt()) {
		int num = scan.nextInt();
		if(num>0 || num<5) {
				switch(num) {
				case 1:
					StudentModel studentModel= new StudentModel();
					System.out.println("Enter Student Id : ");
					int id = scan.nextInt();
					studentModel.setStudentId(id); 
					
					System.out.println("Enter Student Name : ");
					String name = scan.next();
					studentModel.setStudentName(name);
					System.out.println("Enter Student Branch : ");
					String branch = scan.next();
					studentModel.setStudentBranch(branch);
					System.out.println("Enter Colleget Fee : ");
					int fees= scan.nextInt();
					studentModel.setCollegeFee(fees);
					
					StudentCode studentCode = new StudentCode();
					studentModels = studentCode.addDetails(studentModels, studentModel);
					System.out.println(studentModels.length);
				break;
				case 2:
					StudentCode.getDeatils(studentModels);
					break;
				case  3:
					
				default:
					//
				}
			}else {
				System.out.println("terminated");
				break;
			}
	}
		
		System.out.println("terminated");
		scan.close();
		/*
		 * StudentCode studentCode = new StudentCode();
		 * studentCode.addDetails(studentModels); for (int i = 0; i <
		 * studentModels.length; i++) { int id = studentModels[i].getStudentId();
		 * System.out.println(id); }
		 */
		
	}

}
