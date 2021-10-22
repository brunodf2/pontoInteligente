package com.brunoaraujo.pontoInteligente.services.impl

import com.brunoaraujo.pontoInteligente.documents.Empresa
import com.brunoaraujo.pontoInteligente.repositories.EmpresaRepository
import com.brunoaraujo.pontoInteligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}