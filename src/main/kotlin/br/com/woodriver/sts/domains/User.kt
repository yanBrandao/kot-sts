package br.com.woodriver.sts.domains

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "KOR_USERS")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @JsonIgnore
        val id: Long = 0L,
        val fullName: String = "",
        val email: String = "",
        var password: String = ""
) {
}