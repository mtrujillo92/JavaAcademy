package com.globant.Topic7.repository;

import com.globant.Topic7.entity.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureRepository extends JpaRepository <Temperature,Integer> {
}
