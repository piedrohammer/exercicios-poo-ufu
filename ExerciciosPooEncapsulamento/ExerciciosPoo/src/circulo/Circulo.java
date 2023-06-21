package circulo;

import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {
        // Leitura dos objetos.
        Scanner ler = new Scanner(System.in);

        double r, area, circunferencia, diametro;

        System.out.println("==========================================");

        System.out.printf("Raio: ");
        r = ler.nextDouble();

        // Operações matematicas em Java.
        area = Math.PI * Math.pow(r, 2);
        circunferencia = 2 * Math.PI * r;
        diametro = 2 * r;


        System.out.printf("Diâmetro        = %.2f\n", diametro);
        System.out.printf("Circunferencia  = %.2f\n", circunferencia);
        System.out.printf("Área            = %.2f\n", area);
        System.out.println("==========================================");
    }






}


