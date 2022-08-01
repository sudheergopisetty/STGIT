package com.stg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.entity.Car;
import com.stg.entity.Employe;
import com.stg.exception.ResourceNotFoundException;
import com.stg.repository.CarRepository;
import com.stg.repository.EmployeRepository;

@Service
public class CarServiceImpl implements CarService{
	
	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private EmployeRepository employeRepository;

	@Autowired
	private EmployeService employeService;
	@Override
	public Car createCar(Car car,int userId) {
		Employe user= employeRepository.findById(userId).get();
		car.setUser(user);;
		return carRepository.save(car);
	}

	@Override
	public List<Car> readAllCars() {
		
		return carRepository.readAllCarss();
	}

	@Override
	public Car readCarById(int carId) {
		Car car = carRepository.findById(carId).get();
		if(car != null) {
			return car;
		}
	throw new ResourceNotFoundException("car id :" + carId+" not found");
	}

	@Override
	public Car updatecarById(Car car, int carId) {
		Car newCar = this.readCarById(carId);
	
		newCar.setCarBrand(car.getCarBrand());
		newCar.setCarColor(car.getCarColor());
		newCar.setCarModel(car.getCarModel());
		newCar.setCarModelYear(car.getCarModelYear());
		newCar.setCarNumberPlate(car.getCarNumberPlate());
		newCar.setCarTravelledKiloMeters(car.getCarTravelledKiloMeters());
		carRepository.save(newCar);
		return newCar;
	}

	@Override
	public String deletecarById(int carId) {
		Car car = this.readCarById(carId);
		if(car != null) {
			carRepository.deleteCar(carId);
			return "successfully deleted";
		}
		else {
			throw new ResourceNotFoundException("car is not avilable");
		}
		
	}

	@Override
	public List<Car> readCarByBrandName(String carBrand) throws ResourceNotFoundException {
		List<Car> car = carRepository.readCarByBrand(carBrand);
		if(car != null) {
			return car;
		}
	throw new ResourceNotFoundException("car brand :" + carBrand+" not found");
	}

	@Override
	public Car updateCarByBrandName(Car car, String carName, String userName) throws ResourceNotFoundException {
		List<Car> newCar = this.readCarByBrandName(carName);
	    Employe user = employeService.readEmployeByName(userName);
		Car presentCar = null;
		for (Car car2 : newCar) {
			if(car2.getUser().getUserName().equalsIgnoreCase(user.getUserName())) {
				user = (Employe) car2.getUser();
				presentCar = car2;
			}else {
				throw new ResourceNotFoundException("no user found with the " + userName);
			}
		}
		presentCar.setCarBrand(car.getCarBrand());
		presentCar.setCarColor(car.getCarColor());
		presentCar.setCarModel(car.getCarModel());
		presentCar.setCarModelYear(car.getCarModelYear());
		presentCar.setCarNumberPlate(car.getCarNumberPlate());
		presentCar.setCarTravelledKiloMeters(car.getCarTravelledKiloMeters());
		presentCar.setUser(user);;
		return presentCar;
	}

	@Override
	public int deletecarByBrandName(String carName) throws ResourceNotFoundException {
		return 0;
	}

	@Override
	public List<Car> readCarByName(String carName) throws ResourceNotFoundException {
		List<Car> car = carRepository.readCarByName(carName);
		if(car != null) {
			return car;
		}
	throw new ResourceNotFoundException("car name :" + carName+" not found");
	}

	@Override
	public Car updateCarByName(Car car, String carName, String userName) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deletecarByName(String carName) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Car> readCarByUser(int userId) throws ResourceNotFoundException {
		
		return carRepository.readByUserId(userId);
	}

}
