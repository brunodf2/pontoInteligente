package com.brunoaraujo.pontoInteligente.repositories

import com.brunoaraujo.pontoInteligente.documents.Lancamento
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface LancamentoRepository : MongoRepository<Lancamento, String> {

    fun findByFuncionarioId(funcionario: String, pageable: Pageable): Page<Lancamento>
}