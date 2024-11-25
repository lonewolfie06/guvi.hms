package com.user.model;

public class Medications {
	private int medicationID;
	private String medicationName;
	private String dosage;
	private String sideEffects;

	public Medications() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medications(int medicationID, String medicationName, String dosage, String sideEffects) {
		super();
		this.medicationID = medicationID;
		this.medicationName = medicationName;
		this.dosage = dosage;
		this.sideEffects = sideEffects;
	}

	public int getMedicationID() {
		return medicationID;
	}

	public void setMedicationID(int medicationID) {
		this.medicationID = medicationID;
	}

	public String getMedicationName() {
		return medicationName;
	}

	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getSideEffects() {
		return sideEffects;
	}

	public void setSideEffects(String sideEffects) {
		this.sideEffects = sideEffects;
	}

	@Override
	public String toString() {
		return "Medications [medicationID=" + medicationID + ", medicationName=" + medicationName + ", dosage=" + dosage
				+ ", sideEffects=" + sideEffects + "]";
	}

}
