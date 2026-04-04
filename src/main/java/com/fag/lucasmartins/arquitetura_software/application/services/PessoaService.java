package com.fag.lucasmartins.arquitetura_software.application.services;

import org.springframework.stereotype.Service;

import com.fag.lucasmartins.arquitetura_software.application.ports.in.service.PessoaServicePort;
import com.fag.lucasmartins.arquitetura_software.application.ports.out.persistence.h2.PessoaRepositoryPort;
import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBO;

@Service
public class PessoaService implements PessoaServicePort{

    PessoaRepositoryPort pessoaRepositoryPort;

    public PessoaService(PessoaRepositoryPort pessoaRepositoryPort) {
        this.pessoaRepositoryPort = pessoaRepositoryPort;
    }

    @Override
    public PessoaBO salvar(PessoaBO pessoaBO) {
        pessoaBO.verificaMaioridade();
        pessoaBO.verificaCPF();
        pessoaBO.verificaEmail();
        pessoaBO.verificaTelefone();


        return pessoaRepositoryPort.salvar(pessoaBO);
    }

}
