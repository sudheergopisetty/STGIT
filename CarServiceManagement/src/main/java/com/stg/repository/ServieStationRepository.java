package com.stg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stg.model.Location;
import com.stg.model.ServiceStation;

public interface ServieStationRepository extends JpaRepository<ServiceStation, Integer>{
	@Query(value = "SELECT * FROM service_station;", nativeQuery = true)
	public abstract List<Location> readAllLocations();


}
