package br.cefetmg.inf.lab20250623;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PilhaArrayTest {

    public PilhaArrayTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testEmpilhar() {
        PilhaArray pilha = new PilhaArray();
        pilha.empilhar(10);
        assertEquals(1, pilha.tamanho());
        assertEquals(10, pilha.obterNoTopo());
    }

    @Test
    public void testDesempilhar() {
        PilhaArray pilha = new PilhaArray();

        assertNull(pilha.desempilhar());

        pilha.empilhar(5);
        pilha.empilhar(20);
        assertEquals(20, pilha.desempilhar());
        assertEquals(1, pilha.tamanho());
        assertEquals(5, pilha.obterNoTopo());
    }

    @Test
    public void testObterNoTopo() {
        PilhaArray pilha = new PilhaArray();
        assertNull(pilha.obterNoTopo());

        pilha.empilhar(30);
        assertEquals(30, pilha.obterNoTopo());

        pilha.empilhar(40);
        assertEquals(40, pilha.obterNoTopo());
    }

    @Test
    public void testEstaVazia() {
        PilhaArray pilha = new PilhaArray();
        assertTrue(pilha.estaVazia());

        pilha.empilhar(1);
        assertFalse(pilha.estaVazia());

        pilha.desempilhar();
        assertTrue(pilha.estaVazia());
    }

    @Test
    public void testTamanho() {
        PilhaArray pilha = new PilhaArray();
        assertEquals(0, pilha.tamanho());

        pilha.empilhar(100);
        pilha.empilhar(200);
        assertEquals(2, pilha.tamanho());

        pilha.desempilhar();
        assertEquals(1, pilha.tamanho());
    }
}
