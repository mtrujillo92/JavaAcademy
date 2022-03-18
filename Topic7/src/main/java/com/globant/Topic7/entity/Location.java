package com.globant.Topic7.entity;


import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Embeddable
@Getter
@Setter

public class Location {

    private Double lat;
    private Double lon;
    private String city;
    private String state;

}
