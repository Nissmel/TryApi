package io.nissmel.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List <Topic> getAlleTopics()
	{
		return Arrays.asList
				(
					new Topic("Spring", "Spring Framework", "Spring Frameworks Description"),
					new Topic("Java", "Java IDE", "Java IDE Description"),
					new Topic("Python", "Python IDE", "Python IDE Description"),
					new Topic("C++", "C++ IDE", "C++ IDE Description")	
				);
	}
}
