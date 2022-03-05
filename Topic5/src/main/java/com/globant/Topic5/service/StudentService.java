package com.globant.Topic5.service;


import com.globant.Topic5.entity.DTO.StudentDto;

import java.util.List;

public interface StudentService {
    public StudentDto addStudent(StudentDto studentDto);
    public List<StudentDto> getAllStudents();
    public StudentDto updateStudent(Integer studentId, StudentDto student);
    public String deleteStudent(Integer studentId);
    public StudentDto addCourseToStudentById(Integer studentId, StudentDto studentDto, Integer courseId);
    public StudentDto removeCourseToStudentById(Integer studentId, StudentDto studentDto, Integer courseId);
}

