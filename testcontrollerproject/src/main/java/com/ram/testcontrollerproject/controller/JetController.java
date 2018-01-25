package com.ram.testcontrollerproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.testcontrollerproject.service.JetService;


@RestController
@RequestMapping("/jet")
public class JetController {
	
	@Autowired
	private JetService jetService;
	
	@GetMapping("/type")
	public String getJetType() {
		//return "Ram Jet";
		return jetService.getJet();
	}
	
}
