package com.traveller.Traveller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.traveller.Traveller.dao.PlaceDao;
import com.traveller.Traveller.entity.Place;

@RestController
public class PlaceController {
	@Autowired
	PlaceDao dao;
	@PostMapping("/savePlace")
	public String savePlace(@RequestBody Place place) {
		dao.savePlace(place);
		return "place is created";
		
	}
	
	@GetMapping("/getPlaceById/{id}")
	public Place getPlaceById(@PathVariable int id) {
		return dao.getPlaceById(id);
		
	}

}
