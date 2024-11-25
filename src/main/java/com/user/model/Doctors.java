package com.user.model;

public class Doctors {
	private int doctorID;
	private String doctorName;
	private String specialization;
	private int departmentID;
	private String contactNumber;
	private String email;

	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctors(int doctorID, String doctorName, String specialization, int departmentID, String contactNumber,
			String email) {
		super();
		this.doctorID = doctorID;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.departmentID = departmentID;
		this.contactNumber = contactNumber;
		this.email = email;
	}

	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
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

	@Override
	public String toString() {
		return "Doctors [doctorID=" + doctorID + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", departmentID=" + departmentID + ", contactNumber=" + contactNumber + ", email=" + email + "]";
	}

}
