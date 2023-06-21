package funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario f[] = new Funcionario[5];

        f[0] = new Gerente("Pedro", "G01", 1500.0);
        f[1] = new Assistente("Carlos", "A01", 500.0);
        f[2] = new Assistente("Ana", "A02", 500.0);
        f[3] = new Vendedor("Lucas", "V01", 1000.0, 30);
        f[4] = new Vendedor("Clara", "V02", 1000.0, 35);

        System.out.println("=-=-=-=-=-=-= FOLHA SALARIAL =-=-=-=-=-=-=");

        int nGerente = 0, nVendedor = 0, nAssistente = 0;
        double mGerente = 0, mVendedor = 0, mAssistente = 0;

        for(int i = 0; i < 5; i++){
            System.out.println(f[i].exibeDados() + " - Salario: R$" + f[i].calcularSalario());
            if (f[i] instanceof Gerente){
                nGerente++;
                mGerente += f[i].calcularSalario();
            }

            if (f[i] instanceof Vendedor){
                nVendedor++;
                mVendedor += f[i].calcularSalario();
            }

            if (f[i] instanceof Assistente){
                nAssistente++;
                mAssistente += f[i].calcularSalario();
            }

            System.out.println("Salario Total: " + (mVendedor + mAssistente + mGerente));

            System.out.println("Media Salarial Vendedor: ");
            if (nVendedor > 0) System.out.println(mVendedor/nVendedor);
            else System.out.println("Sem Vendedores");

            System.out.println("Media Salarial Assistente: ");
            if (nAssistente > 0) System.out.println(mAssistente/nAssistente);
            else System.out.println("Sem Assistente");

            System.out.println("Media Salarial Gerente: ");
            if (nGerente > 0) System.out.println(mGerente/nGerente);
            else System.out.println("Sem Gerente");

        }
    }
}