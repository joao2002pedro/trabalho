package Trabalho.Empresarial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private Integer rg;
    private int cnh;
    private String regiaoDeAtuacao;
    private int contrato;
    private Double salario;
    private int idade;

    public Funcionario(Long id, String nome, Integer rg, int cnh, String regiaoDeAtuacao, int contrato, Double salario, int idade) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.cnh = cnh;
        this.regiaoDeAtuacao = regiaoDeAtuacao;
        this.contrato = contrato;
        this.salario = salario;
        this.idade = idade;
    }
    public Funcionario() {
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

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public String getRegiaoDeAtuacao() {
        return regiaoDeAtuacao;
    }

    public void setRegiaoDeAtuacao(String regiaoDeAtuacao) {
        this.regiaoDeAtuacao = regiaoDeAtuacao;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
