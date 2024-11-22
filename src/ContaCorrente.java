public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente, boolean especial) {
        super(cliente, especial);
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
