package com.globant.Topic7.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "location_sequence")
    @SequenceGenerator(name = "location_sequence", sequenceName = "location_sequence")
    private Integer id;
    private Double lat;
    private Double lon;
    private String city;
    private String state;

    public Location() {
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
