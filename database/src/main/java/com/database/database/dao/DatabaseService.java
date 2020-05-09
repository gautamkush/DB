package com.database.database.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.database.service.DatabaseDao;

@Service
public class DatabaseService {
	
	@Autowired
	DatabaseDao databaseDao;
	
	public String getAllId()
	{
		return databaseDao.getAllId();
	}
}
