package com.estoque.domain.model;

public abstract class Movimentacao {
    protected Produto produto;
    protected int quantidade;

    public Movimentacao(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    

    public abstract void executar();
}
