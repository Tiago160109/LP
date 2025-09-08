package br.cefetmg.inf.lab20250901;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaArrayTest {

    ListaArray lista;

    @BeforeEach
    void setUp() {
        lista = new ListaArray();
    }

    @Test
    void testInserirPosicaoNegativa() {
        Exception e = assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.inserirPosicao(-1, "A");
        });
        assertTrue(e.getMessage().contains("Posição inválida"));
    }

    @Test
    void testInserirPosicaoMaiorQueTamanho() {
        Exception e = assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.inserirPosicao(5, "A");
        });
        assertTrue(e.getMessage().contains("Posição inválida"));
    }

    @Test
    void testObterPosicaoInvalida() {
        lista.inserirFim("A");
        Exception e = assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.obterPosicao(10);
        });
        assertTrue(e.getMessage().contains("Posição inválida"));
    }

    @Test
    void testRemoverPosicaoInvalida() {
        lista.inserirFim("A");
        Exception e = assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.removerPosicao(10);
        });
        assertTrue(e.getMessage().contains("Posição inválida"));
    }

    @Test
    void testRemoverInicioListaVazia() {
        Exception e = assertThrows(IllegalStateException.class, () -> {
            lista.removerInicio();
        });
        assertEquals("Lista vazia", e.getMessage());
    }

    @Test
    void testObterFimListaVazia() {
        Exception e = assertThrows(IllegalStateException.class, () -> {
            lista.obterFim();
        });
        assertEquals("Lista vazia", e.getMessage());
    }
}

