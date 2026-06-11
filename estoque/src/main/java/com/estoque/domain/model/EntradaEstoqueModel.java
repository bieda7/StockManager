package com.estoque.domain.model;

public class EntradaEstoqueModel extends MovimentacaoModel{
    public EntradaEstoqueModel(ProdutoModel produto, int quantidade){
        super(produto, quantidade);

        this.produto = produto;
        this.quantidade = quantidade;
    }
    @Override
    public void executar() {
        // TODO Auto-generated method stub
        System.out.println("Teste");
        
    }
}
