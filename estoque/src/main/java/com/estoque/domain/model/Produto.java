package com.estoque.domain.model;
import com.estoque.domain.model.enums.*;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {
    // Atributos
    private final int id;
    private String nome;
    private Categoria categoria;
    private BigDecimal preco;
    private int quantidade;
    private int estoqueMinimo;

    // Construtor
    public Produto(int id, String nome, Categoria categoria, BigDecimal preco, int quantidade, int estoqueMinimo){
        this.id = id;
        this.nome = Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public BigDecimal getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public int getEstoqueMinimo(){
        return estoqueMinimo;
    }
}
