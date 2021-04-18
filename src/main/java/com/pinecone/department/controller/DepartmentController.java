package com.pinecone.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinecone.department.entity.Department;
import com.pinecone.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department createDepartment(@RequestBody Department department) {
		log.info("createDepartment called with department {}",department);
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") Long departmentId) {
		log.info("getDepartmentById called with departmentId {}",departmentId);
		return departmentService.getDepartmentByDepartmentId(departmentId);
	}
	
	@GetMapping("/")
	public List<Department> getAllDepartments(){
		log.info("getAllDepartments called");
		return departmentService.getDepartments();
	}
}
