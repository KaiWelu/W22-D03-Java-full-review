package org.dci.data;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.dci.model.PublicTicket;
import org.dci.model.Ticket;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JsonFileHandler {
    private ArrayList<PublicTicket> ticketListGlobal = new ArrayList<>();


//    public HashMap<String, Ticket> getTicketList() {
//        return ticketList;
//    }
//
//    public void setTicketList(HashMap<String, Ticket> ticketList) {
//        this.ticketList = ticketList;
//    }

    public void writeToFile(HashMap<String, Ticket> ticketList) throws IOException {
        // this is just a workarround, we need a custom type adapter here
        for(Map.Entry<String, Ticket> entry : ticketList.entrySet()) {
            Ticket value = entry.getValue();
            ticketListGlobal.add(new PublicTicket(value.getId(), value.getDateTime(), value.getTitle(),
                                                  value.getDescription(), value.getCustomer(), value.getPriority(),
                                                  value.getStatus(), value.getAgent()));
        }
        System.out.println(ticketListGlobal);

        // creates a gson instance with formatting
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // set up a file writer
        FileWriter writer = new FileWriter("testTicket.json");
        gson.toJson(ticketListGlobal, writer);
        System.out.println("Files has been written!");
        writer.close();
    }
}
