package com.brunoaraujo.pontoInteligente.repositories

import com.brunoaraujo.pontoInteligente.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository<Empresa, String> {

    fun findByCnpj(cnpj: String): Empresa?
}