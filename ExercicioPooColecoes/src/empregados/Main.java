package empregados;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void salvaDados(ArrayList<Empregado> v, String arquivo){
        BufferedWriter escritor = null;
        try {
            escritor = new BufferedWriter(new FileWriter(new File(arquivo)));
            for (Empregado e : v)
                escritor.write(e.getTextoArquivo() + "\n");
            escritor.flush();
            escritor.close();
        } catch (IOException e){
            e.getMessage();
        }
    }

    public static ArrayList<Empregado> carregaDados(String arq){
        String linha;
        BufferedReader arquivo = null;
        ArrayList<Empregado> v = new ArrayList<>();
        try {
            arquivo = new BufferedReader(new FileReader(new File(arq)));
            while ((linha = arquivo.readLine()) != null){
                v.add(new Empregado(linha));
            }
            return v;
        }catch (IOException e){
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }

    }

    public static void main(String[] args) {


        ArrayList<Empregado> v = carregaDados("arquivo.txt");
        if (v == null) v = new ArrayList<>();
        int op = 0;
        String cpf;
        int id;
        float sal;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("=-=-=-=-=-= MENU =-=-=-=-=-=");
            System.out.println("1 - Cadastrar Empregado");
            System.out.println("2 - Mostrar Empregado");
            System.out.println("3 - Buscar por CPF");
            System.out.println("4 - Buscar salários maiores");
            System.out.println("5 - Ordenar por idade");
            System.out.println("6 - Sair.");
            System.out.println("OPÇÃO: ");

            op = sc.nextInt();

            switch (op){

                case 1:
                    System.out.println("CPF: ");
                    cpf = sc.next();
                    System.out.println("Idade: ");
                    id = sc.nextInt();
                    System.out.println("Salário: ");
                    sal = sc.nextFloat();
                    v.add(new Empregado(cpf, id, sal));
                    break;

                case 2:
                    System.out.println("Empregados: ");
                    for (Empregado e : v)
                        System.out.println("- " + e);
                    break;

                case 3:
                    System.out.println("CPF: ");
                    cpf = sc.next();
                    Empregado e = buscaCPF(cpf, v);
                    if (e != null)
                        System.out.println("- " + e);
                    else
                        System.out.println("CPF NÃO ENCONTRADO");
                    break;

                case 4:
                    System.out.println("Salário: ");
                    sal = sc.nextFloat();
                    for (Empregado em : v)
                        if (em.getSalario() > sal)
                            System.out.println("- " + em);
                    break;

                case 5:
                    Collections.sort(v);
                    System.out.println("Coleção ordenada por idade!");
                    break;

                case 6:
                    salvaDados(v, "arquivo.txt");
                    System.out.println("Dados Salvos!");
            }
        }while (op != 7);
    }

    private static Empregado buscaCPF(String cpf, ArrayList<Empregado> v) {
        for (Empregado e : v)
            if (e.getCpf().equals(cpf))
                return e;
            return null;
        }
    }
