package com.estoque.domain.model;

public abstract class MovimentacaoModel {
    protected ProdutoModel produto;
    protected int quantidade;

    public MovimentacaoModel(ProdutoModel produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    

    public abstract void executar();
}
