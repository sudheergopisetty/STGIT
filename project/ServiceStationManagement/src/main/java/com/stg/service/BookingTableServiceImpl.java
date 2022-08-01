	package com.stg.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stg.entity.BookingTable;
import com.stg.entity.Car;
import com.stg.entity.Employe;
import com.stg.enumdata.BookingData;
import com.stg.enumdata.ServiceCompleted;
import com.stg.exception.ResourceNotFoundException;
import com.stg.repository.BookingTableRepository;

@Service
public class BookingTableServiceImpl implements BookingTableService{
	
	@Autowired
	private BookingTableRepository bookingTableRepository;
	
	@Autowired
	private EmployeService employeService;
	
	@Autowired
	private CarService carService;

	@Override
	public BookingTable readByBookingId(int bookingId) {
		BookingTable  bookingTable = bookingTableRepository.findById(bookingId).orElseThrow(() -> new ResourceNotFoundException("Booking "+bookingId+" is not avilable or youentered wrong booking "));
		//BookingTable bookingTable = bookingTableRepository.readBookingById(bookingId);
		int carId = bookingTable.getCar2().getCarId();
		bookingTable.setCarId(carId);
			return bookingTable;
			
		
			
	}

	@Override
	public List<BookingTable> readAllBookings() {
		bookingTableRepository.readAllBookings();
		List<BookingTable> bookingTables= bookingTableRepository.findAll();
		for (BookingTable bookingTable : bookingTables) {
			int carId= bookingTable.getCar2().getCarId();
			bookingTable.setCarId(carId);
		}
		return bookingTables;
	}

	@Override
	public BookingTable createBooking(BookingTable booking,int UserId,int carId) {
		Employe user = employeService.readByEmployeId(UserId);
		booking.setUser1(user);
		booking.setWorking(ServiceCompleted.WorkInProgress);
		booking.setStatus(BookingData.Success);
		Car car = carService.readCarById(carId);
		booking.setCar2(car);
		return bookingTableRepository.save(booking);
	}

	@Override
	public BookingTable updateBookingDate(BookingTable booking, int bookingId,int UserId) {
		BookingTable bookingTable = this.readByBookingId(bookingId);
		Employe user = employeService.readByEmployeId(UserId);
		bookingTable.setServiceBookingDate(booking.getServiceBookingDate());
		bookingTable.setUser1(user);
		return bookingTable;
	}

	@Override
	public String CancelBooking(int bookingId) {
		BookingTable booking = this.readByBookingId(bookingId);
		booking.setStatus(BookingData.Cancelled);
		bookingTableRepository.save(booking);
		return "Cancelled";
		
	}

	@Override
	public List<BookingTable> readBookingsByDate(String bookingDate) {
		
		return bookingTableRepository.readBookingBYBookingDate(bookingDate);
	}

	@Override
	public List<BookingTable> readBookingByUserId(int userId) throws ResourceNotFoundException {
		List<BookingTable> bookingTable = bookingTableRepository.readUsingUserId(userId);
		for (BookingTable bookingTable2 : bookingTable) {
			int bookId = bookingTable2.getBookingId();
			BookingTable innerBook = this.readByBookingId(bookId);
			bookingTable2.setCarId(innerBook.getCarId());
		}
		
		if(bookingTable != null) {
			return bookingTable;
		}else {
			throw new ResourceNotFoundException("Booking "+userId+" is not avilable or youentered wrong user "+userId);
		}
	}

	@Override
	public List<BookingTable> readBookingByCar(int carId) throws ResourceNotFoundException {
		
		return bookingTableRepository.readUsingCarId(carId);
	}

	
	
	
	

}
