package br.com.gas.ApiRestProdutos.repository;

import br.com.gas.ApiRestProdutos.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

}
