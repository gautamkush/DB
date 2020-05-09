package com.database.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.database.database.entity.Test;
import com.database.database.repository.TestRepository;

@Repository
public class DatabaseDao {
	
	@Autowired
	TestRepository testRepository;
	
	public String getAllId()
	{
		List<Test> t= testRepository.findAll();
		return t.get(0).getId().toString();
	}
	
}
