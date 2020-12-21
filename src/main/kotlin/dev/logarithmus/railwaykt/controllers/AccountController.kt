package dev.logarithmus.railwaykt.controllers

import dev.logarithmus.railwaykt.repos.UserRepository
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletRequest

@Controller
class AccountController(
	val userRepository: UserRepository
) {
	@RequestMapping("/account")
	fun account(request: HttpServletRequest): String {
		return "redirect:/"
	}

}