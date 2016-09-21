//@Copyright Edjab 2016

package com.edjab.model;

import java.util.List;

import  org.joda.time.DateTime;

/**
 * This is User Profile Class whose attributes will be served as values in UserProfile Table in NoSql DB. 
 * This class tells us about User Information
 * @author varun
 *
 */
public class UserProfile {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailId;
	private String userId;
	private String password;
	private Boolean registeredUser;
	private Boolean facebookUser;
	private Boolean googleUser;
	private Gender gender;
	private String street;
	private String city;
	private IndianState indianState;
	private String country;
	private String zip;
	private PhoneNumber contactNumber;
	private Integer almaMaters;
	private Integer follows;
	private Integer likes;
	private List<String> titles;
	private Frequency subscriptionFrequency;
	private DateOfBirth dateOfBirth;
	private Integer reviews;
	private DateTime accountStatusChangeDate;
	private String passwordResetToken;
	private DateTime passwordResetTokenCreationTime;
	private String registrationToken;
	private boolean rememberme;
	
	public boolean isRememberme() {
		return rememberme;
	}

	public void setRememberme(boolean rememberme) {
		this.rememberme = rememberme;
	}

	public UserProfile(){
		
	}

	public UserProfile(String firstName, String middleName, String lastName,
			String emailId, String userId, String password,
			Boolean registeredUser, Boolean facebookUser, Boolean googleUser,
			Gender gender, String street, String city, IndianState indianState,
			String country, String zip, PhoneNumber contactNumber,
			Integer almaMaters, Integer follows, Integer likes,
			List<String> titles, Frequency subscriptionFrequency,
			DateOfBirth dateOfBirth, Integer reviews,
			DateTime accountStatusChangeDate, String passwordResetToken,
			DateTime passwordResetTokenCreationTime, String registrationToken) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.userId = userId;
		this.password = password;
		this.registeredUser = registeredUser;
		this.facebookUser = facebookUser;
		this.googleUser = googleUser;
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
		this.accountStatusChangeDate = accountStatusChangeDate;
		this.passwordResetToken = passwordResetToken;
		this.passwordResetTokenCreationTime = passwordResetTokenCreationTime;
		this.registrationToken = registrationToken;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getRegisteredUser() {
		return registeredUser;
	}

	public void setRegisteredUser(Boolean registeredUser) {
		this.registeredUser = registeredUser;
	}

	public Boolean getFacebookUser() {
		return facebookUser;
	}

	public void setFacebookUser(Boolean facebookUser) {
		this.facebookUser = facebookUser;
	}

	public Boolean getGoogleUser() {
		return googleUser;
	}

