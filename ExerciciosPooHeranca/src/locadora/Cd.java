package locadora;

public class Cd extends Midia {
    private String cantor;
    private int numFaixas;

    public Cd(String nome, String tipo, String genero, double preco, String cantor, int numFaixas) {
        super(nome, tipo, genero, preco);
        this.cantor = cantor;
        this.numFaixas = numFaixas;
    }

    public String getCantor() {
        return cantor;
    }

    public int getNumFaixas() {
        return numFaixas;
    }
}
