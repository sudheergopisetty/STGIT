package com.stg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.model.Location;
import com.stg.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationServiceInterface {
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public List<Location> readLocation() {
		return locationRepository.readAllLocations();
	}

	@Override
	public Location readByLocationId(int locationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Location> readByLocationName(String LocationName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location updateBYId(int locationId, Location location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location deleteById(int locationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
