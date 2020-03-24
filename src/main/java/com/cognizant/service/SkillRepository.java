package com.cognizant.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.modal.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {}
