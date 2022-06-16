package com.stg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.model.Location;
import com.stg.service.LocationServiceInterface;

@RestController
@RequestMapping(value = "location")
public class LocationController {
	@Autowired
	private LocationServiceInterface locationServiceInterface;

	@GetMapping(value = "readAlllocation")
	public List<Location> readLocation() {
		return locationServiceInterface.readLocation();

	}

}
