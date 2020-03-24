package com.cognizant.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.modal.Department;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Transactional
	public void save(Department department) {

		departmentRepository.save(department);

	}

	@Transactional
	public Department get(Integer departmentId) {

		return departmentRepository.findById(departmentId).get();

	}

}
