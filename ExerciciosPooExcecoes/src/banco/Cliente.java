package banco;


import banco.excecao.ClienteExcecao;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private int idade;
    private Conta conta;

    public Cliente(String n, String cpf, String t, int i, Conta c) throws ClienteExcecao {
        nome = n;
        cpf = cpf;
        telefone = t;
        if (i < 18) throw new ClienteExcecao("Cliente deve ser maior de idade");
        else idade = i;
        conta = c;
    }

    public int getIdade() {
        return idade;
    }

    public Conta getConta() {
        return conta;
    }

    public String mostraDados(){
        return nome + " - CPF:" +cpf+ " - Telefone: " +telefone+ "";
    }
}
