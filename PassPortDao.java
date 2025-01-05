package com.traveller.Traveller.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.traveller.Traveller.entity.PassPort;
import com.traveller.Traveller.entity.Traveller;
import com.traveller.Traveller.repository.PassPortRepository;

@Repository

public class PassPortDao {
	@Autowired
	PassPortRepository dao;
	
	public PassPort savePassPort(PassPort passPort) {
		return dao.save(passPort);
		
	}
	
	

	

}
