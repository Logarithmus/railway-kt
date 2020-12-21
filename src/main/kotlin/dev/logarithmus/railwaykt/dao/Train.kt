package dev.logarithmus.railwaykt.dao

import javax.persistence.*

@Entity
@SecondaryTable(
	name = "train_type",
	pkJoinColumns = [PrimaryKeyJoinColumn(name = "train_type_id")]
)
data class Train(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int,

	@Column(nullable = false)
	val num: String,

	@Column(table = "train_type", name = "name", nullable = false)
	val type: String
)
