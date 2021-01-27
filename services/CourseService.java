package com.sample.sample.services;

import java.util.List;

import com.sample.sample.entities.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course addCourse(Course course);      
}
 