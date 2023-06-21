package funcionario;

public class Vendedor extends Funcionario{

    double comissao;

    public Vendedor(String nome, String matricula, double salarioBase, double comissao) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados();
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
}
