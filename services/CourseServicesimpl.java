package com.sample.sample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.sample.dao.CourseDao;
import com.sample.sample.entities.Course;

@Service
public class CourseServicesimpl implements CourseService {
	
	@Autowired
	private CourseDao coursedao;
//	List<Course> list;
	
	
	public CourseServicesimpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145,"Java Core Course","This core contains core of java"));
//		list.add(new Course(101,"CSS","Course of CSS"));
	}


	@Override
	public List<Course> getCourses() {
	
		return coursedao.findAll();
	}


	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		coursedao.save(course);
		return (course);
	}

}
