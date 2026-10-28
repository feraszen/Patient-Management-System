package com.feras.patient;

import com.feras.patient.model.Patient;
import com.feras.patient.queue.PatientWaitingQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatientWaitingQueueTest {

    @Test
    void testAddPatient() {

        PatientWaitingQueue queue =
                new PatientWaitingQueue();

        queue.addPatient(
                new Patient(
                        1,
                        "John Smith",
                        "Fever"));

        assertEquals(
                1,
                queue.getSize());
    }

    @Test
    void testEmergencyPatientInsertion() {

        PatientWaitingQueue queue =
                new PatientWaitingQueue();

        queue.addPatient(
                new Patient(
                        1,
                        "John",
                        "Fever"));

        queue.addPatient(
                new Patient(
                        2,
                        "Sarah",
                        "Headache"));

        queue.insertEmergencyPatient(
                0,
                new Patient(
                        3,
                        "Mike",
                        "Emergency"));

        assertEquals(
                "Mike",
                queue.peekPatient().getName());
    }

    @Test
    void testQueueInitiallyEmpty() {

        PatientWaitingQueue queue =
                new PatientWaitingQueue();

        assertTrue(
                queue.isEmpty());
    }
}
