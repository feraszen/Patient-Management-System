package com.feras.patient;

import com.feras.patient.history.PatientHistoryDLL;
import com.feras.patient.model.PatientHistoryRecord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatientHistoryDLLTest {

    @Test
    void testAddHistoryRecord() {

        PatientHistoryDLL history =
                new PatientHistoryDLL();

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-01-10",
                        "Flu",
                        "Rest"));

        history.showNewestRecord();

        assertEquals(
                "Flu",
                history.getCurrentRecord()
                        .getDiagnosis());
    }

    @Test
    void testNavigateToNextRecord() {

        PatientHistoryDLL history =
                new PatientHistoryDLL();

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-01-10",
                        "Flu",
                        "Rest"));

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-01-11",
                        "Cold",
                        "Medication"));

        history.showOldestRecord();

        history.nextRecord();

        assertEquals(
                "Cold",
                history.getCurrentRecord()
                        .getDiagnosis());
    }

    @Test
    void testNavigateToPreviousRecord() {

        PatientHistoryDLL history =
                new PatientHistoryDLL();

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-01-10",
                        "Flu",
                        "Rest"));

        history.addRecord(
                new PatientHistoryRecord(
                        "2025-01-11",
                        "Cold",
                        "Medication"));

        history.showNewestRecord();

        history.previousRecord();

        assertEquals(
                "Flu",
                history.getCurrentRecord()
                        .getDiagnosis());
    }
}
