

package com.infotech.book.ticket.app.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infotech.book.ticket.app.entities.Ticket;
@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

	Ticket save(Optional<Ticket> ticketFromDb);

	

}