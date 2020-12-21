package dev.logarithmus.railwaykt.dao

import java.sql.Time
import javax.persistence.*

@Entity
data class TrainStation(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int,

	@ManyToOne(optional = false)
	val train: Station,

	@ManyToOne(optional = false)
	val station: Station,

	val arrivalTimeRelative: Time?,
	val departureTimeRelative: Time?
)