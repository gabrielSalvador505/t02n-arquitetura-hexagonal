package com.fag.lucasmartins.arquitetura_software.core.domain.bo;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

import com.fag.lucasmartins.arquitetura_software.core.domain.exceptions.DomainException;

public class PessoaBO {

    private UUID id;
    private String nomeCompleto;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;

    public PessoaBO(String nomeCompleto, String cpf, LocalDate dataNascimento, String email, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public PessoaBO() {
    }

    public void verificaMaioridade() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(this.dataNascimento, dataAtual);
        if (periodo.getYears() < 18) {
            throw new DomainException("Pessoa não é maior de idade");
        }
    }

    public void verificaCPF() {
        if (this.cpf == null || this.cpf.length() != 11) {
            throw new DomainException("CPF inválido");
        }
    }

    public void verificaEmail() {
        if (this.email == null || !this.email.contains("@")) {
            throw new DomainException("Email inválido");
        }
    }

    public void verificaTelefone() {
        this.telefone = this.telefone.replaceAll("[^0-9]", "");
        if (this.telefone == null || this.telefone.length() < 11) {
            throw new DomainException("Telefone inválido");
        }
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}
