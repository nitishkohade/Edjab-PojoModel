//@Copyright Edjab 2016

package com.edjab.model;

import java.util.List;

/**
 * This is class that contains attributes visible to User. This class is not part of any table
 * @author varun
 *
 */
public class VisibleUserProfile {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailId;
	private String gender;
	private String street;
	private String city;
	private String indianState;
	private String country;
	private String zip;
	private String contactNumber;
	private Integer almaMaters;
	private Integer follows;
	private Integer likes;
	private List<String> titles;
	private String subscriptionFrequency;
	private String dateOfBirth;
	private Integer reviews;
	
	public VisibleUserProfile(String firstName, String middleName,
			String lastName, String emailId, String gender, String street,
			String city, String indianState, String country, String zip,
			String contactNumber, Integer almaMaters, Integer follows,
			Integer likes, List<String> titles, String subscriptionFrequency,
			String dateOfBirth, Integer reviews) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.gender = gender;
		this.street = street;
		this.city = city;
		this.indianState = indianState;
		this.country = country;
		this.zip = zip;
		this.contactNumber = contactNumber;
		this.almaMaters = almaMaters;
		this.follows = follows;
		this.likes = likes;
		this.titles = titles;
		this.subscriptionFrequency = subscriptionFrequency;
		this.dateOfBirth = dateOfBirth;
		this.reviews = reviews;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Integer getAlmaMaters() {
		return almaMaters;
	}

	public void setAlmaMaters(Integer almaMaters) {
		this.almaMaters = almaMaters;
	}

	public Integer getFollows() {
		return follows;
	}

	public void setFollows(Integer follows) {
		this.follows = follows;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<String> getTitles() {
		return titles;
	}

	public void setTitles(List<String> titles) {
		this.titles = titles;
	}

	public String getSubscriptionFrequency() {
		return subscriptionFrequency;
	}

	public void setSubscriptionFrequency(String subscriptionFrequency) {
		this.subscriptionFrequency = subscriptionFrequency;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getReviews() {
		return reviews;
	}

	public void setReviews(Integer reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "ShowableUserProfile [firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", gender=" + gender + ", street=" + street
				+ ", city=" + city + ", indianState=" + indianState
				+ ", country=" + country + ", zip=" + zip + ", contactNumber="
				+ contactNumber + ", almaMaters=" + almaMaters + ", follows="
				+ follows + ", likes=" + likes + ", titles=" + titles
				+ ", subscriptionFrequency=" + subscriptionFrequency
				+ ", dateOfBirth=" + dateOfBirth + ", reviews=" + reviews + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((almaMaters == null) ? 0 : almaMaters.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result
				+ ((contactNumber == null) ? 0 : contactNumber.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((follows == null) ? 0 : follows.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result
				+ ((indianState == null) ? 0 : indianState.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((likes == null) ? 0 : likes.hashCode());
		result = prime * result
				+ ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((reviews == null) ? 0 : reviews.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime
				* result
				+ ((subscriptionFrequency == null) ? 0 : subscriptionFrequency
						.hashCode());
		result = prime * result + ((titles == null) ? 0 : titles.hashCode());
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
		VisibleUserProfile other = (VisibleUserProfile) obj;
		if (almaMaters == null) {
			if (other.almaMaters != null)
				return false;
		} else if (!almaMaters.equals(other.almaMaters))
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
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (follows == null) {
			if (other.follows != null)
				return false;
		} else if (!follows.equals(other.follows))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (indianState == null) {
			if (other.indianState != null)
				return false;
		} else if (!indianState.equals(other.indianState))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (likes == null) {
			if (other.likes != null)
				return false;
		} else if (!likes.equals(other.likes))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
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
		if (subscriptionFrequency == null) {
			if (other.subscriptionFrequency != null)
				return false;
		} else if (!subscriptionFrequency.equals(other.subscriptionFrequency))
			return false;
		if (titles == null) {
			if (other.titles != null)
				return false;
		} else if (!titles.equals(other.titles))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}
}