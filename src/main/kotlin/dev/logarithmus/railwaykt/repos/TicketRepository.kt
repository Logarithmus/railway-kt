package dev.logarithmus.railwaykt.repos

import dev.logarithmus.railwaykt.dao.Ticket
import org.springframework.data.repository.CrudRepository

interface TicketRepository: CrudRepository<Ticket, Int> {
}