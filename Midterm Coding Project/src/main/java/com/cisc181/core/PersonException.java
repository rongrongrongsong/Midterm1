package com.cisc181.core;

import java.util.Date;

import com.cisc181.core.Person;

public class PersonException extends Exception {
	private Person person;
	private Date DOB;
	private String Phone_number;
	

	public PersonException(Person person) {
		super();
		this.person = person;
	}

	protected Person getP(){
		return person;
	}
	
}
