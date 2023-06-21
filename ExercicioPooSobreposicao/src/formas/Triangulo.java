package formas;

public class Triangulo extends FormaBidimensional{

    private  int base, altura;


    public Triangulo(String cor, int x, int y, int b, int a) {
        super(cor, x, y);
        this.base = b;
        this.altura = a;
    }

    public String exibeDados(){
        return super.exibeDados() + ", base:" + base + ", altura: " + altura;
    }

    public double calcularArea(){
        return base * altura;
    }
}
