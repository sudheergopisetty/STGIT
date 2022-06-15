package com.stg.controller;

import java.util.List;

import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.model.Car;
import com.stg.model.User;
import com.stg.repository.CarRepository;
import com.stg.repository.UserRepository;
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
	
	/*
	 * @PostMapping(value = "create") public User createUser(@RequestBody Car car) {
	 * 
	 * return carRepository.save(user);
	 * 
	 * }
	 * 
	 * @GetMapping(value = "readById/{name}") public List<Car>
	 * readCar(@PathVariable("name") String name) { return
	 * carRepository.findByuserName(name);
	 * 
	 * }
	 * 
	 * @GetMapping(value = "readAll") public List<Car> readUser() { return
	 * carRepository.;
	 * 
	 * }
	 */
	/*
	 * @GetMapping(value = "readId/{id}") public User readBYUser(@PathVariable("id")
	 * int id) { return carRepository.readById(id);
	 * 
	 * };
	 * 
	 * @PostMapping(value = "create") public User createUser(@RequestBody User user)
	 * {
	 * 
	 * return carRepository.save(user);
	 * 
	 * }
	 * 
	 * @GetMapping(value = "readById/{name}") public List<User>
	 * readUser(@PathVariable("name") String name) { return
	 * carRepository.findByuserName(name);
	 * 
	 * }
	 * 
	 * @GetMapping(value = "readAll") public List<Car> readUser() { return
	 * carRepository.readAllCarss();
	 * 
	 * }
	 * 
	 * @GetMapping(value = "readId/{id}") public User readBYUser(@PathVariable("id")
	 * int carId) { return carRepository.readById(carId);
	 * 
	 * }
	 */
	
	
}
