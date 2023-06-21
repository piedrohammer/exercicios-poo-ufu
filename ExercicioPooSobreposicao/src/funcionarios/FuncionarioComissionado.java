package funcionarios;

public class FuncionarioComissionado extends Funcionario{

    private double valorComissoes;

    public FuncionarioComissionado(int matricula, String nome, String cpf, int idade, double salarioBase, double valorComissoes) {
        super(matricula, nome, cpf, idade, salarioBase);
        this.valorComissoes = valorComissoes;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + valorComissoes;
    }
}

