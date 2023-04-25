package com.srj.IRCTCResourcesApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srj.IRCTCResourcesApp.Repository.PassangerRepository;
import com.srj.IRCTCResourcesApp.Repository.TicketRepository;
import com.srj.IRCTCResourcesApp.model.Passanger;
import com.srj.IRCTCResourcesApp.model.Ticket;
@Service
public class TicketServiceImpl implements TicketServiceI {

	@Autowired
	private PassangerRepository passangerRepository;

	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public Ticket BookTicket(Passanger psg) {
		
	int pid = psg.getPid();

		Passanger passanger = passangerRepository.save(psg);
		if (passanger != null) {

			Ticket ticket = ticketRepository.findById(pid).get();
			return ticket;
		}

		return null;
	}

}


//	@Override
//	public Ticket BookTicket(Passanger psg) {
//	
//		if(psg !=null) {
//			Ticket ticket =new Ticket();
//			ticket.setTid(12);
//			ticket.setTicketPrice(123.33);
//			ticket.setTicketStatus("prossed");
//			
//			 int random = (int) (Math.random()*100);
//			ticket.setPnr(random);
//			System.out.println(ticket);
//		return ticket;
//		}
//		return null;
//	}
//
//}
