
CREATE DATABASE hospital_management;
USE hospital_management;


CREATE TABLE Departments (
    DepartmentID INT PRIMARY KEY AUTO_INCREMENT,
    DepartmentName VARCHAR(50) NOT NULL,
    Description TEXT
);


CREATE TABLE Doctors (
    DoctorID INT PRIMARY KEY AUTO_INCREMENT,
    DoctorName VARCHAR(50) NOT NULL,
    Specialization VARCHAR(50),
    DepartmentID INT,
    ContactNumber VARCHAR(15),
    Email VARCHAR(50),
    FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID) ON DELETE SET NULL ON UPDATE CASCADE
);


CREATE TABLE Patients (
    PatientID INT PRIMARY KEY AUTO_INCREMENT,
    PatientName VARCHAR(50) NOT NULL,
    Gender ENUM('Male', 'Female', 'Other'),
    DOB DATE,
    ContactNumber VARCHAR(15),
    Email VARCHAR(50),
    Address TEXT,
    BloodGroup ENUM('A+', 'A-', 'B+', 'B-', 'AB+', 'AB-', 'O+', 'O-')
);


CREATE TABLE Appointments (
    AppointmentID INT PRIMARY KEY AUTO_INCREMENT,
    PatientID INT,
    DoctorID INT,
    AppointmentDate DATETIME NOT NULL,
    Status ENUM('Scheduled', 'Completed', 'Cancelled') DEFAULT 'Scheduled',
    FOREIGN KEY (PatientID) REFERENCES Patients(PatientID) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (DoctorID) REFERENCES Doctors(DoctorID) ON DELETE SET NULL ON UPDATE CASCADE
);


CREATE TABLE Treatments (
    TreatmentID INT PRIMARY KEY AUTO_INCREMENT,
    AppointmentID INT,
    TreatmentDescription TEXT,
    TreatmentDate DATETIME NOT NULL,
    FOREIGN KEY (AppointmentID) REFERENCES Appointments(AppointmentID) ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE Medications (
    MedicationID INT PRIMARY KEY AUTO_INCREMENT,
    MedicationName VARCHAR(50) NOT NULL,
    Dosage VARCHAR(50),
    SideEffects TEXT
);


CREATE TABLE Prescriptions (
    PrescriptionID INT PRIMARY KEY AUTO_INCREMENT,
    AppointmentID INT,
    MedicationID INT,
    DosageInstructions TEXT,
    StartDate DATE,
    EndDate DATE,
    FOREIGN KEY (AppointmentID) REFERENCES Appointments(AppointmentID) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (MedicationID) REFERENCES Medications(MedicationID) ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE Billing (
    BillID INT PRIMARY KEY AUTO_INCREMENT,
    AppointmentID INT,
    TotalAmount DECIMAL(10, 2) NOT NULL,
    PaymentStatus ENUM('Pending', 'Paid') DEFAULT 'Pending',
    PaymentDate DATE,
    FOREIGN KEY (AppointmentID) REFERENCES Appointments(AppointmentID) ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE Users (
    UserID INT PRIMARY KEY AUTO_INCREMENT,
    Username VARCHAR(50) UNIQUE NOT NULL,
    Password VARCHAR(255) NOT NULL,
    Role ENUM('Admin', 'Doctor', 'Receptionist', 'Patient') DEFAULT 'Patient'
);


CREATE TABLE UserPatient (
    UserID INT,
    PatientID INT,
    FOREIGN KEY (UserID) REFERENCES Users(UserID) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (PatientID) REFERENCES Patients(PatientID) ON DELETE CASCADE ON UPDATE CASCADE
);