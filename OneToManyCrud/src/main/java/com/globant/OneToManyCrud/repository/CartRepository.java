package com.globant.OneToManyCrud.repository;

import com.globant.OneToManyCrud.entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart,Long> {

}
