package com.user.model;

import java.math.BigDecimal;
import java.sql.Date;

public class Billing {
	private int billID;
	private int appointmentID;
	private BigDecimal totalAmount;
	private String paymentStatus;
	private Date paymentDate;

	public Billing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Billing(int billID, int appointmentID, BigDecimal totalAmount, String paymentStatus, Date paymentDate) {
		super();
		this.billID = billID;
		this.appointmentID = appointmentID;
		this.totalAmount = totalAmount;
		this.paymentStatus = paymentStatus;
		this.paymentDate = paymentDate;
	}

	public int getBillID() {
		return billID;
	}

	public void setBillID(int billID) {
		this.billID = billID;
	}

	public int getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "Billing [billID=" + billID + ", appointmentID=" + appointmentID + ", totalAmount=" + totalAmount
				+ ", paymentStatus=" + paymentStatus + ", paymentDate=" + paymentDate + "]";
	}

}
