//@Copyright Edjab 2016

package com.edjab.model;

/**
 * 
 * @author varun
 *
 */
public enum SchoolCategory {
	
    ENGINEERING("Engineering"), 
    MEDICAL("Medical"), 
    LAW("Law"), 
    ARCHITECTURE("Architecture"), 
    IIT_COACHING("IIT Coaching"),
    UNDEFINED("Undefined");
	
	private String categoryName;
	
	private SchoolCategory(String catName) {
		this.categoryName = catName;
	}

	public String getCategoryName() {
		return categoryName;
	}
}