package com.stg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stg.model.Address;


@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{
	
	
	  @Query(value = "SELECT * FROM address ;", nativeQuery = true) 
	  public abstract List<Address> readAllAddress();
	  
	  @Query(value = "SELECT * FROM address as addres WHERE addres.address_id = :addresss ;", nativeQuery = true) 
	  public abstract Address readAddressById(@Param("addresss") int addressId);
	  
	//  @Query(value = "DELETE FROM address WHERE address_id = :id ;", nativeQuery = true) 
	  
	
	 

}
