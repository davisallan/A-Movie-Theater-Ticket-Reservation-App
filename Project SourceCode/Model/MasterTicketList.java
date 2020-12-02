package Model;

import java.util.ArrayList;

/**
 * The type Master ticket list.
 */
public class MasterTicketList {

	private ArrayList<Ticket> ticketList;

	/**
	 * Instantiates a new Master ticket list.
	 */
	public MasterTicketList() {
		ticketList = new ArrayList<>();
	}

	/**
	 * Gets ticket list.
	 *
	 * @return the ticket list
	 */
	public ArrayList<Ticket> getTicketList() {
		return ticketList;
	}

	/**
	 * Gets most recent ticket.
	 *
	 * @return the most recent ticket
	 */
	public Ticket getMostRecentTicket() {
		int index = ticketList.size();
		return ticketList.get(index - 1);
	}

	/**
	 * Search ticket ticket.
	 *
	 * @param ticketId the ticket id
	 * @return the ticket
	 */
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

	/**
	 * Display all tickets.
	 */
	public void displayAllTickets() {
		for (Ticket t: ticketList) {
			System.out.println(t);
		}
	}

	/**
	 * Remove ticket.
	 *
	 * @param ticketToRemove the ticket to remove
	 */
	public void removeTicket(Ticket ticketToRemove) {
		ticketList.remove(ticketToRemove);
	}
	
}
