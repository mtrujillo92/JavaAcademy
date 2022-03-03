package com.globant.Topic5.entity.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class StudentDto {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private Set<String> courses = new HashSet<>();
}
