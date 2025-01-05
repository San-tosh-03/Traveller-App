package com.traveller.Traveller.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.traveller.Traveller.entity.Place;
import com.traveller.Traveller.repository.PlaceRepository;

@Repository
public class PlaceDao {
	@Autowired
	PlaceRepository repository;
	
	public Place savePlace(Place place) {
		
		return repository.save(place);
	}
	public Place getPlaceById(int id) {
		Optional<Place> optional=repository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
		
	}

	

}
