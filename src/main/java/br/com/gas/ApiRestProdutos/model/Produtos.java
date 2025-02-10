package br.com.gas.ApiRestProdutos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Long id;

    @Column(nullable = false) //not null
    private String codigoBarras;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double preco;

    public Produtos(){ }

    public Produtos(Long id ,String codigoBarras, String nome, Double preco) {
        this.id = id;
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        String retorno = "[" +
                "Nome: " + this.nome + ", " +
                "Código de barras: " + this.codigoBarras + ", " +
                "Preço: " + this.preco + "]";
        return retorno;
    }
}
