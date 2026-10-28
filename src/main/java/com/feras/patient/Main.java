package com.feras.patient;

import java.util.Scanner;

import com.feras.patient.history.PatientHistoryDLL;
import com.feras.patient.model.Patient;
import com.feras.patient.model.PatientHistoryRecord;
import com.feras.patient.queue.PatientWaitingQueue;
import com.feras.patient.ui.MenuSystem;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PatientWaitingQueue waitingQueue =
                new PatientWaitingQueue();

        PatientHistoryDLL history =
                new PatientHistoryDLL();

        MenuSystem menu =
                new MenuSystem();

        loadPatientHistory(history);

        int choice;

        do {

            menu.displayMenu();

            System.out.print("\nEnter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Patient ID: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.nextLine();

                    System.out.print("Enter Reason For Visit: ");
                    String reasonForVisit = scanner.nextLine();

                    waitingQueue.addPatient(
                            new Patient(
                                    patientId,
                                    patientName,
                                    reasonForVisit));

                    break;

                case 2:

                    waitingQueue.servePatient();

                    break;

                case 3:

                    System.out.print("Enter Position: ");
                    int position = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Patient ID: ");
                    int emergencyId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String emergencyName = scanner.nextLine();

                    System.out.print("Enter Reason For Visit: ");
                    String emergencyReason = scanner.nextLine();

                    waitingQueue.insertEmergencyPatient(
                            position,
                            new Patient(
                                    emergencyId,
                                    emergencyName,
                                    emergencyReason));

                    break;

                case 4:

                    waitingQueue.displayPatients();

                    break;

                case 5:

                    history.showOldestRecord();

                    break;

                case 6:

                    history.showNewestRecord();

                    break;

                case 7:

                    history.nextRecord();

                    break;

                case 8:

                    history.previousRecord();

                    break;

                case 9:

                    System.out.println("Exiting program...");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 9);

        scanner.close();
    }

    private static void loadPatientHistory(
            PatientHistoryDLL history) {

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-01-10",
                        "Flu",
                        "Rest and medication"));

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-01-20",
                        "Headache",
                        "Pain medication"));

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-02-01",
                        "Cold",
                        "Drink fluids"));

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-02-15",
                        "Back Pain",
                        "Physiotherapy exercises"));

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-03-01",
                        "Allergy",
                        "Antihistamine prescribed"));

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-03-18",
                        "Stomach Infection",
                        "Antibiotics prescribed"));

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-04-05",
                        "Sprained Ankle",
                        "Rest and ice therapy"));

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-04-22",
                        "Migraine",
                        "Prescribed migraine medication"));

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-05-10",
                        "High Blood Pressure",
                        "Lifestyle changes recommended"));

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-06-02",
                        "Diabetes Follow-up",
                        "Blood sugar levels stable"));
    }
}
