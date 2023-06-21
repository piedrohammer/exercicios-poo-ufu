package empregados;

public class Empregado implements Comparable{

    private String cpf;
    private int idade;
    private float salario;

    public Empregado(String cpf, int idade, float salario) {
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }

    public Empregado(String texto){
        String vals[] = texto.split("%%%");
        this.cpf = vals[0];
        this.idade = Integer.parseInt(vals[1]);
        this.salario = Float.parseFloat(vals[2]);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "CPF: " + cpf + " - Idade: " + idade + " - Salario: RS" + salario;
    }

    public String getTextoArquivo(){
        return cpf + "%%%" + idade + "%%%" + salario;
    }

    @Override
    public int compareTo(Object o) {
        if (this.idade < ((Empregado)o).getIdade()) return  -1;
        if (this.idade > ((Empregado)o).getIdade()) return  1;
        return 0;
    }
}
