package com.cognizant.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.modal.Department;



@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{}
