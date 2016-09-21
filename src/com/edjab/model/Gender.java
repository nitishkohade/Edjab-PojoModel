//@Copyright Edjab 2016

package com.edjab.model;

/**
 * 
 * @author varun
 *
 */
public enum Gender {
	
	MALE("Male"), 
	FEMALE("Female"),
	EMPTY(" ");
	
	private String value;
	
	private Gender(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}