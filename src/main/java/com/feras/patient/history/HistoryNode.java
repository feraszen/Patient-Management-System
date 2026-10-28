package com.feras.patient.history;

import com.feras.patient.model.PatientHistoryRecord;

/**
 * Represents a node in the doubly linked list.
 */
public class HistoryNode {

    private PatientHistoryRecord record;
    private HistoryNode next;
    private HistoryNode previous;

    public HistoryNode(PatientHistoryRecord record) {
        this.record = record;
    }

    public PatientHistoryRecord getRecord() {
        return record;
    }

    public HistoryNode getNext() {
        return next;
    }

    public void setNext(HistoryNode next) {
        this.next = next;
    }

    public HistoryNode getPrevious() {
        return previous;
    }

    public void setPrevious(HistoryNode previous) {
        this.previous = previous;
    }
}
