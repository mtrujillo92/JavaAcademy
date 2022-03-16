package com.globant.Topic7.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
public class WeatherData {

    @Id
    private Integer id;
    private LocalDate date;
    private Location location;
    private List<Double> temperature;

}
