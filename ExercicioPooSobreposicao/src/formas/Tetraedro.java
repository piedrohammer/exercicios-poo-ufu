package formas;

public class Tetraedro extends FormaTridimensional{

    private int base, alturaBase, altura;

    public Tetraedro(String cor, int x, int y, int z, int b, int ab, int a) {
        super(cor, x, y, z);
        this.base = b;
        this.alturaBase = ab;
        this.altura = a;
    }

    public String exibeDados(){
        return super.exibeDados() + ", base: " + base + ", altura: " + altura + ", altura da base: " + alturaBase ;
    }

    public double calcularVolume(){
        return (1/3) * (base * alturaBase) * altura;
    }
}
