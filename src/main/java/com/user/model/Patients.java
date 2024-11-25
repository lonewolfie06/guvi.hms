package com.user.model;

public class Patients {
	private int patientID;
	private String patientName;
	private String gender;
	private String dob;
	private String contactNumber;
	private String email;
	private String address;
	private String bloodGroup;

	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patients(int patientID, String patientName, String gender, String dob, String contactNumber, String email,
			String address, String bloodGroup) {
		super();
		this.patientID = patientID;
		this.patientName = patientName;
		this.gender = gender;
		this.dob = dob;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
		this.bloodGroup = bloodGroup;
	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "Patients [patientID=" + patientID + ", patientName=" + patientName + ", gender=" + gender + ", dob="
				+ dob + ", contactNumber=" + contactNumber + ", email=" + email + ", address=" + address
				+ ", bloodGroup=" + bloodGroup + "]";
	}

}
