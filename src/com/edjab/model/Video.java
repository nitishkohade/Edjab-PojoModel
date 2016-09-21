//@Copyright Edjab 2016

package com.edjab.model;

/**
 * This is the Video Class whose attributes will be served as values in Video Table in NoSql DB
 * @author varun
 *
 */
public class Video {
	
	private String videoId;
	private String videoUrl;
	private String uploadedBy;
	private String uploadedTo;
	private String uploadedOn;
	private Integer helpfulVotes;
	private String descriptiveName;
	
	public Video(String videoId, String videoUrl, String uploadedBy,
			String uploadedTo, String uploadedOn, Integer helpfulVotes,
			String descriptiveName) {
		super();
		this.videoId = videoId;
		this.videoUrl = videoUrl;
		this.uploadedBy = uploadedBy;
		this.uploadedTo = uploadedTo;
		this.uploadedOn = uploadedOn;
		this.helpfulVotes = helpfulVotes;
		this.descriptiveName = descriptiveName;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
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
		return "Video [videoId=" + videoId + ", videoUrl=" + videoUrl
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
		result = prime * result
				+ ((uploadedBy == null) ? 0 : uploadedBy.hashCode());
		result = prime * result
				+ ((uploadedOn == null) ? 0 : uploadedOn.hashCode());
		result = prime * result
				+ ((uploadedTo == null) ? 0 : uploadedTo.hashCode());
		result = prime * result + ((videoId == null) ? 0 : videoId.hashCode());
		result = prime * result
				+ ((videoUrl == null) ? 0 : videoUrl.hashCode());
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
		Video other = (Video) obj;
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
		if (videoId == null) {
			if (other.videoId != null)
				return false;
		} else if (!videoId.equals(other.videoId))
			return false;
		if (videoUrl == null) {
			if (other.videoUrl != null)
				return false;
		} else if (!videoUrl.equals(other.videoUrl))
			return false;
		return true;
	}
}