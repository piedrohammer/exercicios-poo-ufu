package funcionario;

public abstract class Funcionario {

    String nome;

    String matricula;

    double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public String exibeDados(){
        return "Nome: " + nome + " - Matrícula: " + matricula + " - Salario Base: R$" + salarioBase + " | ";
    }

    public abstract double calcularSalario();


}
