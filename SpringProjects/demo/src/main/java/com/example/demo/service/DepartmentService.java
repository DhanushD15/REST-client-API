package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;
public interface DepartmentService {
	public Department saveDepartment(Department department);

	public List<Department> fetchDepartment();

	public Department fetchDepartmentById(Long id);

	public void deleteDepartmentById(Long id);

	public Department updateDepartment(Long id, Department department);

//	Department fetchDepartmentByName(String name);

}
