package loja;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {

        Administrativo adms[] = new Administrativo[5]; // ->  para criar os 5 Admistrativos
        Vendendor vends[] = new Vendendor[5]; // -> para criar os 5 Vendedores
        int op = 0, ca = 0, cv = 0; // -> iniciando com 0 criados
        Scanner sc = new Scanner(System.in);
        String nome, rg;

        //Criação do Menu
        do {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1 - Inserir Admistrativo  |");
            System.out.println("2 - Inserir Vendedor      |");
            System.out.println("3 - Exibir Funcionarios   |");
            System.out.println("4 - Fechar Folha Salarial |");
            System.out.println("5 - Sair                  |");
            System.out.println("Opção:                    |");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            op = sc.nextInt();


            switch (op){

                //Criando Administrativo
                case  1:
                    System.out.println("Nome: ");
                    nome = sc.next();
                    System.out.println("RG: ");
                    rg = sc.next();
                    sc.nextLine();
                    adms[ca] = new Administrativo(nome, rg, 1000);
                    ca++;
                    break;

                //Criando Vendedores
                case  2:
                    System.out.println("Nome: ");
                    nome = sc.next();
                    System.out.println("RG: ");
                    rg = sc.next();
                    sc.nextLine();
                    vends[cv] = new Vendendor(nome, rg, 2000);
                    cv++;
                    break;

                //Exibindo Administrativo e Vendedores
                case  3:
                    System.out.println("=-=-=-=-=ADMINISTRATIVO=-=-=-=-=");
                    for(int i = 0; i < ca; i++){
                        System.out.println(adms[i].mostraDados());
                    }
                    System.out.println("=-=-=-=-=VENDEDORES=-=-=-=-=");
                    for(int i = 0; i < cv; i++){
                        System.out.println(vends[i].mostraDados());
                    }
                    break;

                // Exibindo Folha Salarial do ADMINSTRATIVO E VENDEDORES
                case 4:
                    System.out.println("=-=-=-=-=FOLHA SALARIAL ADM=-=-=-=-=");
                    for(int i = 0; i < ca; i++){
                        float salario = adms[i].calcularSalario();
                        System.out.println(adms[i].getNome() + ": " + salario);
                    }
                    System.out.println("=-=-=-=-=FOLHA SALARIAL VEND=-=-=-=-=");
                    for(int i = 0; i < cv; i++){
                        float salario = vends[i].calcularSalario();
                        System.out.println(vends[i].getNome() + ": " + salario);
                    }
                    break;
                }
        }while (op != 5 );


    }
}


