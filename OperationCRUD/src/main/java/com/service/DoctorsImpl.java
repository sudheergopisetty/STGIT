package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Doctor;
import com.model.Patient;
@Service
public class DoctorsImpl implements DoctorService {

	
	public static List<Doctor> init(){
		Patient patient1 = new Patient(11, "kiran", 11111111111L,"cold");
		Patient patient2 = new Patient(20, "karna", 222222222222L,"fever");
		Patient patient3 = new Patient(30, "balu", 33333333333L,"cold");
		
		List<Patient> patientWithCold = new ArrayList<Patient>();
		patientWithCold.add(patient1);
		patientWithCold.add(patient3);
		
		List<Patient> patientWithFever = new ArrayList<Patient>();
		patientWithFever.add(patient2);
		
		
		Doctor doctor1 = new Doctor(101, "Dr. Doctor Cold", 1212121212L, "MBBS", patientWithCold);
		
		patient1.setDoctor(doctor1);
		patient3.setDoctor(doctor1);
		
		Doctor doctor2 = new Doctor(102, "Dr. Doctor Fever", 2323232323L, "MS,MBBS", patientWithFever);
		patient2.setDoctor(doctor2);
		
		List<Doctor> listOfDoctors = new ArrayList<Doctor>();
		listOfDoctors.add(doctor1);
		listOfDoctors.add(doctor2);
		
		return listOfDoctors;
	}
	@Override
	public Doctor createDoctor(Doctor doctor) {
		//logic--- dao
		// validation
		
		Doctor tempdoctor2 = null;
		if(doctor.getDoctorName().length()>5 && String.valueOf(doctor.getMobileNumber()).length()==10) {
			
			tempdoctor2 =doctor;
			
		}else {
			System.err.println("Validation failed");
		}
		return doctor;
	}

	@Override
	public List<Doctor> readAllDoctors() {
		
		
		
		return init();
	}

	@Override
	public Doctor readDoctorById(int doctorId) {
		Doctor tempDoctor = null;
		
		  if (doctorId == 102) {
		        tempDoctor = new Doctor(102, "Dr. Doctor Fever", 2323232323L, "MS,MBBS");
		  }  
		  if (doctorId == 101) {
		        tempDoctor = new Doctor(101, "Dr. Doctor Cold", 2323232323L, "MS,MBBS");
		  } else {
		  
		  }
		 
		return tempDoctor;
	}

	@Override
	public List<Doctor> readDoctorByName(String doctorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> deleteDoctorById(int doctorId) {
		List<Doctor> s = init();
		//Doctor tempDoctor = null;
		
		
		  
		        for (Doctor doctor : s) {
		        	if(doctor.getDoctorId()==doctorId) {
		        		s.remove(doctor);
		        	}else {
		        		return s;
		        	}
		        }
		        //s = new Doctor(101, "Dr. Doctor Cold", 2323232323L, "MS,MBBS");
		  
		 
		  return s;
	}

	@Override
	public String deleteDoctorByName(String doctorName) {
		String s = "n";
		Doctor tempDoctor = null;
		
		
		  if (doctorName.equalsIgnoreCase("Dr. Doctor Fever")) {
		        tempDoctor = new Doctor(102, "Dr. Doctor Fever", 2323232323L, "MS,MBBS");
		        init().remove(tempDoctor);
		        s = "s";
		  }  
		  if (doctorName.equalsIgnoreCase("Dr. Doctor Cold")) {
		        tempDoctor = new Doctor(101, "Dr. Doctor Cold", 2323232323L, "MS,MBBS");
		        init().remove(tempDoctor);
		        s="s";
		  } else {
			  System.out.println("not valid");
			  s = "n";
		  
		  }		
		  return s;
		
	}

}
