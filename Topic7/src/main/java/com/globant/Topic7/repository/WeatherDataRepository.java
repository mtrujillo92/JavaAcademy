package com.globant.Topic7.repository;

import com.globant.Topic7.entity.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherDataRepository extends JpaRepository<WeatherData,Integer> {

}
