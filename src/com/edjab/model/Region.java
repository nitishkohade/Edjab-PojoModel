//@Copyright Edjab 2016

package com.edjab.model;

/**
 * 
 * @author varun
 *
 */
public enum Region {
	
	NORTH("North"),
	SOUTH("South"),
	UNDEFINED("Undefined");
	
	private String regionName;
		
	private Region(String name) {
		this.regionName = name;
	}

	public String getRegionName() {
		return regionName;
	}
}