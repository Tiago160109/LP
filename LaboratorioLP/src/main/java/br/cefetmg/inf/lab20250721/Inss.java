package br.cefetmg.inf.lab20250721;

public abstract class Inss extends DepartamentoPessoal{
    
    public Inss(String nome, int codFunc, float numHoras, String data, int x) {
        super(nome, codFunc, numHoras, data, x);
    }
    public void descontoInss(){
        if(salarioB <= 1212) {
           salarioB = (salarioB - (salarioB * 0.075));
        }
        if(salarioB >= 1903.99 && salarioB <= 2826.65) {
            salarioB = (salarioB - (salarioB * 0.09));
        }
        if(salarioB >= 2427.36 && salarioB <= 3751.05) {
            salarioB = (salarioB - (salarioB * 0.12));
        }
        if(salarioB > 4664.68 ) {
            salarioB = (salarioB - (salarioB * 0.14));
        }
    }
    
}
