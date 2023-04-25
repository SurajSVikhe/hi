package com.srj.IRCTCResourcesApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srj.IRCTCResourcesApp.Service.TicketServiceI;
import com.srj.IRCTCResourcesApp.model.Passanger;
import com.srj.IRCTCResourcesApp.model.Ticket;

@RestController
public class TicketBookingController {

	@Autowired
	private TicketServiceI ticketServiceI;

	@PostMapping(value = "/bookTicket", produces = "application/json", consumes = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger psg) {

		Ticket ticket = ticketServiceI.BookTicket(psg);

		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);

	}
}