public interface IConta {

    void sacar(double valor) throws SaldoInsuficienteException;

    void depositar(double valor);

    void transferir(Conta contaDestino, double valor) throws SaldoInsuficienteException;

    void imprimirExtrato();


}
