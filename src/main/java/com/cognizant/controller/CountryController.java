package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.service.CountryService;

@Controller
public class CountryController {
	@Autowired
	CountryService countryService;

	@RequestMapping("/")
	public void get() {
		System.out.println(countryService.search("ind"));
		System.out.println(countryService.searchAsc("ind"));
		System.out.println(countryService.searchCharacter('I'));
	}
}
