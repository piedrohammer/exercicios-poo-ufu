package funcionarios;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o tipo de funcionário que deseja cadastrar na posição " + i + ":");
            System.out.println("1 - Funcionário Comissionado");
            System.out.println("2 - Funcionário Noturno");
            int opcao = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite a matrícula:");
            int matricula = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o nome:");
            String nome = sc.nextLine();

            System.out.println("Digite o CPF:");
            String cpf = sc.nextLine();

            System.out.println("Digite a idade:");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o salário base:");
            double salarioBase = sc.nextDouble();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o valor das comissões:");
                double valorComissoes = sc.nextDouble();
                sc.nextLine();

                funcionarios[i] = new FuncionarioComissionado(matricula, nome, cpf, idade, salarioBase, valorComissoes);
            } else if (opcao == 2) {
                System.out.println("Digite o número de noites trabalhadas:");
                int noitesTrabalhadas = sc.nextInt();
                sc.nextLine();

                funcionarios[i] = new FuncionarioNoturno(matricula, nome, cpf, idade, salarioBase, noitesTrabalhadas);
            }
        }

        while (true) {
            System.out.println("\nDigite a operação que deseja realizar:");
            System.out.println("1 - Pesquisar um funcionário");
            System.out.println("2 - Mostrar a quantidade de funcionários de cada categoria");
            System.out.println("3 - Mostrar o maior salário de cada categoria");
            System.out.println("4 - Montar a folha de pagamentos");
            System.out.println("0 - Sair");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o CPF ou a matrícula do funcionário que deseja pesquisar:");
                String chave = sc.nextLine();

                for (Funcionario f : funcionarios) {
                    if (f != null && (f.cpf.equals(chave) || f.matricula == Integer.parseInt(chave))) {
                        System.out.println("Funcionário encontrado:");
                        System.out.println("Matrícula: " + f.matricula);
                        System.out.println("Nome: " + f.nome);
                        System.out.println("CPF: " + f.cpf);
                        System.out.println("Idade: " + f.idade);
                        System.out.println("Salário: " + f.calcularSalario());
                        break;
                    }
                }
            }

            else if (opcao == 2) {

                int quantidadeComissionados = 0;
                int quantidadeNoturnos = 0;

                for (Funcionario f : funcionarios) {
                    if (f != null) {
                        if (f instanceof FuncionarioComissionado) {
                            quantidadeComissionados++;
                        } else if (f instanceof FuncionarioNoturno) {
                            quantidadeNoturnos++;
                        }
                    }
                }

                System.out.println("Quantidade de funcionários comissionados: " + quantidadeComissionados);
                System.out.println("Quantidade de funcionários noturnos: " + quantidadeNoturnos);

            }

            else if (opcao == 3) {

                double maiorSalarioComissionado = Double.MIN_VALUE;
                double maiorSalarioNoturno = Double.MIN_VALUE;
                for (Funcionario f : funcionarios) {
                    if (f != null) {
                        if (f instanceof FuncionarioComissionado) {
                            double salario = f.calcularSalario();
                            if (salario > maiorSalarioComissionado) {
                                maiorSalarioComissionado = salario;
                            }
                        } else if (f instanceof FuncionarioNoturno) {
                            double salario = f.calcularSalario();
                            if (salario > maiorSalarioNoturno) {
                                maiorSalarioNoturno = salario;
                            }
                        }
                    }
                }

                System.out.println("Maior salário de funcionários comissionados: " + maiorSalarioComissionado);
                System.out.println("Maior salário de funcionários noturnos: " + maiorSalarioNoturno);

            } else if (opcao == 4) {
                double totalFolha = 0;

                for (Funcionario f : funcionarios) {
                    if (f != null) {
                        double salario = f.calcularSalario();
                        totalFolha += salario;
                        System.out.println("Matrícula: " + f.matricula);
                        System.out.println("Nome: " + f.nome);
                        System.out.println("CPF: " + f.cpf);
                        System.out.println("Idade: " + f.idade);
                        System.out.println("Salário: " + salario);
                        System.out.println();
                    }
                }

                System.out.println("Total da folha de pagamentos: " + totalFolha);
            } else if (opcao == 0) {
                break;
            }
        }

        sc.close();
    }
}
