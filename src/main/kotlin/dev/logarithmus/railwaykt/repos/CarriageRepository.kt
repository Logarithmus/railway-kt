package dev.logarithmus.railwaykt.repos

import dev.logarithmus.railwaykt.dao.Carriage
import org.springframework.data.repository.CrudRepository

interface CarriageRepository: CrudRepository<Carriage, Int> {
}