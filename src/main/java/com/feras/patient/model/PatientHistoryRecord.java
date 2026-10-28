package com.feras.patient.model;

public class PatientHistoryRecord {

    private String visitDate;
    private String diagnosis;
    private String treatmentNotes;

    public PatientHistoryRecord(String visitDate,
                                String diagnosis,
                                String treatmentNotes) {

        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.treatmentNotes = treatmentNotes;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatmentNotes() {
        return treatmentNotes;
    }

    @Override
    public String toString() {
        return "\nVisit Date: " + visitDate
                + "\nDiagnosis: " + diagnosis
                + "\nTreatment Notes: " + treatmentNotes;
    }
}
