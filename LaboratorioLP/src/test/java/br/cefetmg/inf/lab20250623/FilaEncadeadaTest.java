package br.cefetmg.inf.lab20250623;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FilaEncadeadaTest {
    
    public FilaEncadeadaTest() {
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

    /**
     * Test of enfileirar method, of class FilaEncadeada.
     */
    @Test
    public void testEnfileirar() {
        System.out.println("enfileirar");
        int item = 0;
        FilaEncadeada instance = new FilaEncadeada();
        instance.enfileirar(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desenfileirar method, of class FilaEncadeada.
     */
    @Test
    public void testDesenfileirar() {
        System.out.println("desenfileirar");
        FilaEncadeada instance = new FilaEncadeada();
        Integer expResult = null;
        Integer result = instance.desenfileirar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterNoInicio method, of class FilaEncadeada.
     */
    @Test
    public void testObterNoInicio() {
        System.out.println("obterNoInicio");
        FilaEncadeada instance = new FilaEncadeada();
        Integer expResult = null;
        Integer result = instance.obterNoInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class FilaEncadeada.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        FilaEncadeada instance = new FilaEncadeada();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVazia method, of class FilaEncadeada.
     */
    @Test
    public void testEstaVazia() {
        System.out.println("estaVazia");
        FilaEncadeada instance = new FilaEncadeada();
        boolean expResult = false;
        boolean result = instance.estaVazia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
