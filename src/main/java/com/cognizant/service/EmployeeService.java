package com.cognizant.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.modal.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Transactional
	public void save(Employee employee) {

		employeeRepository.save(employee);

	}

	@Transactional
	public Employee get(Integer employeeId) {

		return employeeRepository.findById(employeeId).get();

	}

}
