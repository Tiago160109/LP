package br.cefetmg.inf.lab20250929;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DequeCircularTest {
    
    private DequeCircular<Integer> deque;

    @BeforeEach
    public void setUp() {
        deque = new DequeCircular<>();
    }

    @Test
    public void testInserirNoInicio() throws Exception{
        deque.inserirNoInicio(10);
        deque.inserirNoInicio(20);
        assertEquals(20, deque.obterPrimeiro());
        assertEquals(10, deque.obterUltimo());
        assertEquals(2, deque.tamanho());
    }

    @Test
    public void testInserirNoFim() throws Exception{

            deque.inserirNoFim(10);
            deque.inserirNoFim(20);
            assertEquals(10, deque.obterPrimeiro());
            assertEquals(20, deque.obterUltimo());
            assertEquals(2, deque.tamanho());
    }

    @Test
    public void testRemoverPrimeiro() throws Exception{
        
            deque.inserirNoInicio(10);
            deque.inserirNoInicio(20);
            assertEquals(20, deque.removerPrimeiro());
            assertEquals(10, deque.obterPrimeiro());
            assertEquals(1, deque.tamanho());
            assertEquals(10, deque.removerPrimeiro());
            try{
                deque.removerPrimeiro();
                assertTrue(false);
            }
            catch(EmptyDequeException e) {
                assertTrue(true);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                assertTrue(false);
            }
            

    }

    @Test
    public void testRemoverUltimo() throws Exception{
        deque.inserirNoFim(3);
        deque.inserirNoFim(40);
        assertEquals(40, deque.removerUltimo());
        assertEquals(3, deque.obterUltimo());
        assertEquals(1, deque.tamanho());
        assertEquals(3, deque.removerUltimo());
            try{
                deque.removerUltimo();
                assertTrue(false);
            }
            catch(EmptyDequeException e) {
                assertTrue(true);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                assertTrue(false);
            }
        
    }

    @Test
    public void testEstaVazia() {
        assertTrue(deque.estaVazia());
        deque.inserirNoInicio(10);
        assertFalse(deque.estaVazia());
    }

    @Test
    public void testTamanho() {
        assertEquals(0, deque.tamanho());
        deque.inserirNoInicio(10);
        deque.inserirNoFim(20);
        assertEquals(2, deque.tamanho());
    }
    @Test
    void testToArray() throws EmptyDequeException {
        DequeCircular<String> deque = new DequeCircular<>();
        deque.inserirNoFim("A");
        deque.inserirNoFim("B");
        deque.inserirNoFim("C");

        Object[] arr = deque.toArray();
        assertArrayEquals(new Object[]{"A", "B", "C"}, arr);
    }
}
