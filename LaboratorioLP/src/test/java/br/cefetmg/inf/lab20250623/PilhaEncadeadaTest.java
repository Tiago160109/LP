package br.cefetmg.inf.lab20250623;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PilhaEncadeadaTest {
    
    public PilhaEncadeadaTest() {
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
     * Test of empilhar method, of class PilhaEncadeada.
     */
    @Test
    public void testEmpilhar() {
        System.out.println("empilhar");
        int item = 0;
        PilhaEncadeada instance = new PilhaEncadeada();
        instance.empilhar(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desempilhar method, of class PilhaEncadeada.
     */
    @Test
    public void testDesempilhar() {
        System.out.println("desempilhar");
        PilhaEncadeada instance = new PilhaEncadeada();
        Integer expResult = null;
        Integer result = instance.desempilhar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterNoTopo method, of class PilhaEncadeada.
     */
    @Test
    public void testObterNoTopo() {
        System.out.println("obterNoTopo");
        PilhaEncadeada instance = new PilhaEncadeada();
        Integer expResult = null;
        Integer result = instance.obterNoTopo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVazia method, of class PilhaEncadeada.
     */
    @Test
    public void testEstaVazia() {
        System.out.println("estaVazia");
        PilhaEncadeada instance = new PilhaEncadeada();
        boolean expResult = false;
        boolean result = instance.estaVazia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class PilhaEncadeada.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        PilhaEncadeada instance = new PilhaEncadeada();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
