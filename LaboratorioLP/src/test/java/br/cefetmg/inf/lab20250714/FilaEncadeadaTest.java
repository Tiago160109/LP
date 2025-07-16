package br.cefetmg.inf.lab20250714;

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
        Object item = null;
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
        Object expResult = null;
        Object result = instance.desenfileirar();
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
        Object expResult = null;
        Object result = instance.obterNoInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
