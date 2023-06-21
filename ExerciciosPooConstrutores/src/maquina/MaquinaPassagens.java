package maquina;

public class MaquinaPassagens {


    private double preco;
    private double quantidadeInserida;
    private double total;

    public MaquinaPassagens(double p) {
        preco = p;
        quantidadeInserida = 0;
        total = 0;
    }

    public double getPreco() {
        return preco;
    }

    public double getQuantidadeInserida() {
        return quantidadeInserida;
    }

    //Recebendo o dinheiro e checando
    public void inserirDinheiro(double quantia){
        if(quantia > 0){
            quantidadeInserida = quantidadeInserida + quantia;
        } else {
            System.out.println("Insira outro valor acima de R$0");
        }
    }

    public void exbirPasagem()
    {
        if(quantidadeInserida >= preco) {
            // Exibindo a passagem
            System.out.println("=-=-=-=-= Recibo Passagem =-=-=-=-=");
            System.out.println("          R$" + preco + " Reais");
            System.out.println("=-=-=-=-= Recibo Passagem =-=-=-=-=");
            System.out.println();

            // Dinhero "Final"
            total = total + preco;

            quantidadeInserida = quantidadeInserida - preco;
        }
        // Caso falte dinheiro para comprar
        else {
            System.out.println("Você precisade mais R$" +
                    (preco - quantidadeInserida) + " para adquirir a passagem");

        }
    }
}
