package com.example.demo.topic;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Integer> {

	
	@Query("FROM Topic WHERE name=?1")
	Topic findByName(String name);
	
}
	