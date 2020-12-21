package dev.logarithmus.railwaykt.repos

import dev.logarithmus.railwaykt.dao.Station
import org.springframework.data.repository.CrudRepository
import org.springframework.transaction.annotation.Transactional

interface StationRepository: CrudRepository<Station, Int> {
	fun findByName(name: String): Station
	@Transactional
	fun deleteByName(name: String): Long
}