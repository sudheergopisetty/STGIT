package com.stg.service;

import java.util.List;


import com.stg.model.ServiceStation;


public interface ServiceStationInterface {
	
	public abstract List<ServiceStation> readAllServiceStations();
	public abstract ServiceStation updateBYId(int stationId,String name);
	public abstract ServiceStation deleteById(int stationId);


}
