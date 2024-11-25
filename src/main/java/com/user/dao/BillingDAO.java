package com.user.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.user.model.Billing;

public class BillingDAO {
    private String jdbcURL = "jdbc:mysql://localhost:30006/hospital_management";
    private String jdbcUserName = "root";
    private String jdbcPassword = "root";

    private static final String INSERT_BILLING_SQL = "INSERT INTO Billing (AppointmentID, TotalAmount, PaymentStatus, PaymentDate) VALUES (?, ?, ?, ?);";
    private static final String SELECT_BILLING_BY_ID = "SELECT * FROM Billing WHERE BillID = ?;";
    private static final String SELECT_ALL_BILLING = "SELECT * FROM Billing;";
    private static final String DELETE_BILLING_SQL = "DELETE FROM Billing WHERE BillID = ?;";
    private static final String UPDATE_BILLING_SQL = "UPDATE Billing SET AppointmentID = ?, TotalAmount = ?, PaymentStatus = ?, PaymentDate = ? WHERE BillID = ?;";

    public BillingDAO() {}

    private Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUserName, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void insertBilling(Billing billing) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BILLING_SQL)) {
            preparedStatement.setInt(1, billing.getAppointmentID());
            preparedStatement.setBigDecimal(2, billing.getTotalAmount());
            preparedStatement.setString(3, billing.getPaymentStatus());
            preparedStatement.setDate(4, billing.getPaymentDate());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Billing selectBillingById(int id) {
        Billing billing = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BILLING_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                billing = new Billing();
                billing.setBillID(rs.getInt("BillID"));
                billing.setAppointmentID(rs.getInt("AppointmentID"));
                billing.setTotalAmount(rs.getBigDecimal("TotalAmount"));
                billing.setPaymentStatus(rs.getString("PaymentStatus"));
                billing.setPaymentDate(rs.getDate("PaymentDate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return billing;
    }

    public List<Billing> selectAllBilling() {
        List<Billing> billingList = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BILLING)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Billing billing = new Billing();
                billing.setBillID(rs.getInt("BillID"));
                billing.setAppointmentID(rs.getInt("AppointmentID"));
                billing.setTotalAmount(rs.getBigDecimal("TotalAmount"));
                billing.setPaymentStatus(rs.getString("PaymentStatus"));
                billing.setPaymentDate(rs.getDate("PaymentDate"));
                billingList.add(billing);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return billingList;
    }

    public void updateBilling(Billing billing) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BILLING_SQL)) {
            preparedStatement.setInt(1, billing.getAppointmentID());
            preparedStatement.setBigDecimal(2, billing.getTotalAmount());
            preparedStatement.setString(3, billing.getPaymentStatus());
            preparedStatement.setDate(4, billing.getPaymentDate());
            preparedStatement.setInt(5, billing.getBillID());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBilling(int id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BILLING_SQL)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
