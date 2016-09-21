//@Copyright Edjab 2016

package com.edjab.model;

import  org.joda.time.DateTime;

/**
 * This is the Follow Class whose attributes will be served as values in Follow Table in NoSql DB. 
 * This class tells us about User Following School/Institute
 * @author varun
 *
 */
public class Follow {
	
	private String followedBy;
	private String followedTo;
	private DateTime followedOn;
	
	public Follow(String followedBy, String followedTo, DateTime followedOn) {
		this.followedBy = followedBy;
		this.followedTo = followedTo;
		this.followedOn = followedOn;
	}

	public String getFollowedBy() {
		return followedBy;
	}

	public void setFollowedBy(String followedBy) {
		this.followedBy = followedBy;
	}

	public String getFollowedTo() {
		return followedTo;
	}

	public void setFollowedTo(String followedTo) {
		this.followedTo = followedTo;
	}

	public DateTime getFollowedOn() {
		return followedOn;
	}

	public void setFollowedOn(DateTime followedOn) {
		this.followedOn = followedOn;
	}

	@Override
	public String toString() {
		return "Follow [followedBy=" + followedBy + ", followedTo="
				+ followedTo + ", followedOn=" + followedOn.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((followedBy == null) ? 0 : followedBy.hashCode());
		result = prime * result
				+ ((followedOn == null) ? 0 : followedOn.hashCode());
		result = prime * result
				+ ((followedTo == null) ? 0 : followedTo.hashCode());
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
		Follow other = (Follow) obj;
		if (followedBy == null) {
			if (other.followedBy != null)
				return false;
		} else if (!followedBy.equals(other.followedBy))
			return false;
		if (followedOn == null) {
			if (other.followedOn != null)
				return false;
		} else if (!followedOn.equals(other.followedOn))
			return false;
		if (followedTo == null) {
			if (other.followedTo != null)
				return false;
		} else if (!followedTo.equals(other.followedTo))
			return false;
		return true;
	}
}