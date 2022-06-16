package com.stg.service;

import java.util.List;

import com.stg.model.Location;

public interface LocationServiceInterface {

	public abstract List<Location> readLocation();
	public abstract Location readByLocationId(int locationId);
	public abstract List<Location> readByLocationName(String LocationName);
	public abstract Location updateBYId(int locationId,Location location);
	public abstract Location deleteById(int locationId);

}
