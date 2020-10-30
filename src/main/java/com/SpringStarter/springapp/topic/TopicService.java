package com.SpringStarter.springapp.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;


    public List<Topics> getAllTopics(){
        List<Topics> course = new ArrayList<>();
        topicRepository.findAll()
                .forEach(course::add);
        return course;
    }

    public Topics getTopic(String id){
        //return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    return topicRepository.findById(id).get();
    }

    public void addTopic(Topics topics) {
        topicRepository.save(topics);
    }

    public void updateTopic(String id, Topics topics) {
      topicRepository.save(topics);
         }



    public void deleteTopic(String id) {
    topicRepository.deleteById(id);
    }
}


