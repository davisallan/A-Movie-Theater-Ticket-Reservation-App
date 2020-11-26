package Model;

import java.util.ArrayList;

public class TicketList {

	private ArrayList<Ticket> ticketList;
	
	// search for ticket by ticketId and return that ticket
	public Ticket searchTicket(int ticketId) {
		Ticket myTicket = null;
		for (Ticket t: ticketList) {
			if(t.getTicketId() == ticketId) {
				myTicket = t;
			}
		}
		return myTicket;
	}
	
}
