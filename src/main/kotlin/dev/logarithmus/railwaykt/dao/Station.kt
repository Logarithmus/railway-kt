package dev.logarithmus.railwaykt.dao

import javax.persistence.*

@Entity
data class Station(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int,

	@Column(nullable = false)
	var name: String
)