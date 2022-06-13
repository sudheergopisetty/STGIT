package com.springbootdatajpa.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.springbootdatajpa.model.Department;
@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {  //, PagingAndSortingRepository<T, ID> , JpaRepository<T, ID>
	

}
