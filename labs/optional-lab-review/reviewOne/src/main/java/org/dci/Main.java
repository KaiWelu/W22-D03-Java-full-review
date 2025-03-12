package org.dci;


import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {

        Ticket testTicket = new Ticket("Foot", "My foot hurts bad", "Arno", true, Status.OPEN);
        Ticket testTicket2 = new Ticket("My head hurts",
                                        "I dinged my head and I dunno what to do",
                                        "Jan",
                                        false,
                                        Status.OPEN,
                                        "Kai");
        System.out.println(testTicket);
        System.out.println(testTicket2);

    }
}