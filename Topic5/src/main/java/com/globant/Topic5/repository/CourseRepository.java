package com.globant.Topic5.repository;

import com.globant.Topic5.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    public Course findByName(String courseName);
}
