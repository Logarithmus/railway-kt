package dev.logarithmus.railwaykt.dao

import javax.persistence.*

@Entity
data class CarriageType(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int,

	@Column(nullable = false)
	var name: String,

	@Column(nullable = false)
	val seatsCount: Byte
)
