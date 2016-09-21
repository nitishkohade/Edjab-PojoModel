package com.edjab.model;

/**
 * This is the ReviewParameter Class that will be used to pass as a parameter.
 * @author varun
 *
 */
public class ReviewParameter {
	
	private String reviewBody;
	private String reviewedBy;
	private String reviewedTo;
	private Integer ratedNumber;
	
	public ReviewParameter(){
		
	}
	
	public ReviewParameter(String reviewBody, String reviewedBy,
			String reviewedTo, Integer ratedNumber) {
		super();
		this.reviewBody = reviewBody;
		this.reviewedBy = reviewedBy;
		this.reviewedTo = reviewedTo;
		this.ratedNumber = ratedNumber;
	}

	public String getReviewBody() {
		return reviewBody;
	}

	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

	public String getReviewedBy() {
		return reviewedBy;
	}

	public void setReviewedBy(String reviewedBy) {
		this.reviewedBy = reviewedBy;
	}

	public String getReviewedTo() {
		return reviewedTo;
	}

	public void setReviewedTo(String reviewedTo) {
		this.reviewedTo = reviewedTo;
	}

	public Integer getRatedNumber() {
		return ratedNumber;
	}

	public void setRatedNumber(Integer ratedNumber) {
		this.ratedNumber = ratedNumber;
	}

	@Override
	public String toString() {
		return "ReviewParameter [reviewBody=" + reviewBody + ", reviewedBy="
				+ reviewedBy + ", reviewedTo=" + reviewedTo + ", ratedNumber="
				+ ratedNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((ratedNumber == null) ? 0 : ratedNumber.hashCode());
		result = prime * result
				+ ((reviewBody == null) ? 0 : reviewBody.hashCode());
		result = prime * result
				+ ((reviewedBy == null) ? 0 : reviewedBy.hashCode());
		result = prime * result
				+ ((reviewedTo == null) ? 0 : reviewedTo.hashCode());
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
		ReviewParameter other = (ReviewParameter) obj;
		if (ratedNumber == null) {
			if (other.ratedNumber != null)
				return false;
		} else if (!ratedNumber.equals(other.ratedNumber))
			return false;
		if (reviewBody == null) {
			if (other.reviewBody != null)
				return false;
		} else if (!reviewBody.equals(other.reviewBody))
			return false;
		if (reviewedBy == null) {
			if (other.reviewedBy != null)
				return false;
		} else if (!reviewedBy.equals(other.reviewedBy))
			return false;
		if (reviewedTo == null) {
			if (other.reviewedTo != null)
				return false;
		} else if (!reviewedTo.equals(other.reviewedTo))
			return false;
		return true;
	}	
}