package com.user.model;

public class Users {
	private int userID;
	private String username;
	private String password;
	private String role;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int userID, String username, String password, String role) {
		super();
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Users [userID=" + userID + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}

}
