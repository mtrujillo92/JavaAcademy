package com.globant.Topic7.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Temperature {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "temperature_sequence")
    @SequenceGenerator(name = "temperature_sequence", sequenceName = "temperature_sequence")
    private Integer id;

    private Double temperatureOne;
    private Double temperatureTwo;
    private Double temperatureThree;
    private Double temperatureFour;

}
