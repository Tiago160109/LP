package br.cefetmg.inf.lab20251006;

public class Aluno {

    private long matricula;
    private String nome;
    private String curso;

    public Aluno(long matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public long getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", curso=" + curso + '}';
    }
    public boolean equals(Object o){
        Aluno outro = (Aluno) o;

        return matricula == outro.getMatricula();
    }
    
        
}
