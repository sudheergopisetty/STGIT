package com.stg.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.stg.entity.Employe;

@Repository
@Transactional
public interface EmployeRepository extends JpaRepository<Employe, Integer> {

	@Query(value = "SELECT * FROM Employe as s WHERE s.employe_type != 0;", nativeQuery = true)
	public abstract List<Employe> readAllEmployes();

	//public abstract Employe findById(int EmployeId);

	@Query(value = "SELECT * FROM Employe as s WHERE s.employe_id= :status ;", nativeQuery = true)
	public abstract Employe readEmploye(@Param("status") int EmployeId);
	
	@Query(value = "SELECT * FROM Employe as s WHERE s.employe_type= :status ;", nativeQuery = true)
	public abstract List<Employe> readEmployeType(@Param("status") int employeType);
	
	@Query(value = "SELECT * FROM Employe as s WHERE s.employe_type=0 ;", nativeQuery = true)
	public abstract List<Employe> readUsers(@Param("status") int employeType);
	
	@Modifying
	@Query(value = " DELETE FROM Employe e WHERE e.employe_id = :id ", nativeQuery = true)
	public abstract int deleteEmploye(@Param("id") int EmployeId);

	public abstract Employe findByUserName(String userName);

	
}
