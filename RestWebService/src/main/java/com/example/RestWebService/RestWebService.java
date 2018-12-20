package com.example.RestWebService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWebService {
	
	@RequestMapping(value = "/person", method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK) 
	public Person getPerson() {
		return new Person("Tintin", 20);
	}

}
