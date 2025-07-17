package br.cefetmg.inf.lab20250714;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FilaCircularTest extends FilaTest{
  
    @Override
    public Fila getInstance() {
        return new FilaCircular();
    }
    
}
