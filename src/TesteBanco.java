public class TesteBanco {
    public static void main(String[] args) {

        // Criando dois clientes
        Cliente cliente1 = new Cliente("Leandro");
        Cliente cliente2 = new Cliente("Ana");

        // Criando as contas para cada cliente
        Conta cc1 = new ContaCorrente(cliente1, true);
        Conta pp1 = new ContaPoupanca(cliente1, true);

        Conta cc2 = new ContaCorrente(cliente2, false);
        Conta pp2 = new ContaPoupanca(cliente2, false);

        // Adicionando as contas aos clientes
        cliente1.adicionarConta(cc1);
        cliente1.adicionarConta(pp1);

        cliente2.adicionarConta(cc2);
        cliente2.adicionarConta(pp2);

        // Exibindo informações de contas dos clientes
        cliente1.listarContas();
        cliente2.listarContas();

        // Testando a funcionalidade de saque, depósito e transferência
        System.out.println("\nTestando operações do Leandro:");
        cc1.depositar(500);
        try {
            cc1.transferir(pp1, 100);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro na transferência: " + e.getMessage());
        }
        cc1.imprimirExtrato();
        pp1.imprimirExtrato();

        // Testando o saque com erro
        try {
            cc1.sacar(600);  // Tentativa de saque maior que o saldo
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTestando operações da Ana:");
        cc2.depositar(300);
        try {
            cc2.transferir(pp2, 50);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        cc2.imprimirExtrato();
        pp2.imprimirExtrato();

        // Testando o saque com saldo suficiente
        try {
            cc2.sacar(150);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
