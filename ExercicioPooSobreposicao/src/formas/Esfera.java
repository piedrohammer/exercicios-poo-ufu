package formas;

public class Esfera extends FormaTridimensional{

    private int raio;

    public Esfera(String cor, int x, int y, int z, int r) {
        super(cor, x, y, z);
        this.raio = r;
    }

    public String exibeDados(){
        return super.exibeDados() + ", raio:" + raio;
    }

    public double calcularVolume(){
        return Math.PI * raio * raio * raio;
    }
}
