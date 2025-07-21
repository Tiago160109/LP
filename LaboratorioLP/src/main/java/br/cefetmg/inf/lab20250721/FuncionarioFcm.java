package br.cefetmg.inf.lab20250721;

public abstract class FuncionarioFcm {
    protected ListaArray dados;
    protected String nome;
    protected int codFunc;
    protected float numHoras;
    protected double salarioB;
    protected String data;
    public FuncionarioFcm(String nome, int codFunc, float numHoras, String data, int x) {
        this.nome = nome;
        dados = new ListaArray(x);
        this.codFunc = codFunc;
        this.numHoras = numHoras;
        this.data = data;
    }
   
}
