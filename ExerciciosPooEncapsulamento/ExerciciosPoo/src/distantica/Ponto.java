package distantica;

class Ponto {
    private double x;
    private double y;

    Ponto(double x, double y) { // Construtor pra poder visualizar melhor os pontos
        this.x = x;
        this.y = y;
    }

    private double obterX() {
        return x;
    }

    public double calcularDist(Ponto p) {
        // Utilizei a biblioteca do java Math que já faz algumas operações matematicas
        return (Math.sqrt(Math.pow(p.x - x, 2.0) + Math.pow(p.y - y, 2.0)));
    }

    public static void criarPontos() {
        Ponto ptoA = new Ponto(2, -6);
        Ponto ptoB = new Ponto(5, -2);
        System.out.println("Distancia entre os pontos x e y é: "  + ptoA.calcularDist(ptoB));
    }
    
    /*Poderia ter criado outra classe para deixa mais limpo o códio porém
     optei por fazer tudo em uma classe
     pois são 3 exercicios e assim fica mais facil de vizualizar*/
    public static void main(String[] args) {
        criarPontos();
    }
}
