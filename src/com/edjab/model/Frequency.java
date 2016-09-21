//@Copyright Edjab 2016

package com.edjab.model;

/**
 * 
 * @author varun
 *
 */
public enum Frequency {
	
	DAILY("Daily"), 
	WEEKLY("Weekly"),
	MONTHLY("Monthly"),
	UNSUBSCRIBE("Unsubscribe");
	
	private String value;
	
	private Frequency(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}