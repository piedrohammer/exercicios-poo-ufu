package banco;

import banco.excecao.ClienteExcecao;
import banco.excecao.ContaExcecao;
import banco.excecao.MainExcecao;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[10];
        int contClientes = 0;
        Cliente sessao = null;



            int op = 0;
            while (op != 10) {
                System.out.println("=-=-=-= MENU =-=-=-=");
                System.out.println("1 - Cadastrar");
                System.out.println("2 - Saldo");
                System.out.println("3 - Sacar");
                System.out.println("4 - Depositar");
                System.out.println("5 - Transferir");
                System.out.println("6 - Relatório");
                System.out.println("7 - Clientes Negativados");
                System.out.println("8 - Clientes com idade de intervalos");
                System.out.println("9 - Encerrar Sessão");
                System.out.println("10 - Sair");
                op = sc.nextInt();
                sc.nextLine();
                String tipo;
                float saldo;
                String nome, cpf, telefone;
                int idade;


                switch (op) {
                    case 1:
                        try {
                            System.out.println("Tipo da Conta: ");
                            tipo = sc.nextLine();
                            System.out.println("Saldo inicial: ");
                            saldo = sc.nextFloat();
                            sc.nextLine();
                            System.out.println("Nome: ");
                            nome = sc.nextLine();
                            System.out.println("CPF: ");
                            cpf = sc.nextLine();
                            System.out.println("Telefone: ");
                            telefone = sc.nextLine();
                            System.out.println("Idade: ");
                            idade = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Usuário: ");
                            String usr = sc.nextLine();
                            System.out.println("Senha: ");
                            String sen = sc.nextLine();
                            Conta c1 = new Conta(tipo, usr, sen, saldo);
                            Cliente cli1 = new Cliente(nome, cpf, telefone, idade, c1);
                            clientes[contClientes] = cli1;
                            contClientes++;
                        } catch (ClienteExcecao e) {
                            System.out.println("Cliente: " + e.getMessage());
                        } catch (ContaExcecao e) {
                            System.out.println("Conta: " + e.getMessage());
                        } catch (Exception e) {
                            System.out.println("Geral: " + e.getMessage());
                        }
                        break;

                    case 2:
                        try {
                            if (sessao == null) logar(sc);
                            System.out.println(sessao.getConta().mostraSaldo());
                        } catch (MainExcecao e) {
                            System.out.println("Geral: " + e.getMessage());
                        }
                        break;

                    case 3:
                        try {
                            if (sessao == null) logar(sc);
                            System.out.println("Valor: ");
                            Float valor = sc.nextFloat();
                            sessao.getConta().sacar(valor);
                            System.out.println("Saque realizado com sucesso");
                        } catch (ContaExcecao e) {
                            System.out.println("Geral: " + e.getMessage());
                        } catch (MainExcecao e) {
                            System.out.println("Geral: " + e.getMessage());
                        }
                        break;

                    case 4:
                        try {
                            if (sessao == null) logar(sc);
                            System.out.println("Valor: ");
                            Float valor = sc.nextFloat();
                            sessao.getConta().depositar(valor);
                            System.out.println("Deposito realizado com sucesso");
                        } catch (MainExcecao e) {
                            System.out.println("Geral: " + e.getMessage());
                        }
                        break;

                    case 5:
                        try {
                            if (sessao == null) logar(sc);
                            System.out.println("Número da conta: ");
                            int n = sc.nextInt();
                            System.out.println("Valor: ");
                            Float valor = sc.nextFloat();
                            Conta temp = buscarConta(n);
                            if (temp != null)
                                sessao.getConta().transferir(valor, temp);
                            else
                                System.out.println("Conta destino inexistênte");
                        } catch (ContaExcecao e) {
                            System.out.println("Conta: " + e.getMessage());
                        } catch (MainExcecao e) {
                            System.out.println("Geral: " + e.getMessage());
                        }
                        break;

                    case 6:
                        for (int i = 0; i < contClientes; i++) {
                            System.out.println(clientes[i].mostraDados());
                        }
                        break;

                    case 7:
                        System.out.println("=-=-=-= CLIENTES NEGATIVADOS =-=-=-=");
                        for (int i = 0; i < contClientes; i++) {
                            System.out.println(clientes[i].getConta().mostraDadosConta());
                        }
                        break;

                    case 8:
                        System.out.println("Idade inicial: ");
                        int idi = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Idade final: ");
                        int idf = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Clientes com idade entre " + idi + " e " + idf + " anos:");
                        for (int i = 0; i < contClientes; i++) {
                            System.out.println(clientes[i].mostraDados());
                        }
                        break;

                    case 9:
                        sessao = null;
                }
            }
        }

    Scanner sc = new Scanner(System.in);
    static Cliente[] clientes = new Cliente[10];
    static int contClientes = 0;
    static Cliente sessao;


    private static void logar(Scanner sc) throws MainExcecao {
        System.out.println("Usuário: ");
        String usr = sc.nextLine();
        System.out.println("Senha: ");
        String sen = sc.nextLine();
        int i;
        for (i = 0; i < contClientes; i++)
            if ((clientes[i].getConta().getUsuario().equals(usr)) && (clientes[i].getConta().getSenha().equals(sen)))
                ;
        sessao = clientes[i];
        if (sessao == null) throw new MainExcecao("Cliente não encontrado");
    }

    private static Conta buscarConta ( int num) throws MainExcecao {
        for (int i = 0; i < contClientes; i++)
            if (clientes[i].getConta().getNum() == num)
                return clientes[i].getConta();
        throw new MainExcecao("Conta não Encontrada");
    }
}




