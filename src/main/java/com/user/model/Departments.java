package com.user.model;

public class Departments {
	private int departmentID;
	private String departmentName;
	private String description;

	public Departments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departments(int departmentID, String departmentName, String description) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.description = description;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Departments [departmentID=" + departmentID + ", departmentName=" + departmentName + ", description="
				+ description + "]";
	}

}
