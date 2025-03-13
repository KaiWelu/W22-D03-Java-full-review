package org.dci.model;

import org.dci.Status;

import java.time.LocalDateTime;

public class PublicTicket {
    public String id;
    public String dateTime;
    public String title;
    public String description;
    public String customer;
    public boolean priority;
    public Status status;
    public String agent = "none";

    public PublicTicket(String id,
                        LocalDateTime dateTime,
                        String title,
                        String description,
                        String customer,
                        boolean priority,
                        Status status) {
        this.id = id;
        this.dateTime = dateTime.toString();
        this.title = title;
        this.description = description;
        this.customer = customer;
        this.priority = priority;
        this.status = status;
    }

    public PublicTicket(String id,
                        LocalDateTime dateTime,
                        String title,
                        String description,
                        String customer,
                        boolean priority,
                        Status status,
                        String agent) {
        this.id = id;
        this.dateTime = dateTime.toString();
        this.title = title;
        this.description = description;
        this.customer = customer;
        this.priority = priority;
        this.status = status;
        this.agent = agent;
    }


}
