package funcionarios;

public class FuncionarioNoturno extends Funcionario{
    private int noitesTrabalhadas;

    public FuncionarioNoturno(int matricula, String nome, String cpf, int idade, double salarioBase, int noitesTrabalhadas) {
        super(matricula, nome, cpf, idade, salarioBase);
        this.noitesTrabalhadas = noitesTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (noitesTrabalhadas * 10.0);
    }
}

