package loja;

import java.util.Random;

public class Vendendor extends Funcionario{

    public int totalVendas;


    public Vendendor(String nome, String rg, float salario) {
        super(nome, rg, salario);
        Random r = new Random();
        totalVendas = r.nextInt(10,50);
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public float calcularSalario(){
        float total = getSalario() + (5/100) * totalVendas;
        totalVendas = 0; // -> zera/limpa "os dados"
        return total;
    }

    public String mostraDados(){
        return super.mostraDados() + " - Total de Vendas: " + totalVendas;
    }
}
