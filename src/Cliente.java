public class Cliente {
    private String nome;
    private Conta[] contas;  // Array para armazenar a conta corrente e a poupança

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new Conta[2];  // Cada cliente terá 2 contas: 1 conta corrente e 1 conta poupança
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para adicionar uma conta (corrente ou poupança)
    public void adicionarConta(Conta conta) {
        if (contas[0] == null) {
            contas[0] = conta;  // A primeira conta é a conta corrente
        } else {
            contas[1] = conta;  // A segunda conta é a conta poupança
        }
    }

    // Método para listar as contas do cliente
    public void listarContas() {
        System.out.println("Contas do cliente " + nome + ":");
        for (Conta conta : contas) {
            if (conta != null) {
                conta.imprimirExtrato();  // Exibe o extrato da conta
            }
        }
    }
}
