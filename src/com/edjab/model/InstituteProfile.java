//@Copyright Edjab 2016

package com.edjab.model;

import java.util.List;

/**
 * This is the Institute Profile Class whose attributes will be served as values in Institute Profile Table
 * in NoSql DB. This class tells us about Institute Profile
 * @author varun
 *
 */
public class InstituteProfile {
	
	private String instituteId;
	private String instituteName;
	private List<String> urls;
	private String emailId;
	private String street;
	private String city;
	private IndianState indianState;
	private Country country;
	private String zip;
	private Region region;
	private Direction direction;
	private Double latitude;
	private Double longitude;
	private String mission;
	private PhoneNumber contactNumber;
	private String description;
	private String profileImageUrl;
	private List<SchoolCategory> Categories;
	private Integer attendees;
	private Integer likes;
	private Integer followers;
	private Integer reviews;
	private String dateOfEstablishment;
	private Integer oneStarRatings;
	private Integer twoStarRatings;
	private Integer threeStarRatings;
	private Integer fourStarRatings;
	private Integer fiveStarRatings;
	private Double averageRating;
	private Double initialAverageRating;
	private Boolean isActive;
	
	
	public InstituteProfile(String instituteId, String instituteName,
			List<String> urls, String emailId, String street, String city,
			IndianState indianState, Country country, String zip,
			Region region, Direction direction, Double latitude,
			Double longitude, String mission, PhoneNumber contactNumber,
			String description, String profileImageUrl,
			List<SchoolCategory> categories, Integer attendees, Integer likes,
			Integer followers, Integer reviews, String dateOfEstablishment,
			Integer oneStarRatings, Integer twoStarRatings,
			Integer threeStarRatings, Integer fourStarRatings,
			Integer fiveStarRatings, Double averageRating,
			Double initialAverageRating, Boolean isActive) {
		super();
		this.instituteId = instituteId;
		this.instituteName = instituteName;
		this.urls = urls;
		this.emailId = emailId;
		this.street = street;
		this.city = city;
		this.indianState = indianState;
		this.country = country;
		this.zip = zip;
		this.region = region;
		this.direction = direction;
		this.latitude = latitude;
		this.longitude = longitude;
		this.mission = mission;
		this.contactNumber = contactNumber;
		this.description = description;
		this.profileImageUrl = profileImageUrl;
		Categories = categories;
		this.attendees = attendees;
		this.likes = likes;
		this.followers = followers;
		this.reviews = reviews;
		this.dateOfEstablishment = dateOfEstablishment;
		this.oneStarRatings = oneStarRatings;
		this.twoStarRatings = twoStarRatings;
		this.threeStarRatings = threeStarRatings;
		this.fourStarRatings = fourStarRatings;
		this.fiveStarRatings = fiveStarRatings;
		this.averageRating = averageRating;
		this.initialAverageRating = initialAverageRating;
		this.isActive = isActive;
	}

	public String getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public List<String> getUrls() {
		return urls;
	}

	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public IndianState getIndianState() {
		return indianState;
	}

