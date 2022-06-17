package com.stg.service;

import java.util.List;

import com.stg.model.Address;
public interface AddressServiceInterface {
	
	public abstract  List<Address> getAllAddress();
	
	public abstract Address getAddressById(int Id);
	

}
