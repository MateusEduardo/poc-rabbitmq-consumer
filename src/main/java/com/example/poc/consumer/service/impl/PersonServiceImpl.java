package com.example.poc.consumer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.poc.consumer.converter.PersonConverter;
import com.example.poc.consumer.dto.PersonDTO;
import com.example.poc.consumer.entity.Person;
import com.example.poc.consumer.repository.PersonRepository;
import com.example.poc.consumer.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public void createPerson(PersonDTO personDTO) {
		Person person = PersonConverter.personDTOToPersonConverter(personDTO);
		personRepository.saveAndFlush(person);
	}
}
