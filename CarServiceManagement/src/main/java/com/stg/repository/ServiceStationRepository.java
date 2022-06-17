package com.stg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stg.model.ServiceStation;
import com.stg.model.User;
@Repository
public interface ServiceStationRepository extends JpaRepository<ServiceStation, Integer>{
	
	@Query(value = "SELECT * FROM service_station;", nativeQuery = true)
	public abstract List<ServiceStation> readAllStations();
	
	@Query(value = "SELECT * FROM service_station as s WHERE s.service_station_id= :status ;", nativeQuery = true)
	public abstract ServiceStation readById(@Param("status") int id);
	
	@Query(value = "SELECT * FROM service_station as s WHERE s.service_station_id= :status ;", nativeQuery = true)
	public abstract ServiceStation updateById(@Param("status") int id);

}
