package formas;

public class Cubo extends FormaTridimensional{

    private int lado;


    public Cubo(String cor, int x, int y, int z, int l) {
        super(cor, x, y, z);
        this.lado = l;
    }

    public String exibeDados(){
        return super.exibeDados() + ", lado: " + lado;
    }

    public double calcularVolume(){
        return lado * lado * lado;
    }
}
