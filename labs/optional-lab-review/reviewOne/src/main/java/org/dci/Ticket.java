package org.dci;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Ticket {
    private final String id = UUID.randomUUID().toString();
    private final LocalDateTime dateTime = LocalDateTime.now();
    private String title;
    private String description;
    private String customer;
    private boolean priority;
    private Status status;
    private String agent = "none";

    public Ticket(String title, String description, String customer, boolean priority, Status status) {
        this.title = title;
        this.description = description;
        this.customer = customer;
        this.priority = priority;
        this.status = status;
        this.agent = "none";
    }


    public Ticket(String title, String description, String customer, boolean priority, Status status, String agent) {
        this.title = title;
        this.description = description;
        this.customer = customer;
        this.priority = priority;
        this.status = status;
        this.agent = agent;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateTime.format(formatter);

        return  "ID: " + id + "\n" +
                "Date: " + formattedDate + "\n" +
                "Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "Customer: " + customer + "\n" +
                "Status: " + status + "\n" +
                "Priority: " + priority + "\n" +
                "Assigned Agent: " + agent + "\n";
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }
}
