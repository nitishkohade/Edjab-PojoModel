//@Copyright Edjab 2016

package com.edjab.model;

import  org.joda.time.DateTime;

/**
 * This is the Attend Class whose attributes will be served as values in Attend Table in NoSql DB
 * This class tells us about User Attending School/Institute
 * @author varun
 *
 */
public class Attend {
	
	private String attendedBy;
	private String attendedTo;
	private DateTime attendedOn;
	
	public Attend(String attendedBy, String attendedTo, DateTime attendedOn) {
		
		this.attendedBy = attendedBy;
		this.attendedTo = attendedTo;
		this.attendedOn = attendedOn;
	}

	public String getAttendedBy() {
		return attendedBy;
	}

	public void setAttendedBy(String attendedBy) {
		this.attendedBy = attendedBy;
	}

	public String getAttendedTo() {
		return attendedTo;
	}

	public void setAttendedTo(String attendedTo) {
		this.attendedTo = attendedTo;
	}

	public DateTime getAttendedOn() {
		return attendedOn;
	}

	public void setAttendedOn(DateTime attendedOn) {
		this.attendedOn = attendedOn;
	}

	@Override
	public String toString() {
		return "Attend [attendedBy=" + attendedBy + ", attendedTo="
				+ attendedTo + ", attendedOn=" + attendedOn.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((attendedBy == null) ? 0 : attendedBy.hashCode());
		result = prime * result
				+ ((attendedOn == null) ? 0 : attendedOn.hashCode());
		result = prime * result
				+ ((attendedTo == null) ? 0 : attendedTo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attend other = (Attend) obj;
		if (attendedBy == null) {
			if (other.attendedBy != null)
				return false;
		} else if (!attendedBy.equals(other.attendedBy))
			return false;
		if (attendedOn == null) {
			if (other.attendedOn != null)
				return false;
		} else if (!attendedOn.equals(other.attendedOn))
			return false;
		if (attendedTo == null) {
			if (other.attendedTo != null)
				return false;
		} else if (!attendedTo.equals(other.attendedTo))
			return false;
		return true;
	}
}