package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.modal.Country;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Transactional
	public List<Country> getAllCountries() {

		if (countryRepository.findAll() == null)
			return new ArrayList<Country>();

		return countryRepository.findAll();
	}

	@Transactional
	public Country findCountryByCode(String countryCode) {

		Country country = null;
		Optional<Country> optCountry = countryRepository.findById(countryCode);

		if (optCountry.isPresent())
			return optCountry.get();

		return country;
	}

	@Transactional
	public void addCountry(Country country) {

		countryRepository.save(country);

	}

	@Transactional
	public void updateCountry(Country newCountry) {

		Country country = null;
		Optional<Country> optCountry = countryRepository.findById(newCountry.getCode());

		if (optCountry.isPresent())
			country = optCountry.get();

		country.setName(newCountry.getName());

		countryRepository.save(country);
	}

	@Transactional
	public void deleteCountry(String countryCode) {

		Country country = null;
		Optional<Country> optCountry = countryRepository.findById(countryCode);

		if (optCountry.isPresent())
			country = optCountry.get();

		countryRepository.delete(country);

	}

	@Transactional
	public List<Country> search(String countryName) {

		return countryRepository.findByNameContaining(countryName);

	}

	@Transactional
	public List<Country> searchAsc(String countryName) {

		return countryRepository.findByNameContainingOrderByNameAsc(countryName);

	}

	@Transactional
	public List<Country> searchCharacter(Character c) {

		return countryRepository.findByCharacter(c);

	}
}
