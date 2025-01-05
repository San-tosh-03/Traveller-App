package com.traveller.Traveller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.traveller.Traveller.dao.PassPortDao;
import com.traveller.Traveller.entity.PassPort;
import com.traveller.Traveller.entity.Traveller;

@RestController

public class PassPortController {
	@Autowired
	PassPortDao dao;
	@PostMapping("/savePassPort")
	public String savePassPort(@RequestBody PassPort passPort ) {
		dao.savePassPort(passPort);
		return "passport created";
	}
	
	

}
