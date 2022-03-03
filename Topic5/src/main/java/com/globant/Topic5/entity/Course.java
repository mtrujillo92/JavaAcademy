package com.globant.Topic5.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_sequence")
    @SequenceGenerator(name = "course_sequence", sequenceName = "course_sequence")
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "courses")
    @JsonIgnore
    private Set<Student> students;

    public void removeStudent(Student student) {
        this.getStudents().remove(student);
        student.getCourses().remove(this);
    }

    public void removeStudents() {
        for (Student student : new HashSet<>(students)) {
            removeStudent(student);
        }
    }
}
