package funcionarios;

public abstract class Funcionario {

    protected int matricula;
    protected String nome;
    protected String cpf;
    protected int idade;
    protected double salarioBase;

    public Funcionario(int matricula, String nome, String cpf, int idade, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return 0;
    }
}
