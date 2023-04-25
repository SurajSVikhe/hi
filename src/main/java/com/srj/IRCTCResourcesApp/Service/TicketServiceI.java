package com.srj.IRCTCResourcesApp.Service;

import com.srj.IRCTCResourcesApp.model.Passanger;
import com.srj.IRCTCResourcesApp.model.Ticket;

public interface TicketServiceI {

	
	public abstract Ticket BookTicket(Passanger psg);
}
