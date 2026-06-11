package com.estoque.domain.model;

public class SaidaEstoqueModel extends MovimentacaoModel{
    public SaidaEstoqueModel(ProdutoModel produto, int quantidade){
        super(produto, quantidade);

        this.produto = produto;
        this.quantidade = quantidade;
    }

    @Override
    public void executar(){
        System.out.println("Teste");
    }
}
