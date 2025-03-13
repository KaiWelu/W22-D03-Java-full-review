package org.dci.controller;

import org.dci.Status;
import org.dci.model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketController {
    private final HashMap<String, Ticket> ticketList = new HashMap<>();


    public void addTicket(String title, String description, String customer, boolean priority, Status status) {
        Ticket ticket = new Ticket(title, description, customer, priority, status);
        ticketList.put(ticket.getId(), ticket);
        System.out.println("Ticket added with id: " + ticket.getId());
        System.out.println(ticket.getTitle() + "\n");
    }

    // Overloaded with agent param
    public void addTicket(String title, String description, String customer, boolean priority, Status status, String agent) {
        Ticket ticket = new Ticket(title, description, customer, priority, status, agent);
        ticketList.put(ticket.getId(), ticket);
        System.out.println("Ticket added with id: " + ticket.getId());
        System.out.println(ticket.getTitle() + "\n");
    }

    // Overloaded with Ticket as param
    public void addTicket(Ticket ticket) {
        ticketList.put(ticket.getId(), ticket);
        System.out.println("Ticket added with id: " + ticket.getId());
        System.out.println(ticket.getTitle() + "\n");
    }

    public Ticket getTicketById(String id) {
        return ticketList.get(id);
    }

    public void deleteTicketById(String id) {
        ticketList.remove(id);
        System.out.println("Ticket removed!");
    }

    public void updateTicketById(String id, Ticket ticket) {
        ticket.setId(id);
        ticketList.remove(id);
        ticketList.put(ticket.getId(), ticket);
        System.out.println("Ticket updated!");
    }


    public HashMap<String, Ticket> getAllTickets() {
        return ticketList;
    }

    public void printAllTickets(boolean shortForm) {
        System.out.println("PRINTING ALL TICKETS\n");
        if(shortForm) {
            for(Map.Entry<String, Ticket> entry : ticketList.entrySet()) {
                System.out.println("Entry ID: " + entry.getKey());
                System.out.println("Title: " + entry.getValue().getTitle());
                System.out.println("Description: " + entry.getValue().getDescription() + "\n");
            }
        }else {
            for(Map.Entry<String, Ticket> entry : ticketList.entrySet()) {
                System.out.println("Entry ID: " + entry.getKey());
                System.out.println(entry.getValue());
            }
        }


    }




}
