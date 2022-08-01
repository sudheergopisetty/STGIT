
package com.stg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stg.entity.Car;
import com.stg.service.CarService;
@CrossOrigin(value = "http://localhost:4200/")
@RestController
@RequestMapping(value = "car")
public class CarController {

	@Autowired
	private CarService carService;;

	@GetMapping(value = "allCar")
	public ResponseEntity<List<Car>> allCars() {
		ResponseEntity<List<Car>> cars = new ResponseEntity<List<Car>>(carService.readAllCars(), HttpStatus.ACCEPTED);

		return cars;
	}

	@PostMapping(value = "createCar/{user_id}")
	public ResponseEntity<Car> createCar(@RequestBody Car car,@PathVariable(value="user_id") int userId) {
		Car car2= carService.createCar(car,userId);
		ResponseEntity<Car> newCar = new ResponseEntity<Car>(car2, HttpStatus.CREATED);
		return newCar;

	}
	
	@GetMapping(value = "readCarByBrand/{brand}")
	public ResponseEntity<List<Car>> readCarByBrandName(@PathVariable(value = "brand") String brand) {
		ResponseEntity<List<Car>> cars = new ResponseEntity<List<Car>>(carService.readCarByBrandName(brand), HttpStatus.ACCEPTED);

		return cars;
	}
	
	@DeleteMapping(value="deleteByUsingId/{id}")
	public ResponseEntity<String> deleteById(@PathVariable(value = "id") int userId){
		ResponseEntity<String> user = new ResponseEntity<>(carService.deletecarById(userId),HttpStatus.OK);
		
		return user;
	}
	
	@GetMapping(value = "readCarUserId/{userId}")
	public ResponseEntity<List<Car>> readCarByuser(@PathVariable(value = "userId") int userId) {
		ResponseEntity<List<Car>> cars = new ResponseEntity<List<Car>>(carService.readCarByUser(userId), HttpStatus.ACCEPTED);

		return cars;
	}
	
	@GetMapping(value = "readCarId/{carId}")
	public ResponseEntity<Car> readCar(@PathVariable(value = "carId") int carId) {
		ResponseEntity<Car> cars = new ResponseEntity<Car>(carService.readCarById(carId), HttpStatus.ACCEPTED);

		return cars;
	}
	
	@PutMapping(value="updateCar/{carId}")
	public ResponseEntity<Car> updateCarByCarId(@PathVariable(value="carId") int carId, @RequestBody Car car){
		ResponseEntity<Car> car1 = new ResponseEntity<Car>(carService.updatecarById(car, carId),HttpStatus.ACCEPTED);
		
		return car1;
	}
}
