//package com.traveller.Traveller.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import com.traveller.Traveller.dao.TravellrDao;
//import com.traveller.Traveller.dto.ResponceStructure;
//import com.traveller.Traveller.entity.Traveller;
//
//@Service
//public class TravellerServices {
//	@Autowired
//	private TravellrDao dao;
//	public ResponseEntity<ResponceStructure <Traveller>> saveTraveller(Traveller traveller){
//		Traveller returnTraveller=dao.saveTraveller(traveller);
//		ResponceStructure<Traveller> structure=new ResponceStructure<Traveller>();
//		structure.setStatusCode(HttpStatus.CREATED.value());
//		structure.setMessage(null);
//		
//		
//	}
//	
//
//}
