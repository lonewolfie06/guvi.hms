package com.user.model;

import java.sql.Date;

public class Prescriptions {
	private int prescriptionID;
	private int appointmentID;
	private int medicationID;
	private String dosageInstructions;
	private Date startDate;
	private Date endDate;

	public Prescriptions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prescriptions(int prescriptionID, int appointmentID, int medicationID, String dosageInstructions,
			Date startDate, Date endDate) {
		super();
		this.prescriptionID = prescriptionID;
		this.appointmentID = appointmentID;
		this.medicationID = medicationID;
		this.dosageInstructions = dosageInstructions;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getPrescriptionID() {
		return prescriptionID;
	}

	public void setPrescriptionID(int prescriptionID) {
		this.prescriptionID = prescriptionID;
	}

	public int getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}

	public int getMedicationID() {
		return medicationID;
	}

	public void setMedicationID(int medicationID) {
		this.medicationID = medicationID;
	}

	public String getDosageInstructions() {
		return dosageInstructions;
	}

	public void setDosageInstructions(String dosageInstructions) {
		this.dosageInstructions = dosageInstructions;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Prescriptions [prescriptionID=" + prescriptionID + ", appointmentID=" + appointmentID
				+ ", medicationID=" + medicationID + ", dosageInstructions=" + dosageInstructions + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}

}
