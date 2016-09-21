//@Copyright Edjab 2016

package com.edjab.model;

/**
 * 
 * @author varun
 *
 */
public enum Country {
	
	INDIA("India", "IN"), 
	UNDEFINED("Undefined", "Undefined");
		
	private String countryName;
	private String isoCode;
		
	private Country(String name, String code) {
		this.countryName = name;
		this.isoCode = code;
	}

	public String getCountryName() {
		return countryName;
	}
	
	public String getIsoCode() {
		return isoCode;
	}
}