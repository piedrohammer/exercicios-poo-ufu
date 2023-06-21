package formas;

public class Quadrado extends FormaBidimensional{

    private int lado;

    public Quadrado(String cor, int x, int y, int l) {
        super(cor, x, y);
        this.lado = l;
    }

    public String exibeDados(){
        return super.exibeDados() + ", lado: " + lado;
    }

    public double calcularArea(){
        return lado * lado;
    }
}
