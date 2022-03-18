package com.globant.Topic7.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Setter
@Entity
public class WeatherData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "weather_sequence")
    @SequenceGenerator(name = "weather_sequence", sequenceName = "weather_sequence")
    private Integer id;


    private String date;

    @Embedded
    private Location location;

    @Embedded
    private Temperature temperature;

}
