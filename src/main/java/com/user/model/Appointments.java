package com.user.model;

public class Appointments {
	private int appointmentID;
	private int patientID;
	private int doctorID;
	private String appointmentDate;
	private String status;

	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointments(int appointmentID, int patientID, int doctorID, String appointmentDate, String status) {
		super();
		this.appointmentID = appointmentID;
		this.patientID = patientID;
		this.doctorID = doctorID;
		this.appointmentDate = appointmentDate;
		this.status = status;
	}

	public int getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Appointments [appointmentID=" + appointmentID + ", patientID=" + patientID + ", doctorID=" + doctorID
				+ ", appointmentDate=" + appointmentDate + ", status=" + status + "]";
	}

}
