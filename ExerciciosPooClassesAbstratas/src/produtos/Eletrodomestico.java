package produtos;

public class Eletrodomestico implements Produto {
    private String id;
    private int anoProducao;
    private String unidadeVenda;
    private String categoria;
    private double preco;

    public Eletrodomestico(String id, int anoProducao, double preco) {
        this.id = id;
        this.anoProducao = anoProducao;
        this.unidadeVenda = "Unidade";
        this.categoria = "Eletrodoméstico";
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