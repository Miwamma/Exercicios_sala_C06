public class Conta {

    private int numero;
    private float saldo;
    private float limite;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float sacar(float quantia){
        saldo = getSaldo()-quantia;
        return saldo;
    }

    public float depositar(float quantia){
        saldo += quantia;
        return saldo;
    }

}
