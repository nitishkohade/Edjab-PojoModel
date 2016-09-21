//@Copyright Edjab 2016

package com.edjab.model;

import  org.joda.time.DateTime;

/**
 * This is the Like Class whose attributes will be served as values in Like Table in NoSql DB. 
 * This class tells us about User Liking School/Institute
 * @author varun
 *
 */
public class Like {
	
	private String likedBy;
	private String likedTo;
	private DateTime likedOn;
	
	public Like(String likedBy, String likedTo, DateTime likedOn) {
		this.likedBy = likedBy;
		this.likedTo = likedTo;
		this.likedOn = likedOn;
	}

	public String getLikedBy() {
		return likedBy;
	}

	public void setLikedBy(String likedBy) {
		this.likedBy = likedBy;
	}

	public String getLikedTo() {
		return likedTo;
	}

	public void setLikedTo(String likedTo) {
		this.likedTo = likedTo;
	}

	public DateTime getLikedOn() {
		return likedOn;
	}

	public void setLikedOn(DateTime likedOn) {
		this.likedOn = likedOn;
	}

	@Override
	public String toString() {
		return "Like [likedBy=" + likedBy + ", likedTo=" + likedTo
				+ ", likedOn=" + likedOn.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((likedBy == null) ? 0 : likedBy.hashCode());
		result = prime * result + ((likedOn == null) ? 0 : likedOn.hashCode());
		result = prime * result + ((likedTo == null) ? 0 : likedTo.hashCode());
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
		Like other = (Like) obj;
		if (likedBy == null) {
			if (other.likedBy != null)
				return false;
		} else if (!likedBy.equals(other.likedBy))
			return false;
		if (likedOn == null) {
			if (other.likedOn != null)
				return false;
		} else if (!likedOn.equals(other.likedOn))
			return false;
		if (likedTo == null) {
			if (other.likedTo != null)
				return false;
		} else if (!likedTo.equals(other.likedTo))
			return false;
		return true;
	}
}