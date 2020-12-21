package dev.logarithmus.railwaykt.dao

import java.util.Date
import javax.persistence.*

@Entity
data class Ticket(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int,

	@ManyToOne(optional = false)
	val user: User,

	@ManyToOne(optional = false)
	val passenger: Passenger,

	@ManyToOne(optional = false)
	val carriage: Carriage,

	@ManyToOne(optional = false)
	val fromStation: Station,

	@ManyToOne(optional = false)
	val toStation: Station,

	@Column(nullable = false)
	val seatNum: Byte,

	@Column(nullable = false)
	val price: Int,

	@Column(nullable = false)
	val sellDatetime: Date,

	val cancelDatetime: Date?
)
