package Trabalho.Empresarial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Servico {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String tipoDeCarga;
    private String produto;
    private int quantidade;
    private String rotaDeDistribuicao;
    private Double frete;
    private String veiculoDeTransporte;

    public Servico(Long id, String nome, String tipoDeCarga, String produto, int quantidade, String rotaDeDistribuicao, Double frete, String veiculoDeTransporte) {
        this.id = id;
        this.nome = nome;
        this.tipoDeCarga = tipoDeCarga;
        this.produto = produto;
        this.quantidade = quantidade;
        this.rotaDeDistribuicao = rotaDeDistribuicao;
        this.frete = frete;
        this.veiculoDeTransporte = veiculoDeTransporte;
    }

    public Servico() {
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

    public String getTipoDeCarga() {
        return tipoDeCarga;
    }

    public void setTipoDeCarga(String tipoDeCarga) {
        this.tipoDeCarga = tipoDeCarga;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getRotaDeDistribuicao() {
        return rotaDeDistribuicao;
    }

    public void setRotaDeDistribuicao(String rotaDeDistribuicao) {
        this.rotaDeDistribuicao = rotaDeDistribuicao;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    public String getVeiculoDeTransporte() {
        return veiculoDeTransporte;
    }

    public void setVeiculoDeTransporte(String veiculoDeTransporte) {
        this.veiculoDeTransporte = veiculoDeTransporte;
    }
}
