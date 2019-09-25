package com.example.poc.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.poc.consumer.constant.Constants;
import com.example.poc.consumer.dto.PersonDTO;
import com.example.poc.consumer.service.PersonService;

@Component
public class PeopleConsumer {

	private static final Logger logger = LoggerFactory.getLogger(PeopleConsumer.class);

	@Autowired
	private PersonService personConsumerService;
	
	@RabbitListener(queues = Constants.QUEUENAME, containerFactory = Constants.CONTAINERFACTORY)
	public void recievedMessage(PersonDTO personDTO) {
		logger.info(personDTO.toString());
		personConsumerService.createPerson(personDTO);
	}
}
