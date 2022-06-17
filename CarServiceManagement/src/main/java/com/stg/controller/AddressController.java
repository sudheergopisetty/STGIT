package com.stg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stg.model.Address;
import com.stg.repository.AddressRepository;
import com.stg.service.AddressServiceInterface;

@RestController
@RequestMapping(value = "address")
public class AddressController {
	
	@Autowired
	private AddressServiceInterface addressServiceInterface;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@GetMapping(value = "readAllAddress")
	public List<Address> getAddress(){
		return addressServiceInterface.getAllAddress();
	} 
	
	@GetMapping(value = "readByAddress/{id}")
	public Address getAddressById(@PathVariable("id") int id){
		return addressServiceInterface.getAddressById(id);
	}
	
	@DeleteMapping(value = "dleteByAddress/{id}")
	public void deleteAddressById(@PathVariable("id") int id){
		 addressRepository.deleteById(id);
	}

}
