# Tech Support Ticket Management System Lab

## Overview

You are tasked with developing a Ticket Management System for a fictional tech support company. This system will allow support staff to create, update, and manage customer support tickets. Additionally, the system should automatically monitor and escalate overdue tickets. Through this project, you’ll build a robust application that uses a variety of Java concepts—from basic data types and control flow to advanced topics like streams, lambdas, and multithreading.

---

## Requirements

### 1. **Project Setup**
- **Maven Build:**  
  Initialize a Maven project that manages your dependencies. Be sure to include JUnit for testing.

### 2. **Core Domain and Data Management**
- **Ticket Entity:**  
  Create a `Ticket` class that encapsulates details such as:
  - A unique ticket ID (numerical and auto-assigned).
  - Title and description.
  - Priority and status (e.g., open, in progress, resolved).
  - Creation timestamp (use Java’s Date and Time API).
  - Optional assignment to a support agent.

- **User Hierarchy:**  
  Design an inheritance structure for users. Define an abstract or interface-based `User` with common properties (e.g., id, name, email) and methods. Implement at least two types of users (for example, an admin and a regular support agent) that override behavior where appropriate.

- **Data Storage:**  
  Use appropriate collections to store and manage your data:
  - A dynamic list (like an `ArrayList`) for your tickets.
  - A mapping (such as a `HashMap`) to store user information.
  - A set (e.g., `HashSet`) to ensure unique ticket titles or similar constraints.

### 3. **Business Features**
- **Ticket Operations:**  
  Build features that allow the creation, assignment, updating, and querying of tickets. These operations should include:
  - Adding new tickets with validation for unique titles.
  - Reassigning tickets to different users.
  - Changing ticket status and updating details.
  
- **Data Processing and Querying:**  
  Implement functionalities to:
  - Sort or filter tickets based on attributes like priority or status.
  - Use Java streams and lambda expressions to process collections in a concise and functional style.
  - Leverage the Optional class to handle cases where a ticket might not be found.

### 4. **Type Conversions and Casting**
- **Numeric and Object Types:**  
  Within your code, include examples of converting between primitive data types and their wrapper classes. Also, demonstrate the use of widening and narrowing conversions.
  
- **Reference Casting:**  
  Utilize upcasting and downcasting in your user management. For instance, assign a more specific user type to a generic reference and then safely cast it back when necessary.

### 5. **Concurrency and Background Processing**
- **Overdue Ticket Scanner:**  
  Implement a background process that runs on a separate thread. This thread should periodically scan for tickets that have remained unresolved beyond a given timeframe (e.g., 7 days) and perform an action, such as logging a warning or escalating the ticket.
  
- **Thread Safety:**  
  Ensure that access to shared resources (like your ticket collection) is thread-safe. Use synchronization techniques to prevent race conditions during updates.

### 6. **Testing**
- **JUnit Tests:**  
  Write a suite of unit tests that validate your system’s functionality. Cover scenarios such as ticket creation, assignment, status updates, and edge cases (like trying to update a non-existent ticket).

---

## Additional Guidelines

- **Design Considerations:**  
  Your solution should demonstrate good object-oriented design principles. Organize your code in a modular fashion with clearly defined responsibilities.
  
- **User Interface (Optional):**  
  For an extra challenge, implement a simple command-line interface (CLI) that allows users to interact with your system—creating tickets, viewing reports, and triggering background processes.

- **Documentation:**  
  Include inline comments and a brief project documentation file summarizing how your design addresses the various features and Java concepts.
