package com.globant.Topic5.service;

import com.globant.Topic5.entity.Course;
import com.globant.Topic5.entity.DTO.CourseDto;
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
public class CourseServiceImpl implements CourseService{

    @Resource
    private CourseRepository courseRepository;

    @Resource
    private StudentRepository studentRepository;

    @Override
    @Transactional
    public CourseDto updateCourse(Integer id, CourseDto courseDto) {
        Course course = courseRepository.getById(id);
        course.getStudents().clear();
        mapDtoToEntity(courseDto, course);
        return mapEntityToDto(course);
    }

    @Override
    @Transactional
    public String deleteCourse(Integer id) {
        Optional<Course> course = courseRepository.findById(id);
        if(course.isPresent()){
            course.get().removeStudents();
            courseRepository.deleteById(course.get().getId());
            return "Course with id: " + id + "deleted successfully!";
        }
        return null;
    }

    @Override
    @Transactional
    public CourseDto addCourse(CourseDto courseDto) {
        Course course = new Course();
        mapDtoToEntity(courseDto, course);
        Course savedCourse = courseRepository.save(course);
        return mapEntityToDto(savedCourse);
    }

    @Override
    public List<CourseDto> getAllCourses() {
        List<CourseDto> courseDtos = new ArrayList<>();
        List<Course> courses = courseRepository.findAll();
        courses.stream().forEach(course -> {
            CourseDto courseDto = mapEntityToDto(course);
            courseDtos.add(courseDto);
        });
        return courseDtos;
    }

    private void mapDtoToEntity(CourseDto courseDto, Course course){
        course.setName(courseDto.getName());
        if(null==course.getStudents()){
            course.setStudents(new HashSet<>());
        }
        courseDto.getStudents().stream().forEach(studentName -> {
            Student student = studentRepository.findByName(studentName);
            if(null == student){
                student = new Student();
                student.setCourses(new HashSet<>());
            }
            student.setName(studentName);
            student.addCourse(course);
        });
    }

    private CourseDto mapEntityToDto(Course course) {
        CourseDto responseDto = new CourseDto();
        responseDto.setName(course.getName());
        responseDto.setId(course.getId());
        responseDto.setStudents(course.getStudents().stream().map(Student::getName).collect(Collectors.toSet()));
        return responseDto;
    }
}
