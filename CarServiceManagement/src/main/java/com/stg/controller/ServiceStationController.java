package com.stg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.stg.model.ServiceStation;
import com.stg.model.User;
import com.stg.repository.ServiceStationRepository;
import com.stg.repository.UserRepository;
import com.stg.service.ServiceStationInterface;



@RestController
@RequestMapping(value = "serviceStation")
public class ServiceStationController {
	@Autowired
	private ServiceStationInterface serviceStationInterface;
	
	@Autowired
	private ServiceStationRepository serviceStationRepository;
	
	private UserRepository userRepository;
	
	@GetMapping(value = "readById/{id}")
	public ResponseEntity<ServiceStation> readBYStation(@PathVariable("id") int id) {
		ServiceStation station  = serviceStationRepository.readById(id);
		ResponseEntity<ServiceStation> entity = new ResponseEntity<ServiceStation>(station,HttpStatus.FOUND);
		return entity;

	}
	
	@GetMapping(value = "readAllStation")
	public ResponseEntity<List<ServiceStation>> readOfStation() {
		 serviceStationInterface.readAllServiceStations();
		ResponseEntity<List<ServiceStation>> entity = new ResponseEntity<List<ServiceStation>>(HttpStatus.FOUND) ;
		return entity;

	}
	
	@PutMapping("/{service_station_id}/users/{user_id}")
	public ServiceStation getusers(@PathVariable int service_station_id, @PathVariable int user_id) {
	ServiceStation service = serviceStationRepository.readById(service_station_id);
	User user = userRepository.readById(user_id);
	
	service.enrollUser(user);
	return serviceStationRepository.save(service);
	}
	
	
	@PutMapping("updateById/{service_station_id}/{name}")
	public ServiceStation updateServiceStation(@PathVariable int service_station_id, @PathVariable("name") String name) {
	
	return serviceStationInterface.updateBYId(service_station_id,name);
	}
	
	
}
