package com.stg.service;

import java.util.List;

import com.stg.entity.ServiceOfCar;
import com.stg.exception.ResourceNotFoundException;

public interface ServiceOfCarService {
	public abstract ServiceOfCar createServiceOfCar(ServiceOfCar service,int bookingId, int mechanicId);
	public abstract List<ServiceOfCar> readAllServiceOfCars();
	public abstract List<ServiceOfCar> readCarServices(int carId);
	public abstract ServiceOfCar readServiceOfCarById(int serviceId) throws ResourceNotFoundException;
	public abstract List<ServiceOfCar> readServiceOfByEmploye(int employeId) throws ResourceNotFoundException;
	public abstract List<ServiceOfCar> readServiceOfByBookingId(int bookingId) throws ResourceNotFoundException;
	public abstract ServiceOfCar updateServiceOfCarById(ServiceOfCar service,int serviceId) throws ResourceNotFoundException;
	public abstract int deleteServiceOfCarById(int serviceId) throws ResourceNotFoundException;

}
