package br.cefetmg.inf.lab20250623;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DequeEncadeadoTest {
    
    public DequeEncadeadoTest() {
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
     * Test of inserirNoInicio method, of class DequeEncadeado.
     */
    @Test
    public void testInserirNoInicio() {
        System.out.println("inserirNoInicio");
        int item = 0;
        DequeEncadeado instance = new DequeEncadeado();
        instance.inserirNoInicio(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirNoFim method, of class DequeEncadeado.
     */
    @Test
    public void testInserirNoFim() {
        System.out.println("inserirNoFim");
        int item = 0;
        DequeEncadeado instance = new DequeEncadeado();
        instance.inserirNoFim(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerPrimeiro method, of class DequeEncadeado.
     */
    @Test
    public void testRemoverPrimeiro() {
        System.out.println("removerPrimeiro");
        DequeEncadeado instance = new DequeEncadeado();
        Integer expResult = null;
        Integer result = instance.removerPrimeiro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerUltimo method, of class DequeEncadeado.
     */
    @Test
    public void testRemoverUltimo() {
        System.out.println("removerUltimo");
        DequeEncadeado instance = new DequeEncadeado();
        Integer expResult = null;
        Integer result = instance.removerUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterPrimeiro method, of class DequeEncadeado.
     */
    @Test
    public void testObterPrimeiro() {
        System.out.println("obterPrimeiro");
        DequeEncadeado instance = new DequeEncadeado();
        Integer expResult = null;
        Integer result = instance.obterPrimeiro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterUltimo method, of class DequeEncadeado.
     */
    @Test
    public void testObterUltimo() {
        System.out.println("obterUltimo");
        DequeEncadeado instance = new DequeEncadeado();
        Integer expResult = null;
        Integer result = instance.obterUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVazia method, of class DequeEncadeado.
     */
    @Test
    public void testEstaVazia() {
        System.out.println("estaVazia");
        DequeEncadeado instance = new DequeEncadeado();
        boolean expResult = false;
        boolean result = instance.estaVazia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class DequeEncadeado.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        DequeEncadeado instance = new DequeEncadeado();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
