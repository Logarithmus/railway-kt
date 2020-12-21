package dev.logarithmus.railwaykt.controllers

import org.springframework.security.authentication.AnonymousAuthenticationToken
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpServletRequest

@Controller
class LoginController {
	@GetMapping("/login")
	fun login(securityContextHolder: SecurityContextHolder,
			  logoutHandler: SecurityContextLogoutHandler,
			  request: HttpServletRequest,
		      @RequestParam email: String?,
			  @RequestParam password: String?,
			  @RequestParam remember: String?): String {
		val auth = SecurityContextHolder.getContext().authentication
		if (email == null &&
			password == null &&
			auth is AnonymousAuthenticationToken) {
				logoutHandler.logout(request, null,  null)
			}
		return if (auth is AnonymousAuthenticationToken) {
			"redirect:/"
		} else {
			"login"
		}
	}
}