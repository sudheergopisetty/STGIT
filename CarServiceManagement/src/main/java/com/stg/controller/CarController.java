package com.stg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.model.Car;

import com.stg.repository.CarRepository;

@RestController
@RequestMapping(value = "car")
public class CarController {
	@Autowired
	private CarRepository carRepository;

	@GetMapping(value = "readAll")
	public List<Car> readUser() {
		return carRepository.readAllCarss();

	}

	@GetMapping(value = "readByUserId/{id}")
	public List<Car> readBYUser(@PathVariable("id") int id) {
		return carRepository.readByuserId(id);

	}

	@GetMapping(value = "readByCarId/{id}")
	public Car readBYCar(@PathVariable("id") int id) {
		return carRepository.readByCarId(id);

	}

}