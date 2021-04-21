package br.com.zup.autores

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "autores")
class Autor(
    @Column(nullable = false) val nome: String,
    @Column(nullable = false)val email: String,
    @Column(nullable = false) var descricao: String
) {
    @Id
    @GeneratedValue
    var id: Long? = null

    val criadoEm: LocalDateTime = LocalDateTime.now()

}
