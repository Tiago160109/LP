package br.cefetmg.inf.lab20250623;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PilhaTest {

    private Pilha pilha;

    @BeforeEach
    public void setUp() {
        pilha = new PilhaImpl();
    }

    @Test
    public void testEmpilharEObterNoTopo() {
        pilha.empilhar(10);
        assertEquals(10, pilha.obterNoTopo());
        assertEquals(1, pilha.tamanho());
    }

    @Test
    public void testDesempilhar() {
        pilha.empilhar(20);
        assertEquals(20, pilha.desempilhar());
        assertTrue(pilha.estaVazia());
    }

    @Test
    public void testObterNoTopoSemRemover() {
        pilha.empilhar(30);
        pilha.empilhar(40);
        assertEquals(40, pilha.obterNoTopo());
        assertEquals(2, pilha.tamanho());
    }

    @Test
    public void testEstaVazia() {
        assertTrue(pilha.estaVazia());
        pilha.empilhar(50);
        assertFalse(pilha.estaVazia());
    }

    @Test
    public void testTamanho() {
        assertEquals(0, pilha.tamanho());
        pilha.empilhar(60);
        pilha.empilhar(70);
        assertEquals(2, pilha.tamanho());
    }

    @Test
    public void testMultiplasOperacoes() {
        pilha.empilhar(80);
        pilha.empilhar(90);
        pilha.empilhar(100);
        assertEquals(100, pilha.obterNoTopo());
        assertEquals(100, pilha.desempilhar());
        assertEquals(90, pilha.obterNoTopo());
        assertEquals(2, pilha.tamanho());
    }

    public class PilhaImpl implements Pilha {
        private java.util.Deque<Integer> dados = new java.util.LinkedList<>();

        @Override
        public void empilhar(int item) {
            dados.push(item); 
        }

        @Override
        public Integer desempilhar() {
            return dados.isEmpty() ? null : dados.pop();
        }

        @Override
        public Integer obterNoTopo() {
            return dados.isEmpty() ? null : dados.peek();
        }

        @Override
        public boolean estaVazia() {
            return dados.isEmpty();
        }

        @Override
        public int tamanho() {
            return dados.size();
        }
    }
}