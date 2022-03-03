package com.globant.Topic5.entity.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class CourseDto {
    private Integer id;
    private String name;
    private Set<String> students = new HashSet<>();
}
