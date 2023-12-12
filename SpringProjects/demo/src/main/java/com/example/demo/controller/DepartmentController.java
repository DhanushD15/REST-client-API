package com.example.demo.controller;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService deptservice;
	private final org.slf4j.Logger logger=LoggerFactory.getLogger(DepartmentController.class); //For logging information
	
	@PostMapping("/department")
	public Department saveDepartment(@RequestBody Department department) {
		logger.info("Inside department controller");
		return deptservice.saveDepartment(department);
	}
	
	@GetMapping("/department")
	public List<Department> fetchDepartment(){
		return deptservice.fetchDepartment();
	}
	
	@GetMapping("/department/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long id) {
		return deptservice.fetchDepartmentById(id);
	}
	
	@DeleteMapping("/department/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long id) {
		deptservice.deleteDepartmentById(id);
		return "Department selected deleted";
	}
	
	@PutMapping("/department/{id}")
	public Department updateDepartment(@PathVariable("id") Long id,@RequestBody Department department ) {
		return deptservice.updateDepartment(id,department);
	}
}
