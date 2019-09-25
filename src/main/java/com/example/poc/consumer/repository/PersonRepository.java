package com.example.poc.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.poc.consumer.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
