package br.cefetmg.inf.lab20250623;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DequeTest {

    private Deque deque;

    @BeforeEach
    public void setUp() {
        deque = new DequeImpl();
    }

    @Test
    public void testInserirNoInicio() {
        deque.inserirNoInicio(10);
        assertEquals(10, deque.obterPrimeiro());
        assertEquals(1, deque.tamanho());
    }

    @Test
    public void testInserirNoFim() {
        deque.inserirNoFim(20);
        assertEquals(20, deque.obterUltimo());
        assertEquals(1, deque.tamanho());
    }

    @Test
    public void testRemoverPrimeiro() {
        deque.inserirNoInicio(30);
        assertEquals(30, deque.removerPrimeiro());
        assertTrue(deque.estaVazia());
    }

    @Test
    public void testRemoverUltimo() {
        deque.inserirNoFim(40);
        assertEquals(40, deque.removerUltimo());
        assertTrue(deque.estaVazia());
    }

    @Test
    public void testObterPrimeiroEUltimo() {
        deque.inserirNoInicio(50);
        deque.inserirNoFim(60);
        assertEquals(50, deque.obterPrimeiro());
        assertEquals(60, deque.obterUltimo());
    }

    @Test
    public void testEstaVazia() {
        assertTrue(deque.estaVazia());
        deque.inserirNoFim(70);
        assertFalse(deque.estaVazia());
    }

    @Test
    public void testTamanho() {
        assertEquals(0, deque.tamanho());
        deque.inserirNoFim(80);
        deque.inserirNoInicio(90);
        assertEquals(2, deque.tamanho());
    }

    public class DequeImpl implements Deque {
        private java.util.Deque<Integer> data = new java.util.LinkedList<>();

        public void inserirNoInicio(int item) {
            data.addFirst(item);
        }

        public void inserirNoFim(int item) {
            data.addLast(item);
        }

        public Integer removerPrimeiro() {
            return data.isEmpty() ? null : data.removeFirst();
        }

        public Integer removerUltimo() {
            return data.isEmpty() ? null : data.removeLast();
        }

        public Integer obterPrimeiro() {
            return data.isEmpty() ? null : data.getFirst();
        }

        public Integer obterUltimo() {
            return data.isEmpty() ? null : data.getLast();
        }

        public boolean estaVazia() {
            return data.isEmpty();
        }

        public int tamanho() {
            return data.size();
        }
    }
}
