package br.com.woodriver.sts.gateway.controller

import br.com.woodriver.sts.domains.User
import br.com.woodriver.sts.usecases.CreateUserUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI

@RestController
@RequestMapping("/signup")
class UserController(val createUserUseCase: CreateUserUseCase) {

    @PostMapping
    fun create(@RequestBody user: User): ResponseEntity<User>{
        return ResponseEntity.created(URI("")).body(createUserUseCase.execute(user))
    }
}