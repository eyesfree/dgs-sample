package com.zeiss.kvc.inventory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TasksProjectRepository extends MongoRepository<TasksProject, String>{

	@Query(value = "{ 'name' : ?0 }")
	TasksProject findByName(String name);

	List<TasksProject> findAll();
}
