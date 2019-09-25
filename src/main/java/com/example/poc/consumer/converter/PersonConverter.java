package com.example.poc.consumer.converter;

import com.example.poc.consumer.dto.PersonDTO;
import com.example.poc.consumer.entity.Person;

public class PersonConverter {
	
	private PersonConverter() {
	
	}

	public static final Person personDTOToPersonConverter(PersonDTO personDTO) {
		return Person.builder().name(personDTO.getName()).age(personDTO.getAge()).build();
	}
}
