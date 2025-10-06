package br.cefetmg.inf.lab20251006;
 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DicionarioTest {

    private Dicionario<Aluno> dicionario;
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;

    @BeforeEach
    public void setUp() {
        dicionario = new Dicionario<>(); 
        aluno1 = new Aluno(1001L, "João", "Engenharia");
        aluno2 = new Aluno(1002L, "Maria", "Medicina");
        aluno3 = new Aluno(1003L, "Ana", "Direito");
    }

    @Test
    public void testInserirAluno() throws Exception {
        dicionario.inserir(aluno1);
        assertEquals(aluno1, dicionario.obter(aluno1));

        dicionario.inserir(aluno2);
        assertEquals(aluno2, dicionario.obter(aluno2));

        dicionario.inserir(aluno3);
        assertEquals(aluno3, dicionario.obter(aluno3));
    }

    @Test
    public void testNaoInserirAlunoDuplicado() {
        dicionario.inserir(aluno1);
        dicionario.inserir(aluno1);

        assertEquals(1, dicionario.lista.tamanho());
    }

    @Test
    public void testRemoverAluno() throws Exception {
        dicionario.inserir(aluno1);
        dicionario.inserir(aluno2);
        dicionario.inserir(aluno3);

        Aluno removido = dicionario.remover(aluno1);
        assertEquals(aluno1, removido);
        
        assertThrows(DicionarioVazioException.class, () -> dicionario.obter(aluno1));

        assertEquals(2, dicionario.lista.tamanho());
    }

    @Test
    public void testRemoverAlunoNaoExistente() throws Exception {
        dicionario.inserir(aluno1);
        dicionario.inserir(aluno2);

        Aluno removido = dicionario.remover(aluno3);
        assertNull(removido);
    }

    @Test
    public void testObterAluno() throws Exception {
        dicionario.inserir(aluno1);
        dicionario.inserir(aluno2);

        assertEquals(aluno1, dicionario.obter(aluno1));
        assertEquals(aluno2, dicionario.obter(aluno2));
    }

    @Test
    public void testObterAlunoNaoExistente() {
        dicionario.inserir(aluno1);

        assertThrows(DicionarioVazioException.class, () -> dicionario.obter(aluno2));
    }

    @Test
    public void testDicionarioVazio() {
        assertThrows(DicionarioVazioException.class, () -> dicionario.remover(aluno1));
    }
}



