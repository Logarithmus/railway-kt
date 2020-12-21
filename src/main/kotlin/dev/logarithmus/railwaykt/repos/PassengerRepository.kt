package dev.logarithmus.railwaykt.repos

import dev.logarithmus.railwaykt.dao.Passenger
import org.springframework.data.repository.CrudRepository

interface PassengerRepository: CrudRepository<Passenger, Int> {
}