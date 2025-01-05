package com.traveller.Traveller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traveller.Traveller.entity.Country;

public interface CountryRepository extends JpaRepository<Country,Integer> {

}
