package com.estoque;

// import com.estoque.repository.*;
// import com.estoque.domain.model.*;

import org.junit.jupiter.api.Test; 

import com.estoque.domain.model.ProdutoModel;
import com.estoque.domain.model.enums.Categoria;
import com.estoque.repository.ProdutoRepository;

import static org.junit.jupiter.api.Assertions.*; 

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private ProdutoRepository repository;

    // O @BeforeEach roda antes de CADA teste.
    // Isso garante que cada teste comece com uma lista limpa ou nova,
    // impedindo que um teste interfira no resultado do outro.
    @BeforeEach
    public void setUp() {
        repository = new ProdutoRepository(); 
    }

    // 1. TESTAR CRIAÇÃO (CREATE)
    @Test
    public void deveAdicionarUmProdutoNaLista() {
        ProdutoModel novoProduto = new ProdutoModel(1, "Notebook", Categoria.Hardware, 3500.0, 1, 5);

        repository.salvar(novoProduto);

        // Verifica se o produto realmente foi salvo buscando por ele
        Optional<ProdutoModel> encontrado = repository.buscarPorId(1);
        
        assertTrue(encontrado.isPresent(), "O produto deveria ter sido encontrado");
        assertEquals("Notebook", encontrado.get().getNome());
    }

    // 2. TESTAR BUSCA POR ID (READ)
    @Test
    public void deveRetornarVazioQuandoProdutoNaoExistir() {
        // Tenta buscar um ID que nunca foi adicionado
        Optional<ProdutoModel> encontrado = repository.buscarPorId(999);

        assertTrue(encontrado.isEmpty(), "Não deveria encontrar um produto inexistente");
    }

    // 3. TESTAR ATUALIZAÇÃO (UPDATE)
    @Test
    public void deveAtualizarOsDadosDeUmProdutoExistente() {
        // Primeiro, insere um produto
        ProdutoModel produtoOriginal = new ProdutoModel(1, "Mouse", Categoria.Perifericos, 50.0, 1, 5);
        repository.salvar(produtoOriginal);

        // Modifica os dados (simulando a atualização)
        ProdutoModel produtoAtualizado = new ProdutoModel(1, "Mouse Sem Fio", Categoria.Outros, 80.0, 1, 2);
        repository.atualizar(produtoAtualizado);

        // Busca novamente para validar se mudou na lista
        Optional<ProdutoModel> encontrado = repository.buscarPorId(1);

        assertTrue(encontrado.isPresent());
        assertEquals("Mouse Sem Fio", encontrado.get().getNome());
        assertEquals(80.0, encontrado.get().getPreco());
    }

    // 4. TESTAR DELEÇÃO (DELETE)
    @Test
    public void deveRemoverOProdutoDaLista() {
        // Primeiro, insere um produto para ter o que deletar
        ProdutoModel produto = new ProdutoModel(1, "Teclado", Categoria.Perifericos, 150.0, 1, 4);
        repository.salvar(produto);

        // Executa a deleção
        boolean deletadoComSucesso = repository.deletar(1);

        // Verifica se retornou sucesso na deleção
        assertTrue(deletadoComSucesso);

        // Tenta buscar novamente para garantir que ele NÃO está mais lá
        Optional<ProdutoModel> encontrado = repository.buscarPorId(1);
        assertTrue(encontrado.isEmpty(), "O produto deveria ter sido removido da lista");
    }
}
