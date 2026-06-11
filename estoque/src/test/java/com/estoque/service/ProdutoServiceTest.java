package com.estoque.service;

import com.estoque.domain.model.ProdutoModel;
import com.estoque.domain.model.enums.Categoria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoServiceTest {

    private ProdutoService service;

    @BeforeEach
    public void setUp() {
        service = new ProdutoService();
    }

    @Test
    public void deveCadastrarProdutoComPrecoValido() {
        ProdutoModel produtoValido = new ProdutoModel(1, "Teclado", Categoria.Outros, 150.0, 10, 2);
        
        // Não deve lançar nenhuma exceção
        assertDoesNotThrow(() -> service.cadastrarProduto(produtoValido));
    }

    @Test
    public void deveLancarExcecaoQuandoPrecoForInvalido() {
        // Criando um produto com preço ZERO
        ProdutoModel produtoInvalido = new ProdutoModel(2, "Mouse Pad", Categoria.Outros, 0.0, 5, 1);

        // O assertThrows verifica se o sistema realmente barrou e lançou a exceção correta
        IllegalArgumentException excecao = assertThrows(IllegalArgumentException.class, () -> {
            service.cadastrarProduto(produtoInvalido);
        });

        // Verifica se a mensagem de erro é a que você definiu na Service
        assertEquals("O preço do produto deve ser maior que R$0", excecao.getMessage());
    }
}