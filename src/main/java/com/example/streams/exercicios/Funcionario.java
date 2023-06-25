package com.example.streams.exercicios;

import java.util.Date;
public class Funcionario {

    private String nome;
    private Date dataNascimento;
    private Double salario;
    private String cargo;
    private String nacionalidade;
    private boolean pcd;
    private Date dataAdmissao;
    private String cpf;
    private String estadoCivil;

    public Funcionario(){}

    public Funcionario(String nome, Date dataNascimento, Double salario, String cargo, String nacionalidade, boolean pcd, Date dataAdmissao, String cpf, String estadoCivil) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.cargo = cargo;
        this.nacionalidade = nacionalidade;
        this.pcd = pcd;
        this.dataAdmissao = dataAdmissao;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public boolean isPcd() {
        return pcd;
    }

    public void setPcd(boolean pcd) {
        this.pcd = pcd;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

}

