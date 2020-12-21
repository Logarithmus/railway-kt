package dev.logarithmus.railwaykt.repos

import dev.logarithmus.railwaykt.dao.CarriageType
import org.springframework.data.repository.CrudRepository
import org.springframework.transaction.annotation.Transactional

interface CarriageTypeRepository: CrudRepository<CarriageType, Int> {
	fun findByName(name: String): CarriageType
	@Transactional
	fun deleteByName(name: String): Long
}