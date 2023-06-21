package loja;

public class Funcionario {

    String nome;
    String rg;
    float salario;

    public Funcionario(String nome, String rg, float salario) {
        this.nome = nome;
        this.rg = rg;
        this.salario = salario;
    }


    // Getters e Setters adicionado por padrão
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String mostraDados(){
        return nome + "("+rg+") - Salario Base " +salario+"";
    }
}
