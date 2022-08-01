package com.stg.repository;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.stg.entity.ServiceOfCar;

@Repository
public interface ServiceOfCarRepoository extends JpaRepository<ServiceOfCar, Integer>{
	
	@Query(value = "SELECT * FROM service_of_car; ", nativeQuery = true)
	public abstract List<ServiceOfCar> readAllService();
	
	@Query(value = "SELECT * FROM service_of_car WHERE Service_id= :id ;",nativeQuery = true)
	public abstract ServiceOfCar readServiceById(@Param("id") int ServiceId);
	
	@Query(value = "SELECT * FROM service_of_car WHERE booking_id= :id ;",nativeQuery = true)
	public abstract List<ServiceOfCar> readByBookingId(@Param("id") int ServiceId);
	
	@Query(value = "SELECT * FROM service_of_car as s WHERE s.employe_id= :status ;", nativeQuery = true)
	public abstract List<ServiceOfCar> readUsingEmployeId(@Param("status") int employeId);

	@Transactional
	@Modifying
	@Query(value = "DELETE FROM service_of_car WHERE Service_id= :id ;", nativeQuery = true)
	public abstract ServiceOfCar deleteService(@Param("id") int ServiceId);
}
