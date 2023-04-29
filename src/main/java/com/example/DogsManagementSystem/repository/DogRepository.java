package com.example.DogsManagementSystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.DogsManagementSystem.Models.Dog;
/**
 * 
 * @author S554035 vveragandham raghava chowdary
 *
 */


public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}
