package com.estoque.domain.model;
import com.estoque.domain.model.enums.*;
import java.util.Objects;

public class ProdutoModel {
    // Atributos
    private final int id;
    private String nome;
    private Categoria categoria;
    private double preco;
    private int quantidade;
    private int estoqueMinimo;

    // Construtor
    public ProdutoModel(int id, String nome, Categoria categoria, double preco, int quantidade, int estoqueMinimo){
        this.id = id;
        this.nome = Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
    }

    // GETTERS
    public int getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public int getEstoqueMinimo(){
        return estoqueMinimo;
    }

    // SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

}