	public void setIndianState(IndianState indianState) {
		this.indianState = indianState;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
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

	public String getMission() {
		return mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	public PhoneNumber getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(PhoneNumber contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public List<SchoolCategory> getCategories() {
		return Categories;
	}

	public void setCategories(List<SchoolCategory> categories) {
		Categories = categories;
	}

	public Integer getAttendees() {
		return attendees;
	}

	public void setAttendees(Integer attendees) {
		this.attendees = attendees;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getFollowers() {
		return followers;
	}

	public void setFollowers(Integer followers) {
		this.followers = followers;
	}

	public Integer getReviews() {
		return reviews;
	}

	public void setReviews(Integer reviews) {
		this.reviews = reviews;
	}

	public String getDateOfEstablishment() {
		return dateOfEstablishment;
	}

	public void setDateOfEstablishment(String dateOfEstablishment) {
		this.dateOfEstablishment = dateOfEstablishment;
	}

	public Integer getOneStarRatings() {
		return oneStarRatings;
	}

	public void setOneStarRatings(Integer oneStarRatings) {
		this.oneStarRatings = oneStarRatings;
	}

	public Integer getTwoStarRatings() {
		return twoStarRatings;
	}

	public void setTwoStarRatings(Integer twoStarRatings) {
		this.twoStarRatings = twoStarRatings;
	}

	public Integer getThreeStarRatings() {
		return threeStarRatings;
	}

	public void setThreeStarRatings(Integer threeStarRatings) {
		this.threeStarRatings = threeStarRatings;
	}

	public Integer getFourStarRatings() {
		return fourStarRatings;
	}

	public void setFourStarRatings(Integer fourStarRatings) {
		this.fourStarRatings = fourStarRatings;
	}

	public Integer getFiveStarRatings() {
		return fiveStarRatings;
	}

	public void setFiveStarRatings(Integer fiveStarRatings) {
		this.fiveStarRatings = fiveStarRatings;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	public Double getInitialAverageRating() {
		return initialAverageRating;
	}

	public void setInitialAverageRating(Double initialAverageRating) {
		this.initialAverageRating = initialAverageRating;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "InstituteProfile [instituteId=" + instituteId
				+ ", instituteName=" + instituteName + ", urls=" + urls
				+ ", emailId=" + emailId + ", street=" + street + ", city="
				+ city + ", indianState=" + indianState + ", country="
				+ country + ", zip=" + zip + ", region=" + region
				+ ", direction=" + direction + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", mission=" + mission
				+ ", contactNumber=" + contactNumber + ", description="
				+ description + ", profileImageUrl=" + profileImageUrl
				+ ", Categories=" + Categories + ", attendees=" + attendees
				+ ", likes=" + likes + ", followers=" + followers
				+ ", reviews=" + reviews + ", dateOfEstablishment="
				+ dateOfEstablishment + ", oneStarRatings=" + oneStarRatings
				+ ", twoStarRatings=" + twoStarRatings + ", threeStarRatings="
				+ threeStarRatings + ", fourStarRatings=" + fourStarRatings
				+ ", fiveStarRatings=" + fiveStarRatings + ", averageRating="
				+ averageRating + ", initialAverageRating="
				+ initialAverageRating + ", isActive=" + isActive + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Categories == null) ? 0 : Categories.hashCode());
		result = prime * result
				+ ((attendees == null) ? 0 : attendees.hashCode());
		result = prime * result
				+ ((averageRating == null) ? 0 : averageRating.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result
				+ ((contactNumber == null) ? 0 : contactNumber.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime
				* result
				+ ((dateOfEstablishment == null) ? 0 : dateOfEstablishment
						.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((direction == null) ? 0 : direction.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result
				+ ((fiveStarRatings == null) ? 0 : fiveStarRatings.hashCode());
		result = prime * result
				+ ((followers == null) ? 0 : followers.hashCode());
		result = prime * result
				+ ((fourStarRatings == null) ? 0 : fourStarRatings.hashCode());
		result = prime * result
				+ ((indianState == null) ? 0 : indianState.hashCode());
		result = prime
				* result
				+ ((initialAverageRating == null) ? 0 : initialAverageRating
						.hashCode());
		result = prime * result
				+ ((instituteId == null) ? 0 : instituteId.hashCode());
		result = prime * result
				+ ((instituteName == null) ? 0 : instituteName.hashCode());
		result = prime * result
				+ ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result
				+ ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((likes == null) ? 0 : likes.hashCode());
		result = prime * result
				+ ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((mission == null) ? 0 : mission.hashCode());
		result = prime * result
				+ ((oneStarRatings == null) ? 0 : oneStarRatings.hashCode());
		result = prime * result
				+ ((profileImageUrl == null) ? 0 : profileImageUrl.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((reviews == null) ? 0 : reviews.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime
				* result
				+ ((threeStarRatings == null) ? 0 : threeStarRatings.hashCode());
		result = prime * result
				+ ((twoStarRatings == null) ? 0 : twoStarRatings.hashCode());
		result = prime * result + ((urls == null) ? 0 : urls.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
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
		InstituteProfile other = (InstituteProfile) obj;
		if (Categories == null) {
			if (other.Categories != null)
				return false;
		} else if (!Categories.equals(other.Categories))
			return false;
		if (attendees == null) {
			if (other.attendees != null)
				return false;
		} else if (!attendees.equals(other.attendees))
			return false;
		if (averageRating == null) {
			if (other.averageRating != null)
				return false;
		} else if (!averageRating.equals(other.averageRating))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (contactNumber == null) {
			if (other.contactNumber != null)
				return false;
		} else if (!contactNumber.equals(other.contactNumber))
			return false;
		if (country != other.country)
			return false;
		if (dateOfEstablishment == null) {
			if (other.dateOfEstablishment != null)
				return false;
		} else if (!dateOfEstablishment.equals(other.dateOfEstablishment))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (direction != other.direction)
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (fiveStarRatings == null) {
			if (other.fiveStarRatings != null)
				return false;
		} else if (!fiveStarRatings.equals(other.fiveStarRatings))
			return false;
		if (followers == null) {
			if (other.followers != null)
				return false;
		} else if (!followers.equals(other.followers))
			return false;
		if (fourStarRatings == null) {
			if (other.fourStarRatings != null)
				return false;
		} else if (!fourStarRatings.equals(other.fourStarRatings))
			return false;
		if (indianState != other.indianState)
			return false;
		if (initialAverageRating == null) {
			if (other.initialAverageRating != null)
				return false;
		} else if (!initialAverageRating.equals(other.initialAverageRating))
			return false;
		if (instituteId == null) {
			if (other.instituteId != null)
				return false;
		} else if (!instituteId.equals(other.instituteId))
			return false;
		if (instituteName == null) {
			if (other.instituteName != null)
				return false;
		} else if (!instituteName.equals(other.instituteName))
			return false;
		if (isActive == null) {
			if (other.isActive != null)
				return false;
		} else if (!isActive.equals(other.isActive))
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (likes == null) {
			if (other.likes != null)
				return false;
		} else if (!likes.equals(other.likes))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (mission == null) {
			if (other.mission != null)
				return false;
		} else if (!mission.equals(other.mission))
			return false;
		if (oneStarRatings == null) {
			if (other.oneStarRatings != null)
				return false;
		} else if (!oneStarRatings.equals(other.oneStarRatings))
			return false;
		if (profileImageUrl == null) {
			if (other.profileImageUrl != null)
				return false;
		} else if (!profileImageUrl.equals(other.profileImageUrl))
			return false;
		if (region != other.region)
			return false;
		if (reviews == null) {
			if (other.reviews != null)
				return false;
		} else if (!reviews.equals(other.reviews))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (threeStarRatings == null) {
			if (other.threeStarRatings != null)
				return false;
		} else if (!threeStarRatings.equals(other.threeStarRatings))
			return false;
		if (twoStarRatings == null) {
			if (other.twoStarRatings != null)
				return false;
		} else if (!twoStarRatings.equals(other.twoStarRatings))
			return false;
		if (urls == null) {
			if (other.urls != null)
				return false;
		} else if (!urls.equals(other.urls))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}
}