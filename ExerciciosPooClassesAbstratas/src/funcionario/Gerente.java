package funcionario;

public class Gerente  extends Funcionario{


    public Gerente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public String exibeDados() {
        return super.exibeDados();
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 2;
    }
}
