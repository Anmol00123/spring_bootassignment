package com.example.demoassignment.dao;

import com.example.demoassignment.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantDao extends CrudRepository<Restaurant,Integer> {
}
