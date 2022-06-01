package Service;

import Model.StudentModel;

public class StudentCode {

	public static StudentModel[] addDetails(StudentModel[] models, StudentModel std){
		int count = models.length ;
		StudentModel[] newStudentArray = new StudentModel[count+1];
		for (int i = 0; i < count; i++) {
			newStudentArray[i] = models[i];
		}
		newStudentArray[count] = std;
		return newStudentArray;
}

	public static void getDeatils(StudentModel[] model) {
		for (int i = 0; i < model.length; i++) {
			System.out.println(
					"Student Id : " +model[i].getStudentId() + "   Student Name : " + model[i].getStudentName() + "   Student Branch : " + model[i].getStudentBranch() + "college Fee : " + model[i].getCollegeFee() 
					);
		}
		
	}
	
	public static StudentModel[] updateDetails(StudentModel[] update, StudentModel into) {
		
		
		return null;
	}
	
}