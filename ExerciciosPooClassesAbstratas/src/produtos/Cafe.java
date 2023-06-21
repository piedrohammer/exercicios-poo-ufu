package produtos;

public class Cafe implements Produto {
    private String id;
    private int anoProducao;
    private String unidadeVenda;
    private String categoria;
    private double preco;

    public Cafe(String id, int anoProducao, double preco) {
        this.id = id;
        this.anoProducao = anoProducao;
        this.unidadeVenda = "Kg";
        this.categoria = "Alimento";
        this.preco = preco;
    }

    public String getId() {
        return id;
    }

    public int getAnoProducao() {
        return anoProducao;
    }

    public String getUnidadeVenda() {
        return unidadeVenda;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }
}