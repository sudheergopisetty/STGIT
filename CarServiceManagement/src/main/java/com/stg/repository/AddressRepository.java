package com.stg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stg.model.Address;


public interface AddressRepository extends JpaRepository<Address, Integer>{

}
