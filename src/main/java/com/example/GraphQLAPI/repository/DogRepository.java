package com.example.GraphQLAPI.repository;

import com.example.GraphQLAPI.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}