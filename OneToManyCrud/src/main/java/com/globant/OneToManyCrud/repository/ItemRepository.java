package com.globant.OneToManyCrud.repository;

import com.globant.OneToManyCrud.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item,Long> {
}
