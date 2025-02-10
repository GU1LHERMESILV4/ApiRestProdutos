package br.com.gas.ApiRestProdutos.resource;

import br.com.gas.ApiRestProdutos.model.Produtos;
import br.com.gas.ApiRestProdutos.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api") //http://localhost:8080/api
public class ApiRestProdutosResource {

    @Autowired //injeção de dependência
    private ProdutosRepository produtosRepository;

    @GetMapping("lista") //http://localhost:8080/api/lista
    public List<Produtos> listar(){
        List<Produtos> listProduto = produtosRepository.findAll();
        return listProduto;
    }

    @GetMapping
    public String getApi(){
        return "API Java funcionando! 😁";
    }

    @GetMapping("getProduto") //http://localhost:8080/api
    public Produtos getProdutos(){
        Produtos produto = new Produtos();
        produto.setCodigoBarras("444949626264");
        produto.setNome("Monitor Dell 29p");
        produto.setPreco(1000.0);

        System.out.println(produto);

        return produto;
    }

    @GetMapping("getProdutos") //http://localhost:8080/api/getProdutos
    public List<Produtos> getProduto(){
        List<Produtos> listProdutos = new ArrayList<Produtos>();

        Produtos produto1 = new Produtos();
        produto1.setCodigoBarras("444949626264");
        produto1.setNome("Monitor Dell 29p");
        produto1.setPreco(1000.0);
        listProdutos.add(produto1);

        Produtos produto2 = new Produtos();
        produto2.setCodigoBarras("5489549595626264");
        produto2.setNome("Hd 1tb Samsung SSD");
        produto2.setPreco(800.0);
        listProdutos.add(produto2);

        Produtos produto3 = new Produtos();
        produto3.setCodigoBarras("5466585626264");
        produto3.setNome("Mouse Logitech");
        produto3.setPreco(150.0);
        listProdutos.add(produto3);

        return listProdutos;
    }
}
