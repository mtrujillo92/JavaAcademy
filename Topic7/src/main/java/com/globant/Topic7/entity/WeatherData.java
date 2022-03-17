package com.globant.Topic7.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;



@Getter
@Setter
@Entity
public class WeatherData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "weather_sequence")
    @SequenceGenerator(name = "weather_sequence", sequenceName = "weather_sequence")
    private Integer id;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "temperature_id")
    private Temperature temperature;

}
