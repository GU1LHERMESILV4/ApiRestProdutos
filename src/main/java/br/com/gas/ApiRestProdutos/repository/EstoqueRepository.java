package br.com.gas.ApiRestProdutos.repository;

import br.com.gas.ApiRestProdutos.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

}
