package com.stg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stg.entity.ServiceOfCar;
import com.stg.service.ServiceOfCarService;

@CrossOrigin(value = "http://localhost:4200/")		
@RestController
@RequestMapping(value = "ServiceOfCar")
public class ServiceOfCarController {
	
	@Autowired
	private ServiceOfCarService serviceOfCarService;
	
	
	@GetMapping(value="allServiceOfCars")
	public ResponseEntity<List<ServiceOfCar>> allServiceOfCars(){
		ResponseEntity<List<ServiceOfCar>> ServiceOfCar = new ResponseEntity<>(serviceOfCarService.readAllServiceOfCars(),HttpStatus.ACCEPTED);
		
		return ServiceOfCar;
	}
	
	@GetMapping(value = "getCarById/{id}")
	public  ResponseEntity<List<ServiceOfCar>> getServiceOfCarById(@PathVariable(value = "id") int ServiceOfCarId){
		ResponseEntity<List<ServiceOfCar>> ServiceOfCar = new ResponseEntity<>(serviceOfCarService.readCarServices(ServiceOfCarId),HttpStatus.ACCEPTED);
		
		return ServiceOfCar;
	}
	
	@GetMapping(value = "getServiceByEmploye/{id}")
	public  ResponseEntity<List<ServiceOfCar>> getByServiceEmploye(@PathVariable(value = "id") int employeId){
		ResponseEntity<List<ServiceOfCar>> ServiceOfCar = new ResponseEntity<>(serviceOfCarService.readServiceOfByEmploye(employeId),HttpStatus.ACCEPTED);
		
		return ServiceOfCar;
	}
	
	@GetMapping(value = "getServiceByBooking/{id}")
	public  ResponseEntity<List<ServiceOfCar>> getByServiceByBooking(@PathVariable(value = "id") int bookingId){
		ResponseEntity<List<ServiceOfCar>> ServiceOfCar = new ResponseEntity<>(serviceOfCarService.readServiceOfByBookingId(bookingId),HttpStatus.ACCEPTED);
		
		return ServiceOfCar;
	}
	
	@PostMapping(value = "createServiceOfCar/{bookingId}/{mechanicId}")
	public  ResponseEntity<ServiceOfCar> createAServiceOfCar(@RequestBody ServiceOfCar ServiceOfCar,@PathVariable(value="bookingId") int bookingId, @PathVariable(value="mechanicId") int mechanicId){
		ResponseEntity<ServiceOfCar> serviceOfCars = new ResponseEntity<>(serviceOfCarService.createServiceOfCar(ServiceOfCar, bookingId, mechanicId),HttpStatus.OK);
		
		return serviceOfCars;
	} 


}
