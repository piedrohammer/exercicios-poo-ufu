package formas;

public class Forma {

    private static int ct = 0;
    private int id;
    private String cor;

    public Forma(String cor) {
        id = ct;
        ct++;
        this.cor = cor;
    }

    public String exibeDados(){
        return "ID: " + id + ", Cor: " + cor;
    }
}
