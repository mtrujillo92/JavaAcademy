package com.globant.Topic7.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {

    private Double lat;
    private Double lon;
    private String city;
    private String state;
}
