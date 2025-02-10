package br.com.gas.ApiRestProdutos.service;

import br.com.gas.ApiRestProdutos.model.Produtos;
import br.com.gas.ApiRestProdutos.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired //Injeção de dependência
    private ProdutosRepository produtosRepository;

    //CRUD - Create
    public Produtos save(Produtos produto){
        //Regra de negócio
        //- Se o campo nome está preenchido
        if(produto.getNome() == null){
            System.out.println("Nome do produto vazio");
            return null;
        }
        //- Se o campo código de barras está preenchido
        if(produto.getCodigoBarras() == null){
            System.out.println("Código de barras do produto vazio");
            return null;
        }
        try{
            //Vai para o banco de dados 'INSERT INTO produto(nome, codigoBarras, valor)
            //VALUES(produto.getNome(), produto.getCodigoBarras(), produto.getValor())
            //
            return produtosRepository.save(produto);
        } catch (Exception e){
            System.out.println("Erro ao inserir produto " + produto.toString() + ": " + e.getMessage());
            return null;
        }
    }

    //CRUD - Read (leitura individual ou lista)
    public Optional<Produtos> findById(Long id){
        //select * from produto where id = id
        return produtosRepository.findById(id);
    }
    public List<Produtos> findAll(){
        //select * from produto
        return produtosRepository.findAll();
    }

    //CRUD - Upodate
    public Produtos update(Produtos produto){
        //Regra de negócio
        //- Verificar se o produto existe; Se existir, atualizar, caso não insere novo.
        //----------------------
        //- Pesquisar produto:
        Optional<Produtos> findProduto = produtosRepository.findById(produto.getId());

        //Se o produto existe, atualizar:
        if(findProduto.isPresent()){
            //Crio um novo objeto de produtos e lanço os dados que veio da Internet (parâmetro).
            Produtos updProduto = findProduto.get(); //setId
            updProduto.setNome(produto.getNome()); //Veio por parâmetro
            updProduto.setCodigoBarras(produto.getCodigoBarras());
            updProduto.setPreco(produto.getPreco());
            return produtosRepository.save(updProduto); //UPDATE
        }
        return produtosRepository.save(produto);
    }

    //CRUD - Delete
    public void delete(Long id){
        //delete from produto where id = id
        produtosRepository.deleteById(id);
    }

}
