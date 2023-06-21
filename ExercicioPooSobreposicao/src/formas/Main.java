package formas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Forma f[] = new Forma[10];

        f[0] = new Circulo("preto", 3, 5, 5);
        f[1] = new Tetraedro("azul", 2, 4, 8, 2, 2, 3);
        f[2] = new Cubo("verde", 2, 2, 4,6);
        f[3] = new Quadrado("cinza", 7, 7, 9);
        f[4] = new Triangulo("rosa", 6, 3, 2, 4);
        f[5] = new Esfera("marrom", 6, 3, 4, 4);
        f[6] = new Circulo("roxo", 9, 4, 5);
        f[7] = new Quadrado("branco", 5, 5, 6);
        f[8] = new Quadrado("vermelho", 4, 4, 8);
        f[9] = new Triangulo("bege", 2, 1, 6, 7);
        int op;

        do{
            System.out.println(" 2 - Exibir formas cadastradas");
            System.out.println(" 3 - Mostrar area das formas bidimensionais");
            System.out.println(" 4 - Mostras o volume das formas tridimensionais");
            System.out.println(" 5 - Sair");
            System.out.println("OPÇÃO: ");
            op = sc.nextInt();

            switch (op){
                case 2:
                    for (int i = 0; i < 10; i++)
                        System.out.println(f[i].exibeDados());
                    break;

                case 3:
                    for (int i = 0; i < 10; i++)
                        if(f[i] instanceof FormaBidimensional)
                            System.out.println("Area: " + ((FormaBidimensional) f[i]).calcularArea());
                    break;

                case 4:
                    for (int i = 0; i < 10; i++)
                        if(f[i] instanceof FormaTridimensional)
                            System.out.println("Volume: " + ((FormaTridimensional) f[i]).calcularVolume());
                    break;
            }



        }while (op != 5);
    }
}