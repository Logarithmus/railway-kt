package dev.logarithmus.railwaykt.repos

import dev.logarithmus.railwaykt.dao.User
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, Int> {
	fun findByEmail(email: String): User
}