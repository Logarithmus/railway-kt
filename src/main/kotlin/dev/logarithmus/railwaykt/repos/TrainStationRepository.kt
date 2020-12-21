package dev.logarithmus.railwaykt.repos

import dev.logarithmus.railwaykt.dao.TrainStation
import org.springframework.data.repository.CrudRepository

interface TrainStationRepository: CrudRepository<TrainStation, Int> {
}