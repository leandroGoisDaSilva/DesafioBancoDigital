public class SaldoInsuficienteException extends Exception {

    private double saldoDisponivel;
    private double valorTentado;

    public SaldoInsuficienteException(double saldoDisponivel, double valorTentado) {
        super("Saldo insuficiente. Tentou sacar: R$" + valorTentado + ", mas o saldo disponível foi: R$" + saldoDisponivel);
        this.saldoDisponivel = saldoDisponivel;
        this.valorTentado = valorTentado;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public double getValorTentado() {
        return valorTentado;
    }
}
