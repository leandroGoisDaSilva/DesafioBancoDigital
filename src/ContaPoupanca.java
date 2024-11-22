public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente, boolean especial) {
        super(cliente, especial);
    }
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
