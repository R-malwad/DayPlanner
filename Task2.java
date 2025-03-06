import java.util.*;

class Patient {
    String id, name, disease;
    int age;
    
    public Patient(String id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }
    
    public void displayPatient() {
        System.out.println("Patient ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease);
    }
}

class Appointment {
    String appointmentId, patientId, doctorName, date;
    
    public Appointment(String appointmentId, String patientId, String doctorName, String date) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorName = doctorName;
        this.date = date;
    }
    
    public void displayAppointment() {
        System.out.println("Appointment ID: " + appointmentId + ", Patient ID: " + patientId + ", Doctor: " + doctorName + ", Date: " + date);
    }
}

class HospitalManagementSystem {
    List<Patient> patients = new ArrayList<>();
    List<Appointment> appointments = new ArrayList<>();
    
    public void registerPatient(String id, String name, int age, String disease) {
        patients.add(new Patient(id, name, age, disease));
    }
    
    public void scheduleAppointment(String appointmentId, String patientId, String doctorName, String date) {
        appointments.add(new Appointment(appointmentId, patientId, doctorName, date));
    }
    
    public void displayAllPatients() {
        for (Patient p : patients) {
            p.displayPatient();
        }
    }
    
    public void displayAllAppointments() {
        for (Appointment a : appointments) {
            a.displayAppointment();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        HospitalManagementSystem hms = new HospitalManagementSystem();
        
        hms.registerPatient("P001", "John Doe", 30, "Flu");
        hms.registerPatient("P002", "Jane Smith", 25, "Allergy");
        
        hms.scheduleAppointment("A001", "P001", "Dr. Brown", "2025-03-10");
        hms.scheduleAppointment("A002", "P002", "Dr. White", "2025-03-11");
        
        System.out.println("--- Registered Patients ---");
        hms.displayAllPatients();
        
        System.out.println("--- Scheduled Appointments ---");
        hms.displayAllAppointments();
    }
}
