package nave;

import java.util.*;

public class AmbienteEspacial {
    public static void main(String[] args) {

        List<Nave> nave = new ArrayList<>();
        nave.add(new Nave("Alpha", 200));
        nave.add(new Nave("Beta", 400));
        nave.add(new Nave("Charlie", 2500));
        nave.add(new Nave("Delta", 300));
        nave.add(new Nave("Eco", 100));

        for (Nave naves : nave) {
            System.out.println("Nave: " + naves.getNome() + " - Velocidade: " + naves.getVelocidade() + "Km/h");


        }



    }
}