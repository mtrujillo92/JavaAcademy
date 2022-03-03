package com.globant.Topic5.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="age")
    private Integer age;

    @ManyToMany(cascade ={CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(name="student_course", joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")})
    private Set<Course> courses;

    public void addCourse(Course course){
        this.courses.add(course);
        course.getStudents().add(this);
    }

    public void removeCourse(Course course){
        this.getCourses().remove(course);
        course.getStudents().remove(this);
    }

    public void removeCourses(){
        for (Course course: new HashSet<>(courses)){
            removeCourse(course);
        }
    }


}
