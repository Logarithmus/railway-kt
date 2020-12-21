package dev.logarithmus.railwaykt.dao

import javax.persistence.*

@Entity
data class User(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int,

	@Column(nullable = false)
	val email: String,

	@Column(nullable = false)
	val pass: String,

	@Column(nullable = false)
	val isAdmin: Boolean,

	@Column(nullable = false)
	val isActive: Boolean
)