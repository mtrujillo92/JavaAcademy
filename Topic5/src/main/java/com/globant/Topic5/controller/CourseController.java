package com.globant.Topic5.controller;

import com.globant.Topic5.entity.DTO.CourseDto;
import com.globant.Topic5.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public ResponseEntity<List<CourseDto>> getAllCourses() {
        List<CourseDto> students = courseService.getAllCourses();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping("/course")
    public ResponseEntity<CourseDto> addCourse(@RequestBody CourseDto courseDto) {
        CourseDto std = courseService.addCourse(courseDto);
        return new ResponseEntity<>(std, HttpStatus.CREATED);
    }

    @PutMapping("/course/{id}")
    public ResponseEntity<CourseDto> updateCourse(@PathVariable(name = "id") Integer id,
                                                  @RequestBody CourseDto course) {
        CourseDto crs = courseService.updateCourse(id, course);
        return new ResponseEntity<>(crs, HttpStatus.CREATED);
    }

    @DeleteMapping("/course/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable(name = "id") Integer id) {
        String message = courseService.deleteCourse(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
