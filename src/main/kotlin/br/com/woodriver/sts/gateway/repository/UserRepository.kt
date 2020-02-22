package br.com.woodriver.sts.gateway.repository

import br.com.woodriver.sts.domains.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}