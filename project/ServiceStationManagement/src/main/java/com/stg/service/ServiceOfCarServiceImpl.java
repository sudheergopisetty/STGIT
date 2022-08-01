package com.stg.service;

import java.util.List;

import com.stg.entity.BookingTable;
import com.stg.entity.Employe;

import com.stg.entity.ServiceOfCar;
import com.stg.enumdata.ServiceCompleted; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stg.exception.ResourceNotFoundException;
import com.stg.repository.ServiceOfCarRepoository;


@Service
public class ServiceOfCarServiceImpl implements ServiceOfCarService {

	@Autowired
	private ServiceOfCarRepoository serviceOfCarRepositiry;
	

	
	@Autowired
	private EmployeService employeService;
	
	

	@Autowired
	private BookingTableService bookingTableService;
	
	@Override
	public ServiceOfCar createServiceOfCar(ServiceOfCar serviceOfCar,int bookingId, int employeId) {
		Employe employe = employeService.readByEmployeId(employeId);
		BookingTable booking = bookingTableService.readByBookingId(bookingId);
		booking.setWorking(ServiceCompleted.Completed);
		serviceOfCar.setBooking(booking);
		serviceOfCar.setEmploye(employe);
		
		serviceOfCar.setTotalCost(serviceOfCar.getQuantity() * serviceOfCar.getCost());
		
		return serviceOfCarRepositiry.save(serviceOfCar);
	}

	@Override
	public List<ServiceOfCar> readAllServiceOfCars() {

		return serviceOfCarRepositiry.readAllService();
	}

	@Override
	public ServiceOfCar readServiceOfCarById(int ServiceOfCarId) {

		ServiceOfCar Service = serviceOfCarRepositiry.findById(ServiceOfCarId).get();

		if (Service != null) {
			return serviceOfCarRepositiry.findById(ServiceOfCarId).get();
		} else {
			throw new ResourceNotFoundException("user id :" + ServiceOfCarId + "not found");
		}

	}

	@Override
	public ServiceOfCar updateServiceOfCarById(ServiceOfCar ServiceOfCar, int ServiceOfCarId) {
		ServiceOfCar newService = this.readServiceOfCarById(ServiceOfCarId);
		newService.setCost(ServiceOfCar.getCost());
		serviceOfCarRepositiry.save(newService);
		return newService;
	}

	@Override
	public int deleteServiceOfCarById(int serviceId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ServiceOfCar> readCarServices(int bookingId) {
		
		return serviceOfCarRepositiry.readByBookingId(bookingId);
	}

	@Override
	public List<ServiceOfCar> readServiceOfByEmploye(int employeId) throws ResourceNotFoundException {
		
		return serviceOfCarRepositiry.readUsingEmployeId(employeId);
	}

	@Override
	public List<ServiceOfCar> readServiceOfByBookingId(int bookingId) throws ResourceNotFoundException {
		
		return serviceOfCarRepositiry.readByBookingId(bookingId);
	}

	
}
