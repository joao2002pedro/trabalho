package Trabalho.Empresarial.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String regiao;
    private Integer cnpj;
    private String email;
    private String tipoDeCarga;
    private Integer tempoDeContrato;
    private String tipoDaIndustria;
    private Integer quantidadeDeFuncionario;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Servico> servico;

    public Cliente(Long id, String condor, String regiao, Integer cnpj, String email, String tipoDeCarga, Integer tempoDeContrato, String tipoDaIndustria, Integer quantidadeDeFuncionario, List<Servico> servico) {
        this.id = id;
        this.nome = condor;
        this.regiao = regiao;
        this.cnpj = cnpj;
        this.email = email;
        this.tipoDeCarga = tipoDeCarga;
        this.tempoDeContrato = tempoDeContrato;
        this.tipoDaIndustria = tipoDaIndustria;
        this.quantidadeDeFuncionario = quantidadeDeFuncionario;
        this.servico = servico;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoDeCarga() {
        return tipoDeCarga;
    }

    public void setTipoDeCarga(String tipoDeCarga) {
        this.tipoDeCarga = tipoDeCarga;
    }

    public Integer getTempoDeContrato() {
        return tempoDeContrato;
    }

    public void setTempoDeContrato(Integer tempoDeContrato) {
        this.tempoDeContrato = tempoDeContrato;
    }

    public String getTipoDaIndustria() {
        return tipoDaIndustria;
    }

    public void setTipoDaIndustria(String tipoDaIndustria) {
        this.tipoDaIndustria = tipoDaIndustria;
    }

    public Integer getQuantidadeDeFuncionario() {
        return quantidadeDeFuncionario;
    }

    public void setQuantidadeDeFuncionario(Integer quantidadeDeFuncionario) {
        this.quantidadeDeFuncionario = quantidadeDeFuncionario;
    }

    public List<Servico> getServico() {
        return servico;
    }

    public void setServico(List<Servico> servico) {
        this.servico = servico;
    }
}
