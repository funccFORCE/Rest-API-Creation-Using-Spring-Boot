package com.sample.sample.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sample.sample.entities.Course;

@Service
public class CourseServicesimpl implements CourseService {
	List<Course> list;
	
	
	public CourseServicesimpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"Java Core Course","This core contains core of java"));
		list.add(new Course(101,"CSS","Course of CSS"));
	}


	@Override
	public List<Course> getCourses() {
	
		return list;
	}


	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return (course);
	}

}
