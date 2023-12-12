package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Department;
@SpringBootTest
class DepartmentServiceTest {

	
	private DepartmentService deptService;
	@BeforeEach
	void setUp() throws Exception {
	}

//	public void whenValidDeptName_thenDeptFound() {
//		String deptName="IT";
//		Department found=deptService.fetchDepartmentByName(deptName);
//        assertEquals(deptName, found.getName());
//
//	}

}
