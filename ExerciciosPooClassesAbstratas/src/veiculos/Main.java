package veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo[] v = new Veiculo[5];
        v[0] = new Carro("Ford", "Fusion", "Vermelho", 150.0);
        v[1] = new Carro("Toyota", "Etios", "Preto", 75.0);
        v[2] = new Moto("Honda", "CB600", "Vermelho", 70.0);
        v[3] = new Moto("Yamaha", "Fazer", "Branco", 60.0);
        v[4] = new Carro("Fiat", "Uno", "Vermelho", 80.0);

        double maiorPotenciaVermelho = Double.MIN_VALUE;
        double menorPotenciaVermelho = Double.MAX_VALUE;
        String marcaMaisPotenteVermelho = "";
        String marcaMenosPotenteVermelho = "";

        for (Veiculo veiculo : v) {
            if (veiculo.cor().equals("Vermelho")) {
                if (veiculo.potencia() > maiorPotenciaVermelho) {
                    maiorPotenciaVermelho = veiculo.potencia();
                    marcaMaisPotenteVermelho = " - Marca " + veiculo.marca() + " - Modelo " +veiculo.modelo();

                }

                if (veiculo.potencia() < menorPotenciaVermelho) {
                    menorPotenciaVermelho = veiculo.potencia();
                    marcaMenosPotenteVermelho = " - Marca " + veiculo.marca() + " - Modelo " +veiculo.modelo();

                }
            }
        }

        System.out.println("Marca do carro mais potente na cor vermelha: " + marcaMaisPotenteVermelho);
        System.out.println("Marca do carro menos potente na cor vermelha: " + marcaMenosPotenteVermelho);
    }
}
