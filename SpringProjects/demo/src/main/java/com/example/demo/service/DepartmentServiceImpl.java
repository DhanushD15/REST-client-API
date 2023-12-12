package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.respository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentrepos;
	@Override
	public Department saveDepartment(Department department) {
		return departmentrepos.save(department);
	}
	@Override
	public List<Department> fetchDepartment(){
		return departmentrepos.findAll();
	}
	@Override
	public Department fetchDepartmentById(Long id) {
		return departmentrepos.findById(id).get();
	}
	@Override
	public void deleteDepartmentById(Long id) {
		departmentrepos.deleteById(id); 
	}
	@Override
	public Department updateDepartment(Long id, Department department) {
		Department deptUp=departmentrepos.findById(id).get();
		if(Objects.nonNull(department.getName()) && !"".equalsIgnoreCase(department.getName())) {
			deptUp.setName(department.getName()	);
		}
		if(Objects.nonNull(department.getAddr()) && !"".equalsIgnoreCase(department.getAddr())) {
			deptUp.setName(department.getAddr()	);
		}
		if(Objects.nonNull(department.getCode()) && !"".equalsIgnoreCase(department.getCode())) {
			deptUp.setName(department.getCode()	);
		}
		return departmentrepos.save(deptUp);
	}
	
//	  @Override
//	    public Department fetchDepartmentByName(String name) {
//	        return departmentrepos.findByDepartmentNameIgnoreCase(name);
//	    }
}
