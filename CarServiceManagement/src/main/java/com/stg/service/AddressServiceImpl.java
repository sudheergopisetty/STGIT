package com.stg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.model.Address;
import com.stg.repository.AddressRepository;
@Service
public class AddressServiceImpl implements AddressServiceInterface{
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public List<Address> getAllAddress() {
		
		return addressRepository.readAllAddress();
	}

	@Override
	public Address getAddressById(int Id) {
		
		return addressRepository.readAddressById(Id);
	}

}
