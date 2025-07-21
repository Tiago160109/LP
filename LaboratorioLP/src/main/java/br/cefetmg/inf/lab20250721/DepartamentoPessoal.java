package br.cefetmg.inf.lab20250721;

public abstract class DepartamentoPessoal extends FuncionarioFcm{

    public DepartamentoPessoal(String nome, int codFunc, float numHoras, String data, int x) {
        super(nome, codFunc, numHoras, data, x);
    }
    public void pagamentoBruto() {
        for(int i = 0; i < numHoras; i++){
            if(numHoras > 8.0){
                salarioB = salarioB + 150;
            }
            else{
                salarioB = salarioB + 100;
            }
        }
        
    }
}
