package com.traveller.Traveller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.traveller.Traveller.dao.CountryDao;
import com.traveller.Traveller.dao.PassPortDao;
import com.traveller.Traveller.dao.PlaceDao;
import com.traveller.Traveller.dao.TravellrDao;
import com.traveller.Traveller.entity.Traveller;

@RestController
public class TravellerController {
	@Autowired
	TravellrDao dao;
	@PostMapping("/traveller")
	public String saveTraveller(@RequestBody Traveller traveller) {
		dao.saveTraveller(traveller);
	
	return "saved";
	}
	@GetMapping("/getTraveller/{id}")
	public Traveller getTravellerById(@PathVariable int id) {
		return dao.getTravellerById(id);
	}
	@PostMapping("/getByPhoneAndEmail/{phoneNumber}/{password}")
	public Traveller getByphoneNumber(@PathVariable long phoneNumber,@PathVariable String password) {
		return dao.findTravellerByPhoneNumberAndPassword(phoneNumber, password);
	}
	


	

}
