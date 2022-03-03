package com.globant.Topic5.service;

import com.globant.Topic5.entity.Course;
import com.globant.Topic5.entity.DTO.StudentDto;
import com.globant.Topic5.entity.Student;
import com.globant.Topic5.repository.CourseRepository;
import com.globant.Topic5.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentRepository studentRepository;

    @Resource
    private CourseRepository courseRepository;


    @Override
    @Transactional
    public StudentDto addStudent(StudentDto studentDto) {
        Student student = new Student();
        mapDtoToEntity(studentDto, student);
        Student savedStudent = studentRepository.save(student);
        return mapEntityToDto(savedStudent);
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<StudentDto> studentDtos = new ArrayList<>();
        List<Student> students = studentRepository.findAll();
        students.stream().forEach(student -> {
            StudentDto studentDto = mapEntityToDto(student);
            studentDtos.add(studentDto);
        });
        return studentDtos;
    }

    @Override
    @Transactional
    public StudentDto updateStudent(Integer studentId, StudentDto studentDto) {
        Student student1 = studentRepository.getById(studentId);
        student1.getCourses().clear();
        mapDtoToEntity(studentDto, student1);
        Student student = studentRepository.save(student1);
        return mapEntityToDto(student);
    }

    @Override
    public String deleteStudent(Integer studentId) {
        Optional<Student> student = studentRepository.findById(studentId);
        if(student.isPresent()){
            student.get().removeCourses();
            studentRepository.deleteById(student.get().getId());
            return "Student with id: " + studentId + "deleted successfully";
        }
        return null;
    }

    private void mapDtoToEntity(StudentDto studentDto, Student student){
        student.setName(studentDto.getName());
        student.setAge(studentDto.getAge());
        student.setSurname(studentDto.getSurname());
        if(null==student.getCourses()){
            student.setCourses(new HashSet<>());
        }
        studentDto.getCourses().stream().forEach(courseName -> {
            Course course = courseRepository.findByName(courseName);
            if(null == course){
                course = new Course();
                course.setStudents(new HashSet<>());
            }
            course.setName(courseName);
            student.addCourse(course);
        });
    }

    private StudentDto mapEntityToDto(Student student){
        StudentDto responseDto = new StudentDto();
        responseDto.setName(student.getName());
        responseDto.setSurname(student.getSurname());
        responseDto.setAge(student.getAge());
        responseDto.setId(student.getId());
        responseDto.setCourses(student.getCourses().stream().map(Course::getName).collect(Collectors.toSet()));
        return responseDto;
    }
}
