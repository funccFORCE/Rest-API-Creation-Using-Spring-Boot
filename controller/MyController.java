package com.sample.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.sample.entities.Course;
import com.sample.sample.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseservice;
	
	@GetMapping("/home")
	public String home() {
		
		return "this is home page";
	}
	//get the courses
	
	@GetMapping("/courses") 
	public List<Course> getCourses()
	{
		return this.courseservice.getCourses();
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseservice.addCourse(course);
	}
	
}
