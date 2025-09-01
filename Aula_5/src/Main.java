public class Main{
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.depositar(300);
        conta1.sacar(150);

        System.out.println(conta1.getSaldo());
        System.out.println(conta1.getNumero());
        System.out.println(conta1.getLimite());
        
    }
}