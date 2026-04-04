package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.mapper;

import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBO;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.dto.PessoaDTO;

public class PessoaDTOMapper {

    public static PessoaBO toBO(PessoaDTO pessoaDTO) {
        return new PessoaBO(
            pessoaDTO.getNomeCompleto(),
            pessoaDTO.getCpf(),
            pessoaDTO.getDataNascimento(),
            pessoaDTO.getEmail(),
            pessoaDTO.getTelefone()
        );
    }

    public static PessoaDTO toDTO(PessoaBO pessoaBO) {
        return new PessoaDTO(
            pessoaBO.getNomeCompleto(),
            pessoaBO.getCpf(),
            pessoaBO.getDataNascimento(),
            pessoaBO.getEmail(),
            pessoaBO.getTelefone()
        );
    }

}
