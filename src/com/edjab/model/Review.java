//@Copyright Edjab 2016

package com.edjab.model;

import  org.joda.time.DateTime;

/**
 * This is the Review Class whose attributes will be served as values in Review Table in NoSql DB
 * @author varun
 *
 */
public class Review {
	
	private String reviewId; // This is the combination of reviewedBy + "_" + reviewedTo
	private String reviewBody;
	private String reviewedBy;
	private String reviewedTo;
	private DateTime reviewedOn;
	private Integer helpfulVotes;
	private Integer ratedNumber;
	
	public Review(){}
	
	public Review(String reviewId, String reviewBody, String reviewedBy,
			String reviewedTo, DateTime reviewedOn, Integer helpfulVotes,
			Integer ratedNumber) {
		super();
		this.reviewId = reviewId;
		this.reviewBody = reviewBody;
		this.reviewedBy = reviewedBy;
		this.reviewedTo = reviewedTo;
		this.reviewedOn = reviewedOn;
		this.helpfulVotes = helpfulVotes;
		this.ratedNumber = ratedNumber;
	}

	public String getReviewId() {
		return reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
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

	public DateTime getReviewedOn() {
		return reviewedOn;
	}

	public void setReviewedOn(DateTime reviewedOn) {
		this.reviewedOn = reviewedOn;
	}

	public Integer getHelpfulVotes() {
		return helpfulVotes;
	}

	public void setHelpfulVotes(Integer helpfulVotes) {
		this.helpfulVotes = helpfulVotes;
	}

	public Integer getRatedNumber() {
		return ratedNumber;
	}

	public void setRatedNumber(Integer ratedNumber) {
		this.ratedNumber = ratedNumber;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", reviewBody=" + reviewBody
				+ ", reviewedBy=" + reviewedBy + ", reviewedTo=" + reviewedTo
				+ ", reviewedOn=" + reviewedOn + ", helpfulVotes="
				+ helpfulVotes + ", ratedNumber=" + ratedNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((helpfulVotes == null) ? 0 : helpfulVotes.hashCode());
		result = prime * result
				+ ((ratedNumber == null) ? 0 : ratedNumber.hashCode());
		result = prime * result
				+ ((reviewBody == null) ? 0 : reviewBody.hashCode());
		result = prime * result
				+ ((reviewId == null) ? 0 : reviewId.hashCode());
		result = prime * result
				+ ((reviewedBy == null) ? 0 : reviewedBy.hashCode());
		result = prime * result
				+ ((reviewedOn == null) ? 0 : reviewedOn.hashCode());
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
		Review other = (Review) obj;
		if (helpfulVotes == null) {
			if (other.helpfulVotes != null)
				return false;
		} else if (!helpfulVotes.equals(other.helpfulVotes))
			return false;
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
		if (reviewId == null) {
			if (other.reviewId != null)
				return false;
		} else if (!reviewId.equals(other.reviewId))
			return false;
		if (reviewedBy == null) {
			if (other.reviewedBy != null)
				return false;
		} else if (!reviewedBy.equals(other.reviewedBy))
			return false;
		if (reviewedOn == null) {
			if (other.reviewedOn != null)
				return false;
		} else if (!reviewedOn.equals(other.reviewedOn))
			return false;
		if (reviewedTo == null) {
			if (other.reviewedTo != null)
				return false;
		} else if (!reviewedTo.equals(other.reviewedTo))
			return false;
		return true;
	}
}