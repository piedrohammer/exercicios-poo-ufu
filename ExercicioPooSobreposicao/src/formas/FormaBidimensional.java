package formas;

public class FormaBidimensional extends Forma{

    private int x, y;


    public FormaBidimensional(String cor, int x, int y) {
        super(cor);
        this.x = x;
        this.y = y;
    }

    public String exibeDados(){
        return super.exibeDados() + ", coordenadas: ( " + x + "," + y + ")";
    }

    public double calcularArea(){
        return 0;
    }
}
