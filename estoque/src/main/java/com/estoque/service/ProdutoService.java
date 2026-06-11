package com.estoque.service;

import java.util.*;
import com.estoque.repository.ProdutoRepository;
import com.estoque.domain.model.ProdutoModel;

public class ProdutoService {
    private final ProdutoRepository repository = new ProdutoRepository();

    public void cadastrarProduto(ProdutoModel produto){
        // Regra para inserção de preços válidos
        if (produto.getPreco() <= 0){
            // Exceção caso a regra seja violada
            throw new IllegalArgumentException("O preço do produto deve ser maior que R$0");
        }
        // Salva o produto caso a regra seja atendida
        repository.salvar(produto);
    }
}
