package com.edjab.model;

/**
 * This is the VideoParameter Class that will be used to pass as a parameter.
 * @author varun
 *
 */
public class VideoParameter {
	
	private String videoUrl;
	private String uploadedBy;
	private String uploadedTo;
	private String descriptiveName;
	
	public VideoParameter(String videoUrl, String uploadedBy,
			String uploadedTo, String descriptiveName) {
		super();
		this.videoUrl = videoUrl;
		this.uploadedBy = uploadedBy;
		this.uploadedTo = uploadedTo;
		this.descriptiveName = descriptiveName;
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

	public String getDescriptiveName() {
		return descriptiveName;
	}

	public void setDescriptiveName(String descriptiveName) {
		this.descriptiveName = descriptiveName;
	}

	@Override
	public String toString() {
		return "VideoParameter [videoUrl=" + videoUrl + ", uploadedBy="
				+ uploadedBy + ", uploadedTo=" + uploadedTo
				+ ", descriptiveName=" + descriptiveName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descriptiveName == null) ? 0 : descriptiveName.hashCode());
		result = prime * result
				+ ((uploadedBy == null) ? 0 : uploadedBy.hashCode());
		result = prime * result
				+ ((uploadedTo == null) ? 0 : uploadedTo.hashCode());
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
		VideoParameter other = (VideoParameter) obj;
		if (descriptiveName == null) {
			if (other.descriptiveName != null)
				return false;
		} else if (!descriptiveName.equals(other.descriptiveName))
			return false;
		if (uploadedBy == null) {
			if (other.uploadedBy != null)
				return false;
		} else if (!uploadedBy.equals(other.uploadedBy))
			return false;
		if (uploadedTo == null) {
			if (other.uploadedTo != null)
				return false;
		} else if (!uploadedTo.equals(other.uploadedTo))
			return false;
		if (videoUrl == null) {
			if (other.videoUrl != null)
				return false;
		} else if (!videoUrl.equals(other.videoUrl))
			return false;
		return true;
	}	
}