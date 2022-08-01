package com.stg.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stg.service.BookingTableService;
import com.stg.entity.BookingTable;

@CrossOrigin(value = "http://localhost:4200/")
@RestController
@RequestMapping(value = "booking")
public class BookingTableController {
	
	@Autowired
	private BookingTableService bookingTableService;

	@GetMapping(value = "allBookings")
	public ResponseEntity<List<BookingTable>> allBookings() {
		ResponseEntity<List<BookingTable>> cars = new ResponseEntity<List<BookingTable>>(bookingTableService.readAllBookings(), HttpStatus.ACCEPTED);

		return cars;
	}

	@PostMapping(value = "createBooking/{userId}/{carId}")
	public ResponseEntity<BookingTable> createBooking(@RequestBody BookingTable booking,@PathVariable(value ="userId")int userId,@PathVariable(value ="carId")int carId) {
		ResponseEntity<BookingTable> newCar = new ResponseEntity<BookingTable>(bookingTableService.createBooking(booking,userId,carId), HttpStatus.CREATED);
		return newCar;

	}			
	
	@GetMapping(value = "readByBookingId/{id}")
	public ResponseEntity<BookingTable> readBookingById(@PathVariable(value = "id") int bookingId) {
		ResponseEntity<BookingTable> bookingss = new ResponseEntity<BookingTable>(bookingTableService.readByBookingId(bookingId), HttpStatus.ACCEPTED);

		return bookingss;
	}
	
	@GetMapping(value="CancelByUsingId/{id}")
	public ResponseEntity<Map<String, String>> deleteById(@PathVariable(value = "id") int id){
		bookingTableService.CancelBooking(id);
		Map<String, String> map = new HashMap<String, String>();
		map.put("Status","Canceled");
		ResponseEntity<Map<String, String>> booking = new ResponseEntity<Map<String, String>>(map,HttpStatus.OK);
		
		return booking;
	}
	
	@PutMapping(value="updateUsingId/{id}/{userId}")
	public ResponseEntity<BookingTable> updateById(@RequestBody BookingTable booking,@PathVariable(value = "id") int Id,@PathVariable(value = "userId") int userId){
		ResponseEntity<BookingTable> booking1 = new ResponseEntity<>(bookingTableService.updateBookingDate(booking,Id,userId),HttpStatus.FOUND);
		
		return booking1;
	}
	
	@GetMapping(value = "readByUserId/{id}")
	public ResponseEntity<List<BookingTable>> readBookingByUserId(@PathVariable(value = "id") int userId) {
		ResponseEntity<List<BookingTable>> bookings = new ResponseEntity<>(bookingTableService.readBookingByUserId(userId), HttpStatus.ACCEPTED);

		return bookings;
	}
	
	@GetMapping(value = "readByCarId/{id}")
	public ResponseEntity<List<BookingTable>> readBookingByCarId(@PathVariable(value = "id") int carId) {
		ResponseEntity<List<BookingTable>> bookings = new ResponseEntity<>(bookingTableService.readBookingByCar(carId), HttpStatus.ACCEPTED);

		return bookings;
	}
}
