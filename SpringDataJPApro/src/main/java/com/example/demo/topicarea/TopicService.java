package com.example.demo.topicarea;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;
	
	/*private List<Topic> topics= new ArrayList<>(  Arrays.asList(
			
			new Topic(1, "Python","Pytoh Lang" ),
			new Topic(2, "Ruby","Ruby Lang" ),
			new Topic(3, "Java","Java Lang" )
			));
*/
	public List<Topic> getAllTopics() {
	//	return topics;

		List<Topic> topics=new ArrayList();
		 topicRepository.findAll().
		 forEach(topics::add);
		 return topics;
	}
						
	public Optional<Topic> getTopic(int id) {
		//return topics.stream().filter(t-> t.getId()==id).findFirst().get();
		return topicRepository.findById(id);
	}

	public void addtopics(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);		
	}

	public void updateTopic(int id,Topic topic) {
		
		topicRepository.save(topic);
		
	}

	public void deleteTopic(int id) {		
		topicRepository.deleteById(id);
	}

}
