package com.brunoaraujo.pontoInteligente.repositories

import com.brunoaraujo.pontoInteligente.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository : MongoRepository<Funcionario, String> {

    fun findByCpf(cpf: String): Funcionario?

    fun findByEmail(email: String): Funcionario?

}