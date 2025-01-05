package com.traveller.Traveller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.traveller.Traveller.dao.CountryDao;
import com.traveller.Traveller.entity.Country;

@RestController
public class CountryController {
	@Autowired
	CountryDao dao;
	@PostMapping("/saveCountry")
	public String saveCountry(@RequestBody Country country) {
		dao.saveCountry(country);
		return "added country";
	}
	@GetMapping("getCountryById/{id}")
	public Country getCountry(@PathVariable int id) {
		return dao.getCountryById(id);
	}
	

}
