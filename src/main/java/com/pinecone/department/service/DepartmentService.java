package com.pinecone.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.pinecone.department.entity.Department;
import com.pinecone.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(@RequestBody Department department) {
		log.info("saveDepartment called with department {}",department);
		return departmentRepository.save(department);
	}

	public Department getDepartmentByDepartmentId(Long departmentId) {
		log.info("getDepartmentByDepartmentId called with departmentId {}",departmentId);
		return departmentRepository.findDepartmentByDepartmentId(departmentId);
	}

	public List<Department> getDepartments() {
		log.info("getDepartments called");
		return departmentRepository.findAll();
	}
	
}
