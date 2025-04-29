package app;

import app.Modelo.*;

public class Main {





    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente clienteLucas = new Cliente("Lucas", "12345678900", "joao@email.com", "senha123");
        ContaCorrente contaLucas = new ContaCorrente(clienteLucas, 600.0);
        banco.adicionarConta(contaLucas);

        Cliente clienteRaiane = new Cliente("Raiane", "10998723466", "maria@email.com", "senha456");
        ContaPoupanca contaRaiane = new ContaPoupanca(clienteRaiane);
        banco.adicionarConta(contaRaiane);

        Cliente clienteBeatriz = new Cliente("Beatriz", "17978900809", "pedro@email.com", "senha789");
        ContaCorrente contaBeatriz = new ContaCorrente(clienteBeatriz, 1000.0);
        banco.adicionarConta(contaBeatriz);

        contaRaiane.depositar(300);
        contaLucas.depositar(2000);
        contaBeatriz.transferir(200, contaRaiane);
        contaLucas.transferir(1000, contaBeatriz);

        System.out.println("Saldo Lucas: " + contaLucas.getSaldo());
        System.out.println("Saldo Maria: " + contaRaiane.getSaldo());
        System.out.println("Saldo Pedro: " + contaBeatriz.getSaldo());

        banco.listarContas();
    }
}
