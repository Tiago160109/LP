package br.cefetmg.inf.lab20250714;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FilaTest {

    private Fila fila;

    @BeforeEach
    public void setUp() {
        fila = new FilaImpl();
    }

    @Test
    public void testEnfileirarEObterNoInicio() {
        fila.enfileirar(10);
        assertEquals(10, fila.obterNoInicio());
        assertEquals(1, fila.tamanho());
    }

    @Test
    public void testDesenfileirar() {
        fila.enfileirar(20);
        Object removido = fila.desenfileirar();
        assertEquals(20, removido);
        assertTrue(fila.estaVazia());
    }

    @Test
    public void testObterNoInicioSemRemover() {
        fila.enfileirar(30);
        assertEquals(30, fila.obterNoInicio());
        assertEquals(1, fila.tamanho());
    }

    @Test
    public void testEstaVazia() {
        assertTrue(fila.estaVazia());
        fila.enfileirar(40);
        assertFalse(fila.estaVazia());
    }

    @Test
    public void testTamanho() {
        assertEquals(0, fila.tamanho());
        fila.enfileirar(50);
        fila.enfileirar(60);
        assertEquals(2, fila.tamanho());
    }

    @Test
    public void testFilaComMultiplosElementos() {
        fila.enfileirar(70);
        fila.enfileirar(80);
        fila.enfileirar(90);
        assertEquals(3, fila.tamanho());

        assertEquals(70, fila.obterNoInicio());
        assertEquals(70, fila.desenfileirar());

        assertEquals(80, fila.obterNoInicio());
        assertEquals(2, fila.tamanho());
    }

    public class FilaImpl implements Fila {
        private java.util.Queue<Object> dados = new java.util.LinkedList<>();

        @Override
        public void enfileirar(Object item) {
            dados.add(item);
        }

        @Override
        public Object desenfileirar() {
            return dados.poll();
        }

        @Override
        public Object obterNoInicio() {
            return dados.peek();
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
