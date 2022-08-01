package com.stg.service;

import java.util.List;

import com.stg.entity.BookingTable;
import com.stg.exception.ResourceNotFoundException;

public interface BookingTableService {
	
	public abstract BookingTable readByBookingId(int bookingId) throws ResourceNotFoundException;
	public abstract List<BookingTable> readBookingByUserId(int userId) throws ResourceNotFoundException;
	public abstract List<BookingTable> readBookingByCar(int carId) throws ResourceNotFoundException;
	public abstract List<BookingTable> readAllBookings();
	public abstract BookingTable createBooking(BookingTable booking,int UserId,int carId);
	public abstract BookingTable updateBookingDate(BookingTable booking,int bookingId, int UserId) throws ResourceNotFoundException;
	public abstract String CancelBooking(int bookingId);
	public abstract List<BookingTable> readBookingsByDate(String bookingDate)throws ResourceNotFoundException;

}
