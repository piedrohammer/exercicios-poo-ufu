package loja;

import java.util.Random;

public class Administrativo extends Funcionario{

    public int totalHoras;


    public Administrativo(String nome, String rg, float salario) {
        super(nome, rg, salario);
        Random r = new Random();
        totalHoras = r.nextInt(15,25);
    }

    public int getTotalHoras(){
        return totalHoras;
    }

    public float calcularSalario(){
        float total = getSalario() + (getSalario()/100) * totalHoras;
        totalHoras = 0;
        return total;
    }

    public String mostraDados(){
        return super.mostraDados() +" - Total de Horas: " + totalHoras;
    }
}
