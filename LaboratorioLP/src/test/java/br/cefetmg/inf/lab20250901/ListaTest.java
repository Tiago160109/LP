package br.cefetmg.inf.lab20250901;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest {

    Lista lista; 

    @BeforeEach
    void setUp() {
        lista = new ListaArray(); 
    }

    @Test
    void testInserirInicioEObterInicio() {
        lista.inserirInicio("A");
        assertEquals("A", lista.obterInicio());
    }

    @Test
    void testInserirFimEObterFim() {
        lista.inserirFim("B");
        assertEquals("B", lista.obterFim());
    }

    @Test
    void testInserirPosicao() {
        lista.inserirFim("A");
        lista.inserirFim("C");
        lista.inserirPosicao(1, "B");
        assertEquals("B", lista.obterPosicao(1));
    }

    @Test
    void testRemoverInicio() {
        lista.inserirInicio("X");
        assertEquals("X", lista.removerInicio());
    }

    @Test
    void testRemoverFim() {
        lista.inserirFim("Y");
        assertEquals("Y", lista.removerFim());
    }

    @Test
    void testPesquisar() {
        lista.inserirFim("A");
        lista.inserirFim("B");
        lista.inserirFim("C");
        assertEquals(1, lista.pesquisar("B"));
    }

    @Test
    void testTamanho() {
        lista.inserirFim("A");
        lista.inserirFim("B");
        assertEquals(2, lista.tamanho());
    }

    @Test
    void testEstaVazia() {
        assertTrue(lista.estaVazia());
        lista.inserirFim("X");
        assertFalse(lista.estaVazia());
    }
}
