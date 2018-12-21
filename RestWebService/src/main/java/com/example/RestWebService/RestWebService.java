package com.example.RestWebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWebService {
	
	PersonRepository personRepository;
	
	@Autowired
	public RestWebService(PersonRepository personRepository) {
		this.personRepository = personRepository;
    	Person tintin = new Person("Tintin", 30);
    	tintin.setId(1L);
    	personRepository.save(tintin);
	}
	
	@RequestMapping(value = "/person", method=RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK) 
	public Person getPerson() {
		Person person = personRepository.findById(1L).get();
		return person;
	}

}
