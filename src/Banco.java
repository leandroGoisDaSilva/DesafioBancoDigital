public class Banco {
    private String nome;
    private Cliente[] clientes;  // Agora o Banco possui um array de Clientes
    private int contadorClientes = 0;  // Controla a quantidade de clientes no banco

    public Banco(String nome, int capacidadeMaxima) {
        this.nome = nome;
        this.clientes = new Cliente[capacidadeMaxima];  // Cria um array para armazenar os clientes
    }

    // Método para adicionar clientes
    public void adicionarCliente(Cliente cliente) {
        if (contadorClientes < clientes.length) {
            clientes[contadorClientes] = cliente;
            contadorClientes++;
        } else {
            System.out.println("Não há mais espaço para adicionar clientes.");
        }
    }

    // Método para listar os clientes
    public void listarClientes() {
        for (int i = 0; i < contadorClientes; i++) {
            System.out.println("Cliente " + (i + 1) + ": " + clientes[i].getNome());
            clientes[i].listarContas();  // Lista as contas do cliente
        }
    }
}
