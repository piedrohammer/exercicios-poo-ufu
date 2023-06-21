package locadora;

public class Vhs  extends Midia {

    private boolean estaRebobinada;

    public Vhs(String nome, String tipo, String genero, double preco, boolean estaRebobinada) {
        super(nome, tipo, genero, preco);
        this.estaRebobinada = estaRebobinada;
    }

    public boolean getEstaRebobinada() {
        return estaRebobinada;
    }
}

