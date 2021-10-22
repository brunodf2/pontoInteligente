package com.brunoaraujo.pontoInteligente.services

import com.brunoaraujo.pontoInteligente.documents.Empresa

interface EmpresaService {
    fun buscarPorCnpj(cnpj: String): Empresa?

    fun persistir(empresa: Empresa): Empresa
}