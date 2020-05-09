package com.database.database.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.database.database.entity.Test;

public interface TestRepository extends CrudRepository<Test, Integer>{
	List<Test> findAll();
}
