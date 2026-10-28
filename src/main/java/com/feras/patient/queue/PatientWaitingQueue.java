package com.feras.patient.queue;

import java.util.LinkedList;

import com.feras.patient.model.Patient;

/**
 * Manages the patient waiting queue.
 */
public class PatientWaitingQueue {

    private LinkedList<Patient> queue;

    public PatientWaitingQueue() {
        queue = new LinkedList<>();
    }

    public void addPatient(Patient patient) {
        queue.add(patient);
        System.out.println("Patient added successfully.");
    }

    public void servePatient() {

        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Patient servedPatient = queue.removeFirst();

        System.out.println("\nServing Patient:");
        System.out.println(servedPatient);
    }

    public void insertEmergencyPatient(int position,
                                       Patient patient) {

        if (position < 0 || position > queue.size()) {
            System.out.println("Invalid position.");
            return;
        }

        queue.add(position, patient);

        System.out.println(
                "Emergency patient inserted successfully.");
    }

    public void displayPatients() {

        if (queue.isEmpty()) {
            System.out.println("No patients in the queue.");
            return;
        }

        System.out.println("\nCurrent Waiting Queue:");

        for (Patient patient : queue) {
            System.out.println(patient);
        }
    }

    public int getSize() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public Patient peekPatient() {

        if (queue.isEmpty()) {
            return null;
        }

        return queue.getFirst();
    }
}
