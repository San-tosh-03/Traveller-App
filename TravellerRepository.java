package com.traveller.Traveller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traveller.Traveller.entity.Traveller;

public interface TravellerRepository extends JpaRepository<Traveller,Integer> {
	

  Traveller findByPhoneNumberAndPassword(long phoneNumber,String password);
  Traveller findByPhoneNumber(long phoneNumber);
  Traveller findByEmail(String email);
	

}
