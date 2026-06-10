package com.estoque.domain.model;

public class SaidaEstoque extends Movimentacao{
    public SaidaEstoque(Produto produto, int quantidade){
        super(produto, quantidade);

        this.produto = produto;
        this.quantidade = quantidade;
    }

    @Override
    public void executar(){
        System.out.println("Teste");
    }
}
