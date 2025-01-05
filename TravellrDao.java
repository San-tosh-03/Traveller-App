package com.traveller.Traveller.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.traveller.Traveller.entity.Country;
import com.traveller.Traveller.entity.Traveller;
import com.traveller.Traveller.repository.PassPortRepository;
import com.traveller.Traveller.repository.PlaceRepository;
import com.traveller.Traveller.repository.TravellerRepository;
import com.traveller.Traveller.services.EmailSenderService;

@Repository
public class TravellrDao {
	@Autowired
	TravellerRepository repository;
	
	@Autowired
	PassPortRepository repositoryPassPort;
	
	@Autowired
	CountryDao countryDao;
	@Autowired
	private EmailSenderService mailSenderService;
	
	@Autowired
	PlaceRepository repositoryPlace;
	
	public String  saveTraveller(Traveller traveller) {
		
	List<Country> countries =traveller.getContries();
	if(countries != null) {
		for(Country country:countries) {
			countryDao.saveCountry(country);
		}
		
	}
	
	
	  Traveller saveTraveller=repository.save(traveller);
	  String subject="Welcome to the Traveller App";
	  String body=String.format("Dear %s,\n\nThank you for registering with us .\n\nBest Regards,\nTraveller App Team", saveTraveller.getName());
	  mailSenderService.sendEmail(saveTraveller.getEmail(), subject, body);
	  return  "Saved";
		
		
		
	}
	public Traveller getTravellerById(int id) {
		
		Optional<Traveller> optional=repository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
		
	}
	
	
	public Traveller findTravellerByPhoneNumberAndPassword(long phoneNumber,String password) {
		 return  repository.findByPhoneNumberAndPassword(phoneNumber, password);
	}
	
	
	}

	  

	


