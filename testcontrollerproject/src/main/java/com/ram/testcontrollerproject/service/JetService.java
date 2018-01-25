package com.ram.testcontrollerproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.testcontrollerproject.dao.DataRepo;

@Service
public class JetService {
	
	@Autowired
	private DataRepo dataRepo;
	
	public String getJet() {
		return dataRepo.getResult();
	}

}
