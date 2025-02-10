package br.com.gas.ApiRestProdutos.model;

import jakarta.persistence.*;

@Entity
@Table (name = "tbm_estoque")
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer quantidade;

    @OneToOne
    @JoinColumn(name = "produto_id", referencedColumnName = "id")
    private Produtos produto;



    public Estoque(){}
    public Estoque(Long id, Integer quantidade, Produtos produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Estoque: [ " +
                "id: " + this.id + "\n" +
                "quantidade: " + this.quantidade + "\n" +
                "produto: " + this.produto.getId() + "]";
    }
}
