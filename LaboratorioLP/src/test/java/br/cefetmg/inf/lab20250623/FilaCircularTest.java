package br.cefetmg.inf.lab20250623;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FilaCircularTest {

    public FilaCircularTest() {
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
    public void testEnfileirar() {
        FilaCircular fila = new FilaCircular();
        fila.enfileirar(0);
        assertEquals(1, fila.tamanho());
        assertEquals(0, fila.obterNoInicio());
    }

    @Test
    public void testDesenfileirar() {
        FilaCircular fila = new FilaCircular();
        assertNull(fila.desenfileirar());

        fila.enfileirar(10);
        fila.enfileirar(20);
        assertEquals(10, fila.desenfileirar());
        assertEquals(1, fila.tamanho());
        assertEquals(20, fila.obterNoInicio());
    }

    @Test
    public void testTamanho() {
        FilaCircular fila = new FilaCircular();
        assertEquals(0, fila.tamanho());
        fila.enfileirar(5);
        fila.enfileirar(15);
        assertEquals(2, fila.tamanho());
        fila.desenfileirar();
        assertEquals(1, fila.tamanho());
    }

    @Test
    public void testObterNoInicio() {
        FilaCircular fila = new FilaCircular();
        assertNull(fila.obterNoInicio());
        fila.enfileirar(42);
        assertEquals(42, fila.obterNoInicio());
        fila.enfileirar(99);
        assertEquals(42, fila.obterNoInicio());
    }

    @Test
    public void testEstaVazia() {
        FilaCircular fila = new FilaCircular();
        assertTrue(fila.estaVazia());
        fila.enfileirar(1);
        assertFalse(fila.estaVazia());
        fila.desenfileirar();
        assertTrue(fila.estaVazia());
    }
}
