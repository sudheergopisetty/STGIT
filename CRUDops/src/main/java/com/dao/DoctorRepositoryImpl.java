package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Doctor;

@Repository
public class DoctorRepositoryImpl implements DoctorRepository {
	
	@SuppressWarnings("unused")
	@Autowired
	private ConnectorClass connectorclass;
	private Doctor doctor1;

	@Override
	public Doctor CreateDoctor(Doctor doctor) {
		//System.out.println("Doctor called");
		String createQuery = "INSERT INTO doctor(doctorName, mobileNo, doctorSpecilization) values (\""
				+ doctor.getDoctorName() + "\"" + ",\"" + doctor.getMobileNo() + "\"" + ",\""
				+ doctor.getDoctorSpecilization() + "\"" + ");";
		String selectQuery = "SELECT * FROM doctor WHERE doctorName like \"" + doctor.getDoctorName() + "\";";
		try {
			Connection connection = ConnectorClass.getConnection();
			Statement statement = connection.createStatement();
			int status = statement.executeUpdate(createQuery);
			ResultSet result = statement.executeQuery(selectQuery);
			if (status != 0) {
				while (result.next()) {
					int id = result.getInt("doctorId");
					doctor.setDoctorId(id);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return doctor;
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
				Doctor doctor = new Doctor(resultSet.getInt("doctorId"), resultSet.getString("doctorName"), resultSet.getString("mobileNo"), resultSet.getString("doctorSpecilization"));
				doctors.add(doctor);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return doctors;
	}

	@Override
	public Doctor readById(int doctorId) {
		Connection connection = ConnectorClass.getConnection();
		String sqlQuery = "select * from user where user_id = \"" + doctorId + "\"";
		Statement statement = null;
		ResultSet resultSet = null;
		// PreparedStatement preparedStatement = null;
		Doctor doctor = new Doctor();

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			while (resultSet.next()) {
				if (resultSet.getInt(1) == doctorId) {
					doctor.setDoctorId(doctorId);
					doctor.setDoctorName(resultSet.getString("doctorName"));
					doctor.setMobileNo(resultSet.getString("mobileNo"));
				}
			}
		} catch (SQLException e) {

			System.err.println(e.getMessage());
		}
		return doctor;
	}

	@Override
	public List<Doctor> readByName(String doctorName) {
		return null;
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		Connection connection = ConnectorClass.getConnection();
		String updateQuery = "UPDATE doctor set doctorName=\"" + doctor.getDoctorName() + "\",mobileNo=" + "\"" + doctor.getMobileNo() + "\",doctorSpecilization=" + "\""+ doctor.getDoctorSpecilization()
				+ "\" where user_id=\"" + doctor.getDoctorId() + "\";";
		try {
			Statement statement = connection.createStatement();
			int status = statement.executeUpdate(updateQuery);
			if (status != 0) {
				System.out.println("Update successful");
			} else {
				System.out.println("Update unsuccessful");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return doctor1;
	}

	@Override
	public int deleteById(int doctorId) {
		Connection connection = null;
		String deleteQuery = "DELETE FROM doctor where doctorId=\"" + doctorId + "\";";
		int status = 0;
		try {
			connection = ConnectorClass.getConnection();
			Statement statement = connection.createStatement();
			status = statement.executeUpdate(deleteQuery);
			if (status == 1) {
				System.out.println("Delete successful");
			} else {
				System.out.println("Delete unsuccessful");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		return status;
	}

}
