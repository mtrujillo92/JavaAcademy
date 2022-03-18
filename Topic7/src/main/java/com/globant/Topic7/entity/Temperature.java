package com.globant.Topic7.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Embeddable
@Getter
@Setter
public class Temperature {


    private Double temperatureOne;
    private Double temperatureTwo;
    private Double temperatureThree;
    private Double temperatureFour;

}
