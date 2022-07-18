package com.cg.ataproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(name = "userEmail", nullable = false, unique = true)
	private String userEmail;

	@Column(name = "userDob", nullable = false, length = 20)
	private String userDob;

	@Column(name = "usermobileNo", nullable = false, length = 20)
	private long userMobileNo;

	@Column(name = "userName", nullable = false, length = 20)
	private String userName;

	@Column(name = "userAge", nullable = false, length = 3)
	private int userAge;

	public User() {
		super();
	}

	public User(int userId, String userEmail, String userDob) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userDob = userDob;
	}

	public User(int userId, String userEmail, String userDob, long userMobileNo) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userDob = userDob;
		this.userMobileNo = userMobileNo;
	}

	public User(int userId, String userEmail, String userDob, long userMobileNo, String userName) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userDob = userDob;
		this.userMobileNo = userMobileNo;
		this.userName = userName;
	}

	public User(int userId, String userEmail, String userDob, long userMobileNo, String userName, int userAge) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userDob = userDob;
		this.userMobileNo = userMobileNo;
		this.userName = userName;
		this.userAge = userAge;
	}

	public User(int userId, String userEmail, String userDob, long userMobileNo, String userName, int userAge,
			String userGender) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userDob = userDob;
		this.userMobileNo = userMobileNo;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}

	public User(int userId, String userEmail, String userDob, long userMobileNo, String userName, int userAge,
			String userGender, String userAddress) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userDob = userDob;
		this.userMobileNo = userMobileNo;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		this.userAddress = userAddress;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserDob() {
		return userDob;
	}

	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}

	public long getUserMobileNo() {
		return userMobileNo;
	}

	public void setUserMobileNo(long userMobileNo) {
		this.userMobileNo = userMobileNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Column(nullable = false, length = 20)
	private String userGender;
	@Column(nullable = false, length = 20)
	private String userAddress;

	public User(int userId, String userEmail) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userEmail=" + userEmail + ", userDob=" + userDob + ", userMobileNo="
				+ userMobileNo + ", userName=" + userName + ", userAge=" + userAge + ", userGender=" + userGender
				+ ", userAddress=" + userAddress + "]";
	}

}
