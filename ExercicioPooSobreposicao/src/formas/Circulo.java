package formas;

public class Circulo  extends FormaBidimensional{

    private int raio;

    public Circulo(String cor, int x, int y, int r) {
        super(cor, x, y);
        this.raio = r;
    }

    public String exibeDados(){
        return super.exibeDados() + ", raio:" + raio;
    }

    public double calcularArea(){
        return Math.PI * raio * raio;
    }
}
