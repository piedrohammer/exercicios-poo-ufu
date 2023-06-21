package veiculos;

public class Moto implements Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private double potencia;

    public Moto(String marca, String modelo, String cor, double potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
    }

    public String marca() {
        return this.marca;
    }

    public String modelo() {
        return this.modelo;
    }

    public String cor() {
        return this.cor;
    }

    public double potencia() {
        return this.potencia;
    }
    public void mostraDados() {
        System.out.println("Marca: " + marca() + " - Modelo: " + modelo() + " - Cor: " + cor() + " - Potência: " + potencia());
    }
}