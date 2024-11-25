package com.user.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.user.model.Prescriptions;

public class PrescriptionsDAO {
    private String jdbcURL = "jdbc:mysql://localhost:30006/hospital_management";
    private String jdbcUserName = "root";
    private String jdbcPassword = "root";

    private static final String INSERT_PRESCRIPTION_SQL = "INSERT INTO Prescriptions (AppointmentID, MedicationID, DosageInstructions, StartDate, EndDate) VALUES (?, ?, ?, ?, ?);";
    private static final String SELECT_PRESCRIPTION_BY_ID = "SELECT * FROM Prescriptions WHERE PrescriptionID = ?;";
    private static final String SELECT_ALL_PRESCRIPTIONS = "SELECT * FROM Prescriptions;";
    private static final String DELETE_PRESCRIPTION_SQL = "DELETE FROM Prescriptions WHERE PrescriptionID = ?;";
    private static final String UPDATE_PRESCRIPTION_SQL = "UPDATE Prescriptions SET AppointmentID = ?, MedicationID = ?, DosageInstructions = ?, StartDate = ?, EndDate = ? WHERE PrescriptionID = ?;";

    public PrescriptionsDAO() {}

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

    public void insertPrescription(Prescriptions prescription) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRESCRIPTION_SQL)) {
            preparedStatement.setInt(1, prescription.getAppointmentID());
            preparedStatement.setInt(2, prescription.getMedicationID());
            preparedStatement.setString(3, prescription.getDosageInstructions());
            preparedStatement.setDate(4, prescription.getStartDate());
            preparedStatement.setDate(5, prescription.getEndDate());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Prescriptions selectPrescriptionById(int id) {
        Prescriptions prescription = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRESCRIPTION_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                prescription = new Prescriptions();
                prescription.setPrescriptionID(rs.getInt("PrescriptionID"));
                prescription.setAppointmentID(rs.getInt("AppointmentID"));
                prescription.setMedicationID(rs.getInt("MedicationID"));
                prescription.setDosageInstructions(rs.getString("DosageInstructions"));
                prescription.setStartDate(rs.getDate("StartDate"));
                prescription.setEndDate(rs.getDate("EndDate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prescription;
    }

    public List<Prescriptions> selectAllPrescriptions() {
        List<Prescriptions> prescriptions = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRESCRIPTIONS)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Prescriptions prescription = new Prescriptions();
                prescription.setPrescriptionID(rs.getInt("PrescriptionID"));
                prescription.setAppointmentID(rs.getInt("AppointmentID"));
                prescription.setMedicationID(rs.getInt("MedicationID"));
                prescription.setDosageInstructions(rs.getString("DosageInstructions"));
                prescription.setStartDate(rs.getDate("StartDate"));
                prescription.setEndDate(rs.getDate("EndDate"));
                prescriptions.add(prescription);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prescriptions;
    }

    public void updatePrescription(Prescriptions prescription) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRESCRIPTION_SQL)) {
            preparedStatement.setInt(1, prescription.getAppointmentID());
            preparedStatement.setInt(2, prescription.getMedicationID());
            preparedStatement.setString(3, prescription.getDosageInstructions());
            preparedStatement.setDate(4, prescription.getStartDate());
            preparedStatement.setDate(5, prescription.getEndDate());
            preparedStatement.setInt(6, prescription.getPrescriptionID());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePrescription(int id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRESCRIPTION_SQL)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}

