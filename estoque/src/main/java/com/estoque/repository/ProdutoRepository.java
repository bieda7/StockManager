package com.estoque.repository;
import java.util.*;
import com.estoque.domain.model.Produto;

public class ProdutoRepository {
    private List<Produto> produtos = new ArrayList<>();

    public void salvar(Produto produto){
        try{
            produtos.add(produto);
            System.out.println("Produto salvo com sucesso");
        } catch (Exception ex){
            String mensagem = ex.getMessage();
            System.out.println("Ocorreu um erro ao tentar salvar o produto no estoque, mensagem de erro: " + mensagem);
        }
        
    }

    public Produto buscarPorId(int idBuscando){
        for (Produto produto : this.produtos){
            if (produto.getId() == idBuscando) {
                return produto; // Retorna o produto assim que encontra
            }
        }
        return null; // Retorna null se rodar a lista toda e não encontrar o ID
    }

}
