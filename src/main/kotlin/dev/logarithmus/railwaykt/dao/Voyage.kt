package dev.logarithmus.railwaykt.dao

import java.sql.Date
import java.sql.Time
import javax.persistence.*

enum class CarriageNumStart { HEAD, TAIL }

@Entity
data class Voyage(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int,

	@ManyToOne(optional = false)
	val train: Train,

	@Column(nullable = false)
	val departureDatetimeAbsolute: Date,

	@Column(nullable = false)
	val lateBy: Time,

	val carriageNumStart: CarriageNumStart?,
	val trackNum: Byte?,
	val platformNum: Byte?
)
