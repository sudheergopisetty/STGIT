package com.springbootdatajpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdatajpa.model.Department;
import com.springbootdatajpa.repository.DepartmentRepository;

@RestController
@RequestMapping(value = "dept")
public class DepartmentController {
	
	// dependency injection  --- service --- repository 
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@PostMapping(value = "createDept")
	public Department createDepartment(@RequestBody Department department) {
		
		return this.departmentRepository.save(department);
	}
	
	@GetMapping(value = "readOneDept/{departmentId}")
	public Department readByDepartmentId(@PathVariable("departmentId") int departmentId) {
		Department departmentTemp = null;
		Optional<Department> optional = this.departmentRepository.findById(departmentId);
		if(optional.isPresent()) {
			departmentTemp =  optional.get();
		}
		return departmentTemp;
	}

}
