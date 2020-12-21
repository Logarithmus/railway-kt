package dev.logarithmus.railwaykt.dao

import javax.persistence.*

@Entity
data class CarriageStation(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int,

	@ManyToOne(optional = false)
	val station: Station,

	@ManyToOne(optional = false)
	val carriage: Carriage,

	@Column(nullable = false)
	val seatsState: Long,

	@Column(nullable = false)
	val seatPrice: Byte
)