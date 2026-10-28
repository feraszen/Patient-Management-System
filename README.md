
# Patient Management System

## Student Information

**Name:** Feras Zen Alabdeen  
**Course:** Data Structures and Algorithms  
**Project:** Midterm Project - Patient Management System

---

# Project Overview

This project simulates a patient management system for a healthcare environment. It uses different data structures to manage patient information efficiently.

### Features

- Add patients to a waiting queue
- Serve patients using FIFO order
- Insert emergency patients at a specific position
- Display all patients in the waiting queue
- Store patient medical history using a Doubly Linked List
- View oldest and newest records
- Navigate forward and backward through patient history
- Unit testing using JUnit

---

# Data Structures Used

## Queue

The waiting room is implemented using a Queue data structure.

### Operations Implemented

- Add Patient
- Serve Patient
- Emergency Insert
- Display Waiting Queue

---

## Doubly Linked List

The patient history system is implemented using a Doubly Linked List.

### Operations Implemented

- Show Oldest Record
- Show Newest Record
- Move to Next Record
- Move to Previous Record

---

# Patient History Records

The system contains 10 patient history records:

1. Flu
2. Headache
3. Cold
4. Back Pain
5. Allergy
6. Stomach Infection
7. Sprained Ankle
8. Migraine
9. High Blood Pressure
10. Diabetes Follow-up

---

# Documentation Questions

## Question 1

### Why was a Queue appropriate for the waiting room?

A Queue was appropriate for the patient waiting room because patients are generally served in the same order they arrive. The first patient to enter the waiting room is the first patient to be served. This follows the First-In-First-Out (FIFO) principle, which helps maintain fairness and organization in the patient management process. Using a Queue ensures that no patient is skipped unless an emergency patient is inserted into a priority position.

---

## Question 2

### Explain the FIFO principle.

FIFO stands for First-In-First-Out. It means that the first item added to the queue is the first item removed from the queue. In this project, the first patient who enters the waiting room is the first patient served by the healthcare provider. This approach maintains fairness and an organized patient flow.

---

## Question 3

### What could happen if a Stack was used instead of a Queue?

If a Stack were used, patients would be treated according to the Last-In-First-Out (LIFO) principle. This means the most recently arrived patient would be served first. As a result, patients who arrived earlier could experience excessive waiting times, making the system unfair and unsuitable for a waiting room environment.

---

## Question 4

### How could this system be improved?

Several improvements could be made:

- Save patient data to a file or database.
- Allow searching for patient records by ID.
- Add patient appointment scheduling.
- Include patient priority levels.
- Create a graphical user interface (GUI).
- Generate reports and statistics.

---

## Question 5

### Why is a Doubly Linked List appropriate for patient history?

A Doubly Linked List is appropriate because users need to navigate both forward and backward through medical records. Each node stores references to both the next and previous records, making navigation efficient and easy.

---

## Question 6

### What happens if next or previous pointers are not updated correctly?

If the next or previous pointers are not updated properly, records may become disconnected or inaccessible. Navigation may fail, records may be skipped, and the integrity of the linked list structure can be lost.

---

## Question 7

### Why use a Doubly Linked List instead of an Array or ArrayList?

A Doubly Linked List allows efficient navigation in both directions without needing index positions. It also supports easier insertion and deletion of records without shifting elements. This makes it well suited for browsing patient history records.

---

# Unit Testing

The project includes six JUnit tests.

## PatientHistoryDLL Tests

### testAddHistoryRecord()

Verifies that a patient history record is successfully added to the history list.

### testNavigateToNextRecord()

Verifies that navigation moves correctly to the next history record.

### testNavigateToPreviousRecord()

Verifies that navigation moves correctly to the previous history record.

---

## PatientWaitingQueue Tests

### testAddPatient()

Verifies that adding a patient increases the queue size.

### testEmergencyPatientInsertion()

Verifies that an emergency patient can be inserted at a priority position in the queue.

### testQueueInitiallyEmpty()

Verifies that a newly created queue is empty.

---

# Testing Results

All JUnit tests passed successfully.

```text
Tests run: 6
Failures: 0
Errors: 0
Skipped: 0

BUILD SUCCESS
```

---

# Demo Video

The project demonstration video is submitted separately with the assignment submission.


# Conclusion

This project successfully demonstrates the implementation of Queue and Doubly Linked List data structures in a healthcare-based patient management system. The system supports patient queue management, medical history navigation, and automated testing using JUnit.
