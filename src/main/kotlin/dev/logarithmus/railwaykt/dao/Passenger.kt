package dev.logarithmus.railwaykt.dao

import javax.persistence.*

@Entity
data class Passenger(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int,

	@Column(nullable = false)
	val passportNum: String,

	@Column(nullable = false)
	val firstName: String,

	@Column(nullable = false)
	val lastName: String
)