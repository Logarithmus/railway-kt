package dev.logarithmus.railwaykt.dao

import javax.persistence.*

@Entity
data class Carriage(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int,

	@ManyToOne(optional = false)
	val voyage: Voyage,

	@ManyToOne(optional = false)
	val type: CarriageType,

	@Column(nullable = false)
	val number: Byte
)