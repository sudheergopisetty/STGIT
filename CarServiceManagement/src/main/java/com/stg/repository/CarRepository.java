package com.stg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.stg.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
	@Query(value = "SELECT * FROM car;", nativeQuery = true)
	public abstract List<Car> readAllCarss();

	@Query(value = "SELECT * FROM car as s WHERE s.car_id= :status ;", nativeQuery = true)
	public abstract Car  readByCarId(@Param("status") int carId);
	
	
	@Query(value = "SELECT * FROM car as s WHERE s.car_id= :status ;", nativeQuery = true)
	public abstract List<Car>  readByuserId(@Param("status") int carId);

}
