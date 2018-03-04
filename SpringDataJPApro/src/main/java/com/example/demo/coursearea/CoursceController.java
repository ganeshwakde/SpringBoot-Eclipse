package com.example.demo.coursearea;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.topicarea.Topic;
import com.example.demo.topicarea.TopicService;

@RestController
public class CoursceController {

	@Autowired
	private CourseService coursservice;
	
	@RequestMapping("/topics/{topicid}/courses")   
	public List<Course> getAllcourses(@PathVariable int id) {
		
		return coursservice.getAllcourses(id); 	

	}

	@RequestMapping("/topics/{topicid}/courses/{id}")
	public Optional<Course> gettopic(@PathVariable  int id) {
		
		return coursservice.getcourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicid}/courses")
	public void addCourse(@RequestBody Course course,@PathVariable  Integer topicid) {
		
		course.setTopic(new Topic(topicid, " ", " "));
		
		coursservice.addcourses(course);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="topics/{topicid}/courses/{id}")
	public void  updaCourse(@RequestBody Course course,@PathVariable int id,@PathVariable  int topicid) {
		
		course.setTopic(new Topic(topicid, "", ""));
		coursservice.updatecourse(id, course);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="topics/{topicid}/courses/{id}")
	public void deleteCourse(@PathVariable int id) {
		
		coursservice.deleteCourse(id);
		
	}
	
	
	
	
	
}
