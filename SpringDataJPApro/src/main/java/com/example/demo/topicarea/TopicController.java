package com.example.demo.topicarea;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")   //http://localhost:8082/topics
	public List<Topic> getTopics() {
		
		return topicservice.getAllTopics(); 	

	}

	@RequestMapping("/topics/{id}")
	public Optional<Topic> gettopic(@PathVariable  int id) {
		
		return topicservice.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addtopic(@RequestBody Topic topic) {
		
		topicservice.addtopics(topic);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void  updaTopic(@RequestBody Topic topic,@PathVariable int id) {
		
		topicservice.updateTopic(id, topic);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deletetopic(@PathVariable int id) {
		
		topicservice.deleteTopic(id);
		
	}
	
	
	

}
