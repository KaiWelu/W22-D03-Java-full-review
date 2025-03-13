package org.dci;


import org.dci.controller.TicketController;
import org.dci.model.Ticket;

public class Main {
    public static void main(String[] args) {

        TicketController tController = new TicketController();
        tController.addTicket("My head hurts",
                              "I dinged my head and I dunno what to do",
                              "Jan",
                              false,
                              Status.OPEN,
                              "Kai");
        tController.addTicket("Foot",
                              "My foot hurts bad",
                              "Arno",
                              true,
                              Status.OPEN);
        tController.addTicket("Monitor not working",
                              "My Monitor just shut down and I feel threatened. I already " +
                              "turned it on and off again",
                              "Carla",
                              false,
                              Status.OPEN);

        tController.printAllTickets(true);

        System.out.println("TESTING CRUD");
        String testId = tController.getAllTickets().entrySet().iterator().next().getKey();
        System.out.println("TEST ID");
        System.out.println(testId + "\n");

        System.out.println("UPDATE TICKET");
        Ticket testTicket = tController.getTicketById(testId);
        System.out.println("BEFORE");
        tController.printAllTickets(true);
        testTicket.setTitle("Yo my ass hurts");
        tController.updateTicketById(testTicket.getId(), testTicket);
        System.out.println("AFTER");
        tController.printAllTickets(true);


        System.out.println("REMOVE ENTRY");
        tController.deleteTicketById(testId);

        tController.printAllTickets(true);

    }
}