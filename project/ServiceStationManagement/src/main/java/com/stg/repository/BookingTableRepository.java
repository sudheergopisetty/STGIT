package com.stg.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.stg.entity.BookingTable;

public interface BookingTableRepository extends JpaRepository<BookingTable, Integer>{

	@Query(value = "SELECT * FROM booking_table;", nativeQuery = true)
	public abstract List<BookingTable> readAllBookings();

	//public abstract Mechanic findById(int MechanicId);

	@Query(value = "SELECT * FROM booking_table as s WHERE s.booking_id= :status ;", nativeQuery = true)
	public abstract BookingTable readBookingById(@Param("status") int bookingId);
	
	@Query(value = "SELECT * FROM booking_table as s WHERE s.employe_id= :status ;", nativeQuery = true)
	public abstract List<BookingTable> readUsingUserId(@Param("status") int userId);
	
	@Query(value = "SELECT * FROM booking_table as s WHERE s.car_id= :status ;", nativeQuery = true)
	public abstract List<BookingTable> readUsingCarId(@Param("status") int userId);
	
	@Query(value = "SELECT * FROM booking_table as s WHERE s.booking_date= :status ;", nativeQuery = true)
	public abstract List<BookingTable> readBookingBYBookingDate(@Param("status") String bookingDate);
	
	@Transactional
	@Modifying
	@Query(value = " DELETE FROM booking_table e WHERE e.booking_id = :id ", nativeQuery = true)
	public abstract int deleteBookingTable(@Param("id") int bookingId);
}
