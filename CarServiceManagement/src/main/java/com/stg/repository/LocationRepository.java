package com.stg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stg.model.Location;


@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{
	
	@Query(value = "SELECT * FROM location;", nativeQuery = true)
	public abstract List<Location> readAllLocations();

}
