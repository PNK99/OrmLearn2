package com.cognizant.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.modal.Skill;

@Service
public class SkillService {

	@Autowired
	private SkillRepository skillRepository;

	@Transactional
	public void save(Skill skill) {

		skillRepository.save(skill);

	}

	@Transactional
	public Skill get(Integer skillId) {

		return skillRepository.findById(skillId).get();

	}

}
