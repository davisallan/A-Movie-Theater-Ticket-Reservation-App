package Model;

import java.util.ArrayList;

public class MasterTicketList {

	private ArrayList<Ticket> ticketList;

	public MasterTicketList() {
		ticketList = new ArrayList<>();
	}

	public ArrayList<Ticket> getTicketList() {
		return ticketList;
	}

	public Ticket getMostRecentTicket() {
		int index = ticketList.size();
		return ticketList.get(index - 1);
	}

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

	public void displayAllTickets() {
		for (Ticket t: ticketList) {
			System.out.println(t);
		}
	}

	public void removeTicket(Ticket ticketToRemove) {
		ticketList.remove(ticketToRemove);
	}
	
}
