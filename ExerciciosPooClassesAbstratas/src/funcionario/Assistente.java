package funcionario;

public class Assistente extends Funcionario{

    public Assistente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public String exibeDados() {
        return super.exibeDados();
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }


}
