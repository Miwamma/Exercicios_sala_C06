public class Conta {

    private int numero;
    private float saldo;
    private float limite;

    public Conta() {
        this.saldo = 2000;
        this.numero = 1;
        this.limite = 5000;
    }


    public float getSaldo() {
        return saldo;
    }

    public float getNumero(){
        return numero;
    }

    public float getLimite(){
        return limite;
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
