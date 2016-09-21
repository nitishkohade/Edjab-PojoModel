//@Copyright Edjab 2016

package com.edjab.model;

/**
 * 
 * @author varun
 *
 */
public class InstituteName {
	
	private String instituteId;
	
	public InstituteName() {
	}

	public InstituteName(String instituteId) {
		this.instituteId = instituteId;
	}

	public String getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}

	@Override
	public String toString() {
		return instituteId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((instituteId == null) ? 0 : instituteId.hashCode());
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
		InstituteName other = (InstituteName) obj;
		if (instituteId == null) {
			if (other.instituteId != null)
				return false;
		} else if (!instituteId.equals(other.instituteId))
			return false;
		return true;
	}	
}