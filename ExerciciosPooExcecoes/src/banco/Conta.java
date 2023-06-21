package banco;



import banco.excecao.ContaExcecao;

public class Conta {

    private static int ct = 0;
    private String tipo;
    private float saldo;
    private int num;
    private String usuario;
    private String senha;

    public int getNum(){
        return num;
    }

    public Conta(String t, String usrl, String sl, float s) throws ContaExcecao {
        tipo = t;
        usuario = usrl;
        senha = sl;
        if (s < 500) throw  new ContaExcecao("Saldo inicial invalido");
        else saldo = s;
        num = ct;
        ct++;
    }

    public float getSaldo() {
        return saldo;
    }

    String mostraSaldo(){
        return "Saldo da conta " + num + ", do tipo  ("+ tipo +") é R$" + getSaldo();
    }

    void sacar(float valor) throws ContaExcecao{
        if(valor > saldo) throw new ContaExcecao("Saldo Insuficiente");
        else saldo -= valor;
    }

    boolean depositar(float valor){
        saldo += valor;
        return true;
    }

    boolean ehNegativo(){
        return (saldo < 0);
    }

    void transferir(float valor, banco.Conta c) throws ContaExcecao{
        this.sacar(valor);
        c.depositar(valor);
        System.out.println("Transferência Concluída");
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String mostraDadosConta(){
        return "Número: " + num + " - Tipo: " + tipo + "";
    }
}
