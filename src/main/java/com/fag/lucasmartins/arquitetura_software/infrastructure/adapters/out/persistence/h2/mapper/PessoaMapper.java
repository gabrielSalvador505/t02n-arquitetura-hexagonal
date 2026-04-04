package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.mapper;

import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBO;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.entity.PessoaEntity;

public class PessoaMapper {
    
    public static PessoaEntity toEntity(PessoaBO pessoaBO) {
        return new PessoaEntity(
            pessoaBO.getNomeCompleto(),
            pessoaBO.getCpf(),
            pessoaBO.getDataNascimento(),
            pessoaBO.getEmail(),
            pessoaBO.getTelefone()
        );
    }

    public static PessoaBO toBO(PessoaEntity pessoaEntity) {
        return new PessoaBO(
            pessoaEntity.getNome(),
            pessoaEntity.getCpf(),
            pessoaEntity.getDataNascimento(),
            pessoaEntity.getEmail(),
            pessoaEntity.getTelefone()
        );
    }
}
