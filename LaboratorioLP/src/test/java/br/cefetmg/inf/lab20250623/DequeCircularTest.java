package br.cefetmg.inf.lab20250623;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DequeCircularTest {
    
    public DequeCircularTest() {
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
public void testInserirNoInicio() {
    DequeCircular instance = new DequeCircular();
    instance.inserirNoInicio(10);
    assertEquals(1, instance.tamanho());
    assertEquals(10, instance.obterPrimeiro());
    assertEquals(10, instance.obterUltimo());
}

@Test
public void testInserirNoFim() {
    DequeCircular instance = new DequeCircular();
    instance.inserirNoFim(20);
    assertEquals(1, instance.tamanho());
    assertEquals(20, instance.obterPrimeiro());
    assertEquals(20, instance.obterUltimo());
}

@Test
public void testRemoverPrimeiro() {
    DequeCircular instance = new DequeCircular();
    instance.inserirNoFim(30);
    Integer removed = instance.removerPrimeiro();
    assertEquals(30, removed);
    assertTrue(instance.estaVazia());
}

@Test
public void testRemoverUltimo() {
    DequeCircular instance = new DequeCircular();
    instance.inserirNoInicio(40);
    Integer removed = instance.removerUltimo();
    assertEquals(40, removed);
    assertTrue(instance.estaVazia());
}

@Test
public void testEstaVazia() {
    DequeCircular instance = new DequeCircular();
    assertTrue(instance.estaVazia());
    instance.inserirNoInicio(50);
    assertFalse(instance.estaVazia());
}

@Test
public void testTamanho() {
    DequeCircular instance = new DequeCircular();
    assertEquals(0, instance.tamanho());
    instance.inserirNoInicio(60);
    instance.inserirNoFim(70);
    assertEquals(2, instance.tamanho());
}
}
