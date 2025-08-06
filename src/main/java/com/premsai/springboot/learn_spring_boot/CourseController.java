package com.premsai.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS","Prof. FangYuan"),
				new Course(2, "Learn DevOps","Prof. Bai Ning Bing"),
				new Course(3, "Learn Azure","Prof. Tang")
				);
	}
	
}
