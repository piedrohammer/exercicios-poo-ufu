package maquina;

public class MaquinaMain {
    public static void main(String[] args) {

        MaquinaPassagens obj = new MaquinaPassagens(2.00);

        System.out.println("O preço da passagem é: R$" + obj.getPreco());

        obj.inserirDinheiro(1.00);

        System.out.println("Quantidade Inserida: R$" + obj.getQuantidadeInserida());

        if(obj.getQuantidadeInserida() >= 1.00){
            obj.exbirPasagem();
        }


        obj.inserirDinheiro(1.0);


        System.out.println("Nova quantia: R$" + obj.getQuantidadeInserida());

        obj.exbirPasagem();

    }
}
