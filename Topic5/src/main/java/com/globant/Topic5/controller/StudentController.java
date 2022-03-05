package com.globant.Topic5.controller;

import com.globant.Topic5.entity.DTO.StudentDto;
import com.globant.Topic5.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        List<StudentDto> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @PostMapping("/student")
    public ResponseEntity<StudentDto> addStudent(@RequestBody StudentDto studentDto) {
        StudentDto std = studentService.addStudent(studentDto);
        return new ResponseEntity<>(std, HttpStatus.CREATED);
    }
    @PutMapping("/student/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable(name = "id") Integer id,
                                                    @RequestBody StudentDto student) {
        StudentDto std = studentService.updateStudent(id, student);
        return new ResponseEntity<>(std, HttpStatus.CREATED);
    }

    @PutMapping("/student/{studentId}/course/{courseId}")
    public ResponseEntity<StudentDto> addCourseToStudent(@PathVariable(name = "studentId") Integer studentId,
                                                         @PathVariable(name = "courseId") Integer courseId,
                                                         @RequestBody StudentDto student){
        StudentDto studentDto = studentService.addCourseToStudentById(studentId, student,courseId);
        return new ResponseEntity<>(studentDto, HttpStatus.OK);
    }

    @DeleteMapping("/student/{studentId}/course/{courseId}")
    public ResponseEntity<StudentDto> removeCourseToStudent(@PathVariable(name = "studentId") Integer studentId,
                                                         @PathVariable(name = "courseId") Integer courseId,
                                                         @RequestBody StudentDto student){
        StudentDto studentDto = studentService.removeCourseToStudentById(studentId, student,courseId);
        return new ResponseEntity<>(studentDto, HttpStatus.OK);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable(name = "id") Integer studentId) {
        String message = studentService.deleteStudent(studentId);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
