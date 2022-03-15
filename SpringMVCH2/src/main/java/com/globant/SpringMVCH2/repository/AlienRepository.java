package com.globant.SpringMVCH2.repository;

import com.globant.SpringMVCH2.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepository extends CrudRepository<Alien,Integer> {

}
