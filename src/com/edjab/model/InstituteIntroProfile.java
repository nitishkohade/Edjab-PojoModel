//@Copyright Edjab 2016

package com.edjab.model;

/**
 * This is Institute Intro Profile Class whose attributes are subset of Institute Profile Class. 
 * This class is not part of any table
 * @author varun
 *
 */
public class InstituteIntroProfile {
	
	private String instituteId;
	private Double averageRating;
	private Double latitude;
	private Double longitude;
	
	public InstituteIntroProfile() {
	}
	
	public InstituteIntroProfile(String instituteId, Double averageRating,
			Double latitude, Double longitude) {
		this.instituteId = instituteId;
		this.averageRating = averageRating;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "InstituteIntroProfile [instituteId=" + instituteId
				+ ", averageRating=" + averageRating + ", latitude="
				+ latitude + ", longitude=" + longitude + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((averageRating == null) ? 0 : averageRating.hashCode());
		result = prime * result
				+ ((instituteId == null) ? 0 : instituteId.hashCode());
		result = prime * result
				+ ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result
				+ ((longitude == null) ? 0 : longitude.hashCode());
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
		InstituteIntroProfile other = (InstituteIntroProfile) obj;
		if (averageRating == null) {
			if (other.averageRating != null)
				return false;
		} else if (!averageRating.equals(other.averageRating))
			return false;
		if (instituteId == null) {
			if (other.instituteId != null)
				return false;
		} else if (!instituteId.equals(other.instituteId))
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		return true;
	}
}