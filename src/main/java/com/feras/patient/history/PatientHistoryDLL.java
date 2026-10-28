package com.feras.patient.history;

import com.feras.patient.model.PatientHistoryRecord;

/**
 * Manages patient history using a doubly linked list.
 */
public class PatientHistoryDLL {

    private HistoryNode head;
    private HistoryNode tail;
    private HistoryNode current;

    /**
     * Adds a new record to the end of the list.
     *
     * @param record patient history record
     */
    public void addRecord(PatientHistoryRecord record) {

        HistoryNode newNode = new HistoryNode(record);

        if (head == null) {
            head = tail = current = newNode;
            return;
        }

        tail.setNext(newNode);
        newNode.setPrevious(tail);

        tail = newNode;
    }

    /**
     * Displays the oldest record.
     */
    public void showOldestRecord() {

        if (head == null) {
            System.out.println("No records available.");
            return;
        }

        current = head;

        System.out.println("\nOldest Record:");
        System.out.println(current.getRecord());
    }

    /**
     * Displays the newest record.
     */
    public void showNewestRecord() {

        if (tail == null) {
            System.out.println("No records available.");
            return;
        }

        current = tail;

        System.out.println("\nNewest Record:");
        System.out.println(current.getRecord());
    }

    /**
     * Navigates to the next record.
     */
    public void nextRecord() {

        if (current == null ||
                current.getNext() == null) {

            System.out.println(
                    "Already at the newest record.");
            return;
        }

        current = current.getNext();

        System.out.println("\nNext Record:");
        System.out.println(current.getRecord());
    }

    /**
     * Navigates to the previous record.
     */
    public void previousRecord() {

        if (current == null ||
                current.getPrevious() == null) {

            System.out.println(
                    "Already at the oldest record.");
            return;
        }

        current = current.getPrevious();

        System.out.println("\nPrevious Record:");
        System.out.println(current.getRecord());
    }

    /**
     * Returns the current record.
     * Used for unit testing.
     *
     * @return current patient history record
     */
    public PatientHistoryRecord getCurrentRecord() {

        if (current == null) {
            return null;
        }

        return current.getRecord();
    }
}
