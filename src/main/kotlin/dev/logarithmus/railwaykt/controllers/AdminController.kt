package dev.logarithmus.railwaykt.controllers

import dev.logarithmus.railwaykt.dao.CarriageType
import dev.logarithmus.railwaykt.dao.Station
import dev.logarithmus.railwaykt.repos.CarriageTypeRepository
import dev.logarithmus.railwaykt.repos.StationRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpServletRequest

@Controller
class AdminController(
	val stationRepo: StationRepository,
	val carriageTypeRepo: CarriageTypeRepository
) {
	@GetMapping("/admin")
	fun admin(
			  request: HttpServletRequest,
			  model: Model,
			  @RequestParam(name = "old_station_name", required = false) oldStationName: String?,
			  @RequestParam(name = "new_station_name", required = false) newStationName: String?,
			  @RequestParam(name = "station_action", required = false) stationAction: String?,
			  @RequestParam(name = "old_carriage_type", required = false) oldCarriageType: String?,
			  @RequestParam(name = "new_carriage_type", required = false) newCarriageType: String?,
			  @RequestParam(name = "carriage_type_action") carriageTypeAction: String?): String {
		// val auth = SecurityContextHolder.getContext().authentication
		// val currentUser = userRepo.findByEmailOrNull((auth.principal as User).email)
		// return currentUser?.let {
		// 	if (it.isAdmin) {
		// 		adminService.admin()
		// 	} else {
		// 		"redirect:/login"
		// 	}
		// } ?: "redirect:/login"

		var isStationSuccess = false
		var isStationError = false
		var isCarriageTypeSuccess = false
		var isCarriageTypeError = false

		if (oldStationName != null &&
			stationAction != null) {
				when (stationAction) {
					"create" -> stationRepo.save(Station(0, oldStationName))
					"delete" -> stationRepo.deleteByName(oldStationName)
				}
		}
		
		if (oldStationName != null &&
			stationAction != null) {
				if (stationAction == "rename") {
					val station = stationRepo.findByName(oldStationName)
					station.name = newStationName ?: ""
					stationRepo.save(station)

				}
		}

		if (oldCarriageType != null &&
			carriageTypeAction != null) {
			when (carriageTypeAction) {
				"create" -> carriageTypeRepo.save(CarriageType(0, oldCarriageType, 56))
				"delete" -> carriageTypeRepo.deleteByName(oldCarriageType)
			}
		}

		if (oldCarriageType != null &&
			carriageTypeAction != null) {
			if (carriageTypeAction == "rename") {
				val carriageType = carriageTypeRepo.findByName(oldCarriageType)
				carriageType.name = newCarriageType ?: ""
				carriageTypeRepo.save(carriageType)
			}
		}

		val stations = stationRepo.findAll().map{ it.name }
		val carriageTypes = carriageTypeRepo.findAll().map{ it.name }

		model.addAttribute("stations", stations)
		model.addAttribute("carriageTypes", carriageTypes)
		model.addAttribute("isStationSuccess", isStationSuccess)
		model.addAttribute("isStationError", isStationError)
		model.addAttribute("isCarriageTypeSucceess", isCarriageTypeSuccess)
		model.addAttribute("isCarriageTypeError", isCarriageTypeError)
		return "admin"
	}
}