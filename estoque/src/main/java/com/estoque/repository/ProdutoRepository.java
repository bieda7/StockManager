package com.estoque.repository;

import java.util.*;
import com.estoque.domain.model.ProdutoModel;

public class ProdutoRepository {
    private List<ProdutoModel> produtos = new ArrayList<>();


    public boolean salvar(ProdutoModel produto){
       // Verificação do produto na lista
        for (int i = 0; i < produtos.size(); i++){
            if (produtos.get(i).getId() == produto.getId()){
                return false;
            }
        }
        produtos.add(produto);
        return true;
    }
    // public boolean salvar(ProdutoModel produto) {
    //     if (produtos.add(produto)){
    //         return true;
    //     }
    //     return false;
        

    // }

    public Optional<ProdutoModel> buscarPorId(int id) {
        for (ProdutoModel produto : this.produtos) {
            if (produto.getId() == id) {    
                return Optional.of(produto); 
            }
        }
        return Optional.empty(); 
    }

    public boolean deletar(int id){
        for (int i = 0; i < produtos.size(); i++){
            if (produtos.get(i).getId() == id){
               produtos.remove(i);

                return true;
            }        
         }
          return false;
        
    }
public void atualizar(ProdutoModel produto){
    for (int i = 0; i < produtos.size(); i++){
        // Se o produto da lista tiver o mesmo ID do produto que veio por parâmetro
        if (produtos.get(i).getId() == produto.getId()){
            
            // CORREÇÃO: Atualiza o produto DA LISTA com os dados que vieram do parâmetro
            produtos.get(i).setNome(produto.getNome());
            produtos.get(i).setPreco(produto.getPreco());
            
            return; // Para o laço, pois já encontrou e atualizou
        }
    }
}
}
