package com.database.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.database.dao.DatabaseService;

@RestController
public class DbController {
	
	@Autowired
	DatabaseService databaseService;
	// cherck whether app is working or not

	@GetMapping("/greeting")
	public String gethello()
	{
		return "hello Kush";
	}
	
	// check whether we are able to connect to MARIADB - HEIDISQL
	@GetMapping("/id")
	public String getAllId()
	{
		return databaseService.getAllId();
	}
}
