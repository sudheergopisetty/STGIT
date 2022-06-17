package com.stg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.model.ServiceStation;
import com.stg.model.User;
import com.stg.repository.ServiceStationRepository;

@Service
public class ServiceStationImpl implements ServiceStationInterface{

	@Autowired
	private ServiceStationRepository serviceStationRepository;
	
	@Override
	public List<ServiceStation> readAllServiceStations() {
		return serviceStationRepository.readAllStations();
	}

	@Override
	public ServiceStation updateBYId(int stationId, String name) {
		
		ServiceStation station =  serviceStationRepository.updateById(stationId);
		station.setServiceStationName(name);
		serviceStationRepository.save(station);
		
		return station;
	}

	@Override
	public ServiceStation deleteById(int stationId) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
