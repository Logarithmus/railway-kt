package dev.logarithmus.railwaykt.repos

import dev.logarithmus.railwaykt.dao.Voyage
import org.springframework.data.repository.CrudRepository

interface VoyageRepository: CrudRepository<Voyage, Int> {
}