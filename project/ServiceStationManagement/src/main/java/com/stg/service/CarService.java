package com.stg.service;

import java.util.List;

import com.stg.entity.Car;
import com.stg.exception.ResourceNotFoundException;

public interface CarService {
	public abstract Car createCar(Car car, int userId);

	public abstract List<Car> readAllCars();

	public abstract Car readCarById(int carId) throws ResourceNotFoundException;
	
	public abstract List<Car> readCarByUser(int userId) throws ResourceNotFoundException;

	public abstract Car updatecarById(Car car, int carId) throws ResourceNotFoundException;

	public abstract String deletecarById(int carId) throws ResourceNotFoundException;
	
	public abstract List<Car> readCarByBrandName(String carName) throws ResourceNotFoundException ;
	
	public abstract Car updateCarByBrandName(Car car, String carName, String userName) throws ResourceNotFoundException;
	
	public abstract int deletecarByBrandName(String carName) throws ResourceNotFoundException;
	
	public abstract List<Car> readCarByName(String carName) throws ResourceNotFoundException ;
	
	public abstract Car updateCarByName(Car car, String carName, String userName) throws ResourceNotFoundException;
	
	public abstract int deletecarByName(String carName) throws ResourceNotFoundException;

}
