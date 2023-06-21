package conversão;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float f;
        int t = 0;

        boolean correto = false;

        while (!correto && t < 3){
            System.out.println("Número: ");
            try{
                f = sc.nextFloat();
                System.out.println("Número digitado: " + f);
                correto = true;
            } catch (InputMismatchException e ){
                sc.nextLine();
                System.out.println("ERRO");
                t++;
                if (t >= 3)
                    System.out.println("Tentativas esgotadas");
            }
        }

    }
}