package relogio;

public class Relogio {
    public static void main(String[] args) {
        Tempo t1 = new Tempo(2, 54, 6);

        System.out.println("Tempo 1: " + t1);
        System.out.println("Tempo 1 em segundos: "+t1.tempoEmSegundos());

        Tempo t2 = new Tempo(5, 40, 47);
        System.out.println("Tempo 2: "+ t2);
        System.out.println("Tempo 2 em segundos: "+ t2.tempoEmSegundos());
        System.out.println("Diferença de tempos em segundos: " + t1.difTempo(t2));

        if(t2.setHora(7)){
            System.out.println("Nova hora = 7");
        }else System.out.println("ERRO, hora inválida");

        if(t2.setMin(74)){
            System.out.println("Novo minuto = 74");
        }else System.out.println("ERRO, minuto inválido");

        if (t2.setSeg(60)){
            System.out.println("Novo segundo = 60");
        }else System.out.println("ERRO, segundo inválido");

        System.out.println("Novo tempo 2: " + t2);
    }
}

