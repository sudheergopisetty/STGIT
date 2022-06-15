package com.stg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stg.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public abstract List<User> findByuserName(String name);

	@Query(value = "SELECT * FROM user;", nativeQuery = true)
	public abstract List<User> readAllUsers();

	@Query(value = "SELECT * FROM user as s WHERE s.user_id= :status ;", nativeQuery = true)
	public abstract User readById(@Param("status") int userId);
}
