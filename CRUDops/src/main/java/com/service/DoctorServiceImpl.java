package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.dao.ConnectorClass;
import com.model.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Override
	public Doctor CreateDoctor(Doctor doctor) {
		System.out.println("Doctor called");
		if (doctor.getDoctorId() != 0 && doctor.getDoctorName().length() > 5
				&& String.valueOf(doctor.getMobileNo()).length() == 10) {
			String createQuery = "INSERT INTO doctor(doctorName, mobileNo, doctorSpecilization) values (\""
					+ doctor.getDoctorName() + "\"" + ",\"" + doctor.getMobileNo() + "\"" + ",\""
					+ doctor.getDoctorSpecilization() + "\"" + ");";
			String selectQuery = "SELECT * FROM user WHERE user_name like \"" + doctor.getDoctorName() + "\";";
			try {
				Connection connection = ConnectorClass.getConnection();
				Statement statement = connection.createStatement();
				int status = statement.executeUpdate(createQuery);
				ResultSet result = statement.executeQuery(selectQuery);
				if (status != 0) {
					while (result.next()) {
						int id = result.getInt("user_id");
						doctor.setDoctorId(id);
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return doctor;
		} else {
			System.err.println("Validation Failed...!");
			return null;
		}
	}

	@Override
	public List<Doctor> readAllDoctors() {
		Connection connection = ConnectorClass.getConnection();
		String getQuery = "SELECT * FROM doctor;";
		List<Doctor> doctors= new ArrayList<Doctor>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(getQuery);
			while (resultSet.next()) {
				Doctor doctor = new Doctor(resultSet.getInt("doctorId"), resultSet.getString("doctorName"), resultSet.getLong("mobileNo"), resultSet.getString("doctorSpecilization"));
				doctors.add(doctor);
				System.out.println(doctor);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return doctors;
	}

	@Override
	public Doctor readById(int doctorId) {
		return null;
	}

	@Override
	public List<Doctor> readByName(String doctorName) {
		return null;
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		return null;
	}

	@Override
	public int deleteById(int doctorId) {
		return 0;
	}

}
