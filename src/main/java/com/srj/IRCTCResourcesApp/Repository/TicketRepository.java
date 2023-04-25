package com.srj.IRCTCResourcesApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srj.IRCTCResourcesApp.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
