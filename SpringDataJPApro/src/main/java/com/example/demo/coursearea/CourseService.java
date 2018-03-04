package com.example.demo.coursearea;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.topicarea.Topic;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	
	public List<Course> getAllcourses(Integer topicId) {

		List<Course> courses=new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
	
		return courses;
	}

	public Optional<Course> getcourse(int id) {
		
		
		return courseRepository.findById(id);
	}

	public void addcourses(Course course) {
		
		courseRepository.save(course);
		
	}

	public void updatecourse(int id, Course course) {
		
		courseRepository.save(course);
	}

	public void deleteCourse(int id) {
		
		courseRepository.deleteById(id);
	}

	

}
