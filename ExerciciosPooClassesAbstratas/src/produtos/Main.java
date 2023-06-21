package produtos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        // Adicionando produtos na lista
        produtos.add(new Eletrodomestico("ELE01", 2019, 2499.99));
        produtos.add(new Eletrodomestico("ELE02", 2022, 3500.00));
        produtos.add(new Vinho("VIN01", 2022, 299.99));
        produtos.add(new Vinho("VIN02", 1945, 799.99));
        produtos.add(new Cafe("CAF01", 2022, 15.50));
        produtos.add(new Cafe("CAF02", 2023, 30.90));

        // Iterando sobre a lista e mostrando os produtos
        for (Produto p : produtos) {
            System.out.println("ID: " + p.getId());
            System.out.println("Ano de produção: " + p.getAnoProducao());
            System.out.println("Unidade de venda: " + p.getUnidadeVenda());
            System.out.println("Categoria: " + p.getCategoria());
            System.out.println("Preço: R$" + p.getPreco());
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }

        System.out.print("Digite a categoria dos produtos que deseja calcular a quantidade e o preço total: ");
        String categoria = sc.nextLine();

        int quantidade = 0;
        double precoTotal = 0;

        // Iterando sobre a lista e calculando a quantidade e o preço total da categoria informada
        for (Produto p : produtos) {
            if (p.getCategoria().equalsIgnoreCase(categoria)) {
                quantidade++;
                precoTotal += p.getPreco();
            }
        }

        // Imprimindo os resultados
        System.out.println("Quantidade de produtos da categoria " + categoria + ": " + quantidade);
        System.out.println("Preço total dos produtos da categoria " + categoria + ": R$ " + precoTotal);

        double total = 0;

        for (Produto p : produtos) {
            total += p.getPreco();
        }

        // Formartar valore double em 2 casa decimal
        DecimalFormat df = new DecimalFormat("#.##");
        String valorFormatado = df.format(total);

        System.out.println("Total geral dos produtos: R$ " + valorFormatado);
    }
}

