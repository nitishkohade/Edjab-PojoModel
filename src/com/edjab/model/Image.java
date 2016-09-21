//@Copyright Edjab 2016

package com.edjab.model;


/**
 * This is the Image Class whose attributes will be served as values in Image Table in NoSql DB
 * @author varun
 *
 */
public class Image {
	
	private String imageId;
	private String imageUrl;
	private String uploadedBy;
	private String uploadedTo;
    private String uploadedOn;
	private Integer helpfulVotes;
	private String descriptiveName;
	
	public Image(String imageId, String imageUrl, String uploadedBy,
			String uploadedTo, String uploadedOn, Integer helpfulVotes,
			String descriptiveName) {
		super();
		this.imageId = imageId;
		this.imageUrl = imageUrl;
		this.uploadedBy = uploadedBy;
		this.uploadedTo = uploadedTo;
		this.uploadedOn = uploadedOn;
		this.helpfulVotes = helpfulVotes;
		this.descriptiveName = descriptiveName;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getUploadedBy() {
		return uploadedBy;
	}

	public void setUploadedBy(String uploadedBy) {
		this.uploadedBy = uploadedBy;
	}

	public String getUploadedTo() {
		return uploadedTo;
	}

	public void setUploadedTo(String uploadedTo) {
		this.uploadedTo = uploadedTo;
	}

	public String getUploadedOn() {
		return uploadedOn;
	}

	public void setUploadedOn(String uploadedOn) {
		this.uploadedOn = uploadedOn;
	}

	public Integer getHelpfulVotes() {
		return helpfulVotes;
	}

	public void setHelpfulVotes(Integer helpfulVotes) {
		this.helpfulVotes = helpfulVotes;
	}

	public String getDescriptiveName() {
		return descriptiveName;
	}

	public void setDescriptiveName(String descriptiveName) {
		this.descriptiveName = descriptiveName;
	}

	@Override
	public String toString() {
		return "Image [imageId=" + imageId + ", imageUrl=" + imageUrl
				+ ", uploadedBy=" + uploadedBy + ", uploadedTo=" + uploadedTo
				+ ", uploadedOn=" + uploadedOn + ", helpfulVotes="
				+ helpfulVotes + ", descriptiveName=" + descriptiveName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descriptiveName == null) ? 0 : descriptiveName.hashCode());
		result = prime * result
				+ ((helpfulVotes == null) ? 0 : helpfulVotes.hashCode());
		result = prime * result + ((imageId == null) ? 0 : imageId.hashCode());
		result = prime * result
				+ ((imageUrl == null) ? 0 : imageUrl.hashCode());
		result = prime * result
				+ ((uploadedBy == null) ? 0 : uploadedBy.hashCode());
		result = prime * result
				+ ((uploadedOn == null) ? 0 : uploadedOn.hashCode());
		result = prime * result
				+ ((uploadedTo == null) ? 0 : uploadedTo.hashCode());
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
		Image other = (Image) obj;
		if (descriptiveName == null) {
			if (other.descriptiveName != null)
				return false;
		} else if (!descriptiveName.equals(other.descriptiveName))
			return false;
		if (helpfulVotes == null) {
			if (other.helpfulVotes != null)
				return false;
		} else if (!helpfulVotes.equals(other.helpfulVotes))
			return false;
		if (imageId == null) {
			if (other.imageId != null)
				return false;
		} else if (!imageId.equals(other.imageId))
			return false;
		if (imageUrl == null) {
			if (other.imageUrl != null)
				return false;
		} else if (!imageUrl.equals(other.imageUrl))
			return false;
		if (uploadedBy == null) {
			if (other.uploadedBy != null)
				return false;
		} else if (!uploadedBy.equals(other.uploadedBy))
			return false;
		if (uploadedOn == null) {
			if (other.uploadedOn != null)
				return false;
		} else if (!uploadedOn.equals(other.uploadedOn))
			return false;
		if (uploadedTo == null) {
			if (other.uploadedTo != null)
				return false;
		} else if (!uploadedTo.equals(other.uploadedTo))
			return false;
		return true;
	}
}