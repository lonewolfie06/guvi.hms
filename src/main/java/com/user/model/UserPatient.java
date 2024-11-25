package com.user.model;

public class UserPatient {
	private int userID;
	private int patientID;

	public UserPatient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPatient(int userID, int patientID) {
		super();
		this.userID = userID;
		this.patientID = patientID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	@Override
	public String toString() {
		return "UserPatient [userID=" + userID + ", patientID=" + patientID + "]";
	}

}
