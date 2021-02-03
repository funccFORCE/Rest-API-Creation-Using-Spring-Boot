package com.sample.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.sample.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
