package br.cefetmg.inf.lab20250714;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AbstractFilaTest {
    
    AbstractFila fila;
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public  void setUp() {
        fila = new AbstractFilaImpl();
    }
    
    @AfterEach
    public void tearDown() {
        fila = null;
    }
    
    @Test
    public void testEstaVazia() {
        fila.enfileirar(30);
        assertFalse(fila.estaVazia());
        assertEquals(30, fila.desenfileirar());
        assertTrue(fila.estaVazia());
    }

    
    @Test
    public void testTamanho() {
      assertEquals(0, fila.tamanho());
      fila.enfileirar(10);
      assertEquals(10, fila.obterNoInicio());
      assertEquals(1, fila.tamanho());
    }

    public class AbstractFilaImpl extends AbstractFila {

        private Object primeiroElemento = null;

        @Override
        public void enfileirar(Object item) {
            if (estaVazia()) {
                primeiroElemento = item;
            }
            tamanho++;
        }

        @Override
        public Object desenfileirar() {
            if (estaVazia()) {
                return null;
            }
            tamanho--;
            Object temp = primeiroElemento;
            if (tamanho == 0) {
                primeiroElemento = null;
            }
            return temp;
        }

        @Override
        public Object obterNoInicio() {
            return primeiroElemento;
        }
    }
    
}
