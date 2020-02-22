package br.com.woodriver.sts.usecases

import br.com.woodriver.sts.gateway.repository.UserRepository
import br.com.woodriver.sts.domains.User
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Component

@Component
class CreateUserUseCase(val userRepository: UserRepository,
                        val bCryptPasswordEncoder: BCryptPasswordEncoder) {


    fun execute(user: User): User{
        user.password = bCryptPasswordEncoder.encode(user.password)
        return userRepository.save(user)
    }

}