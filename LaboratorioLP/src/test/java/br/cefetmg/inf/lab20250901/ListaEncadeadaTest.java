package br.cefetmg.inf.lab20250901;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEncadeadaTest {

    ListaEncadeada lista;

    @BeforeEach
    void setUp() {
        lista = new ListaEncadeada();
    }

    @Test
    void testInserirInicioComNull() {
        Exception e = assertThrows(NullPointerException.class, () -> {
            lista.inserirInicio(null);
        });
        assertEquals("Item não pode ser nulo", e.getMessage());
    }

    @Test
    void testInserirFimComNull() {
        Exception e = assertThrows(NullPointerException.class, () -> {
            lista.inserirFim(null);
        });
        assertEquals("Item não pode ser nulo", e.getMessage());
    }

    @Test
    void testInserirPosicaoNegativa() {
        Exception e = assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.inserirPosicao(-1, "A");
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
    void testRemoverPosicaoInvalida() {
        lista.inserirFim("A");
        Exception e = assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.removerPosicao(5);
        });
        assertTrue(e.getMessage().contains("Posição inválida"));
    }

    @Test
    void testObterInicioListaVazia() {
        Exception e = assertThrows(IllegalStateException.class, () -> {
            lista.obterInicio();
        });
        assertEquals("Lista vazia", e.getMessage());
    }

    @Test
    void testObterPosicaoListaVazia() {
        Exception e = assertThrows(IllegalStateException.class, () -> {
            lista.obterPosicao(0);
        });
        assertEquals("Lista vazia", e.getMessage());
    }

    @Test
    void testPesquisarNull() {
        Exception e = assertThrows(NullPointerException.class, () -> {
            lista.pesquisar(null);
        });
        assertEquals("Item não pode ser nulo", e.getMessage());
    }
}
