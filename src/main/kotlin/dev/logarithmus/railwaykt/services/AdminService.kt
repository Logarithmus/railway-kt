package dev.logarithmus.railwaykt.services

import dev.logarithmus.railwaykt.repos.CarriageTypeRepository
import dev.logarithmus.railwaykt.repos.StationRepository
import org.springframework.stereotype.Service

@Service
class AdminService(
	val carriageTypeRepo: CarriageTypeRepository,
	val stationRepo: StationRepository,
) {
	fun getAllStations(): List<String> {
		return stationRepo.findAll().map{ it.name }
	}
	
	fun getAllCarriageTypes(): List<String> {
		return carriageTypeRepo.findAll().map{ it.name }
	}
}