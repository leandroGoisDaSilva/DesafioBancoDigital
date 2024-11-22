public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected boolean especial; // Atributo para verificar se o cliente tem cheque especial

    public Conta(Cliente cliente, boolean especial) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.especial = especial; // Definindo se a conta tem cheque especial
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        double limite = (especial) ? 500 : 0;
        double saldoDisponivel = saldo + limite;

        if (valor <= saldoDisponivel) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                double valorUsadoChequeEspecial = valor - saldo;
                saldo = 0;
                System.out.println("Valor retirado do cheque especial: R$" + valorUsadoChequeEspecial);
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            }
        } else {
            throw new SaldoInsuficienteException(saldoDisponivel, valor);
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        try {
            this.sacar(valor); // Realiza o saque na conta de origem
            destino.depositar(valor); // Deposita na conta de destino
            System.out.println("Transferência de R$" + valor + " para a conta " + destino.numero + " realizada com sucesso.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Transferência falhou: " + e.getMessage());
            throw e; // Repassa a exceção, se necessário
        }
    }


    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));

    }
}
