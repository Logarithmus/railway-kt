package dev.logarithmus.railwaykt.repos

import dev.logarithmus.railwaykt.dao.Train
import org.springframework.data.repository.CrudRepository

interface TrainRepository: CrudRepository<Train, Int> {
}