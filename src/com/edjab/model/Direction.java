//@Copyright Edjab 2016

package com.edjab.model;

/**
 * 
 * @author varun
 *
 */
public enum Direction {
	
	NORTH("India"),
	SOUTH("South"),
	EAST("East"),
	WEST("West"),
	UNDEFINED("Undefined");
	
	private String directionName;
		
	private Direction(String name) {
		this.directionName = name;
	}

	public String getDirectionName() {
		return directionName;
	}
}