	public void setGoogleUser(Boolean googleUser) {
		this.googleUser = googleUser;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
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

	public IndianState getIndianState() {
		return indianState;
	}

	public void setIndianState(IndianState indianState) {
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

	public PhoneNumber getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(PhoneNumber contactNumber) {
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

	public Frequency getSubscriptionFrequency() {
		return subscriptionFrequency;
	}

	public void setSubscriptionFrequency(Frequency subscriptionFrequency) {
		this.subscriptionFrequency = subscriptionFrequency;
	}

	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(DateOfBirth dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getReviews() {
		return reviews;
	}

	public void setReviews(Integer reviews) {
		this.reviews = reviews;
	}

	public DateTime getAccountStatusChangeDate() {
		return accountStatusChangeDate;
	}

	public void setAccountStatusChangeDate(DateTime accountStatusChangeDate) {
		this.accountStatusChangeDate = accountStatusChangeDate;
	}

	public String getPasswordResetToken() {
		return passwordResetToken;
	}

	public void setPasswordResetToken(String passwordResetToken) {
		this.passwordResetToken = passwordResetToken;
	}

	public DateTime getPasswordResetTokenCreationTime() {
		return passwordResetTokenCreationTime;
	}

	public void setPasswordResetTokenCreationTime(
			DateTime passwordResetTokenCreationTime) {
		this.passwordResetTokenCreationTime = passwordResetTokenCreationTime;
	}

	public String getRegistrationToken() {
		return registrationToken;
	}

	public void setRegistrationToken(String registrationToken) {
		this.registrationToken = registrationToken;
	}

	@Override
	public String toString() {
		return "UserProfile [firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", userId=" + userId + ", password=" + password
				+ ", registeredUser=" + registeredUser + ", facebookUser="
				+ facebookUser + ", googleUser=" + googleUser + ", gender="
				+ gender + ", street=" + street + ", city=" + city
				+ ", indianState=" + indianState + ", country=" + country
				+ ", zip=" + zip + ", contactNumber=" + contactNumber
				+ ", almaMaters=" + almaMaters + ", follows=" + follows
				+ ", likes=" + likes + ", titles=" + titles
				+ ", subscriptionFrequency=" + subscriptionFrequency
				+ ", dateOfBirth=" + dateOfBirth + ", reviews=" + reviews
				+ ", accountStatusChangeDate=" + accountStatusChangeDate
				+ ", passwordResetToken=" + passwordResetToken
				+ ", passwordResetTokenCreationTime="
				+ passwordResetTokenCreationTime + ", registrationToken="
				+ registrationToken + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((accountStatusChangeDate == null) ? 0
						: accountStatusChangeDate.hashCode());
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
				+ ((facebookUser == null) ? 0 : facebookUser.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((follows == null) ? 0 : follows.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result
				+ ((googleUser == null) ? 0 : googleUser.hashCode());
		result = prime * result
				+ ((indianState == null) ? 0 : indianState.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((likes == null) ? 0 : likes.hashCode());
		result = prime * result
				+ ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime
				* result
				+ ((passwordResetToken == null) ? 0 : passwordResetToken
						.hashCode());
		result = prime
				* result
				+ ((passwordResetTokenCreationTime == null) ? 0
						: passwordResetTokenCreationTime.hashCode());
		result = prime * result
				+ ((registeredUser == null) ? 0 : registeredUser.hashCode());
		result = prime
				* result
				+ ((registrationToken == null) ? 0 : registrationToken
						.hashCode());
		result = prime * result + ((reviews == null) ? 0 : reviews.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime
				* result
				+ ((subscriptionFrequency == null) ? 0 : subscriptionFrequency
						.hashCode());
		result = prime * result + ((titles == null) ? 0 : titles.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		UserProfile other = (UserProfile) obj;
		if (accountStatusChangeDate == null) {
			if (other.accountStatusChangeDate != null)
				return false;
		} else if (!accountStatusChangeDate
				.equals(other.accountStatusChangeDate))
			return false;
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
		if (facebookUser == null) {
			if (other.facebookUser != null)
				return false;
		} else if (!facebookUser.equals(other.facebookUser))
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
		if (gender != other.gender)
			return false;
		if (googleUser == null) {
			if (other.googleUser != null)
				return false;
		} else if (!googleUser.equals(other.googleUser))
			return false;
		if (indianState != other.indianState)
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
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (passwordResetToken == null) {
			if (other.passwordResetToken != null)
				return false;
		} else if (!passwordResetToken.equals(other.passwordResetToken))
			return false;
		if (passwordResetTokenCreationTime == null) {
			if (other.passwordResetTokenCreationTime != null)
				return false;
		} else if (!passwordResetTokenCreationTime
				.equals(other.passwordResetTokenCreationTime))
			return false;
		if (registeredUser == null) {
			if (other.registeredUser != null)
				return false;
		} else if (!registeredUser.equals(other.registeredUser))
			return false;
		if (registrationToken == null) {
			if (other.registrationToken != null)
				return false;
		} else if (!registrationToken.equals(other.registrationToken))
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
		if (subscriptionFrequency != other.subscriptionFrequency)
			return false;
		if (titles == null) {
			if (other.titles != null)
				return false;
		} else if (!titles.equals(other.titles))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}
	
}