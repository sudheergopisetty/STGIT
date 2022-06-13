package com.springbootdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootdatajpa.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	
	public abstract List<User> findByuserName(String name);
	

}
