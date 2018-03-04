package com.example.demo.coursearea;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,Integer> {

	
	public List<Course> findByTopicId(Integer topicid);
}
