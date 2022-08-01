package com.stg.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stg.entity.Car;
@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

	@Query(value = "SELECT * FROM car;", nativeQuery = true)
	public abstract List<Car> readAllCarss();

	@Query(value = "SELECT * FROM car as s WHERE s.car_id= :status ;", nativeQuery = true)
	public abstract List<Car> readByCarId(@Param("status") int carId);
	
	@Query(value = "SELECT * FROM car WHERE employe_id= :id ;", nativeQuery = true)
	public abstract List<Car> readByUserId(@Param("id") int id);
	
	@Query(value = "SELECT * FROM car as s WHERE s.car_brand LIKE :status ;", nativeQuery = true)
	public abstract List<Car> readCarByBrand(@Param("status") String carBrand);
	
	@Query(value = "SELECT * FROM car as s WHERE s.car_model_name LIKE :status ;", nativeQuery = true)
	public abstract List<Car> readCarByName(@Param("status") String carBrand);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM car WHERE car_id= :id ;", nativeQuery = true)
	public abstract void deleteCar(@Param("id") int carId);

}
