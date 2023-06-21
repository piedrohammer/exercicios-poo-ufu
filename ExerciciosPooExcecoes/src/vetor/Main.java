package vetor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[10];
        int posicao = 0;

        while (true) {
            try {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Inserir valor");
                System.out.println("2 - Sair");


                int opcao = scanner.nextInt();

                if (opcao == 2) {
                    break;
                }

                System.out.println("Digite a posição (0 a 9) ou -1 para sair:");
                posicao = scanner.nextInt();

                if (posicao == -1) {
                    break;
                }
                if (posicao < 0 || posicao >= 10) {
                    throw new ArrayIndexOutOfBoundsException("Posição inválida");
                }
                if (numero[posicao] != 0) {
                    throw new Exception("Já existe um valor na posição " + posicao);
                }

                System.out.println("Digite o valor:");
                numero[posicao] = scanner.nextInt();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.print("Vetor: [");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i]);
            if (i < numero.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
