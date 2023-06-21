package locadora;

import java.util.Arrays;

public class Dvd extends Midia {
    private String[] atores;
    private String diretor;
    private int duracao;

    public Dvd(String nome, String tipo, String genero, double preco, String[] atores, String diretor, int duracao) {
        super(nome, tipo, genero, preco);
        this.atores = atores;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String[] getAtores() {
        return atores;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }
    public String mostraDados(){
        return super.mostraDados()  + " - Atores: " + atores + " - Diretor: " + diretor + " - Duração: " + duracao;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "atores=" + Arrays.toString(atores) +
                '}';
    }
}
