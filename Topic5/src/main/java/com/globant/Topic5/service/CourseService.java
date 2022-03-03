package com.globant.Topic5.service;

import com.globant.Topic5.entity.DTO.CourseDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {
    public CourseDto updateCourse(Integer id, CourseDto courseDto);
    public String deleteCourse(Integer id);
    public CourseDto addCourse(CourseDto courseDto);
    public List<CourseDto> getAllCourses();
}
