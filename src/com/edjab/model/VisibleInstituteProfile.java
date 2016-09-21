//@Copyright Edjab 2016

package com.edjab.model;

import java.util.List;

/**
 * This is the Visible Institute Profile Class whose attributes will be served as visible attributes in front end
 * @author varun
 *
 */
public class VisibleInstituteProfile {
	
	private String instituteId;
	private String instituteName;
	private List<String> urls;
	private String emailId;
	private String street;
	private String city;
	private String indianState;
	private String country;
	private String zip;
	private Double latitude;
	private Double longitude;
	private String mission;
	private String contactNumber;
	private String description;
	private String profileImageUrl;
	private List<String> Categories;
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
	
	public VisibleInstituteProfile(String instituteId, String instituteName,
			List<String> urls, String emailId, String street, String city,
			String indianState, String country, String zip, Double latitude,
			Double longitude, String mission, String contactNumber,
			String description, String profileImageUrl,
			List<String> categories, Integer attendees, Integer likes,
			Integer followers, Integer reviews, String dateOfEstablishment,
			Integer oneStarRatings, Integer twoStarRatings,
			Integer threeStarRatings, Integer fourStarRatings,
			Integer fiveStarRatings, Double averageRating,
			Double initialAverageRating) {
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

	public String getIndianState() {
		return indianState;
	}

	public void setIndianState(String indianState) {
		this.indianState = indianState;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
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

	public List<String> getCategories() {
		return Categories;
	}

	public void setCategories(List<String> categories) {
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
}