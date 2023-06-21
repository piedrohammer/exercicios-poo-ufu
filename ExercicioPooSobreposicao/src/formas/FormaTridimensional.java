package formas;

public class FormaTridimensional extends Forma{

    private int x, y, z;

    public FormaTridimensional(String cor, int x, int y, int z) {
        super(cor);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String exibeDados(){
        return super.exibeDados() + ", coordenadas: (" + x +", " + x +", " + x +")" ;

    }

    public double calcularVolume(){
        return 0;
    }
}
