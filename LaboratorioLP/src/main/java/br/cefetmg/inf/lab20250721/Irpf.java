package br.cefetmg.inf.lab20250721;

public abstract class Irpf extends Inss{
    
    public Irpf(String nome, int codFunc, float numHoras, String data, int x) {
        super(nome, codFunc, numHoras, data, x);
    }
    public void descontoIrpf(){
        if(salarioB <= 1903.98) {
           salarioB += 0;
        }
        if(salarioB > 1903.99 && salarioB <= 2826.65) {
            salarioB = salarioB + ((salarioB * 0.075) - 142.80);
        }
        if(salarioB > 2826.66 && salarioB <= 3751.05) {
            salarioB = salarioB + ((salarioB * 0.15) - 354.80);
        }
        if(salarioB > 3751.06 && salarioB <= 4664.68) {
            salarioB = salarioB + ((salarioB * 0.225) - 636.13);
        }
        if(salarioB > 4664.68 ) {
            salarioB = salarioB + ((salarioB * 0.275) - 869.36);
        }
    }
    
}
