package app.Modelo;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente titular, double saldoInicial) {
        super(titular);
        this.saldo = saldoInicial;
    }
}
