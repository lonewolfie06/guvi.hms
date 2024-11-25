package com.user.model;

import java.sql.Timestamp;

public class Treatments {
	private int treatmentID;
	private int appointmentID;
	private String treatmentDescription;
	private Timestamp treatmentDate;

	public Treatments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Treatments(int treatmentID, int appointmentID, String treatmentDescription, Timestamp treatmentDate) {
		super();
		this.treatmentID = treatmentID;
		this.appointmentID = appointmentID;
		this.treatmentDescription = treatmentDescription;
		this.treatmentDate = treatmentDate;
	}

	public int getTreatmentID() {
		return treatmentID;
	}

	public void setTreatmentID(int treatmentID) {
		this.treatmentID = treatmentID;
	}

	public int getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}

	public String getTreatmentDescription() {
		return treatmentDescription;
	}

	public void setTreatmentDescription(String treatmentDescription) {
		this.treatmentDescription = treatmentDescription;
	}

	public Timestamp getTreatmentDate() {
		return treatmentDate;
	}

	public void setTreatmentDate(Timestamp treatmentDate) {
		this.treatmentDate = treatmentDate;
	}

	@Override
	public String toString() {
		return "Treatments [treatmentID=" + treatmentID + ", appointmentID=" + appointmentID + ", treatmentDescription="
				+ treatmentDescription + ", treatmentDate=" + treatmentDate + "]";
	}

}
