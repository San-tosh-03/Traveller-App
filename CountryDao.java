package com.traveller.Traveller.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.traveller.Traveller.entity.Country;
import com.traveller.Traveller.entity.Place;
import com.traveller.Traveller.entity.Traveller;
import com.traveller.Traveller.repository.CountryRepository;

@Repository
public class CountryDao {
	@Autowired
	private CountryRepository repository;
	
	public Country saveCountry(Country country) {
		if(country.getPlaces() != null) {
			for(Place place : country.getPlaces()) {
				//set country to the places
				place.setCountry(country);
			}
		}
		//save country
		return repository.save(country); 
	}
	
	
	public Country getCountryById(int id) {
		
		Optional<Country> optional=repository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
		
		
	}
		
	

}