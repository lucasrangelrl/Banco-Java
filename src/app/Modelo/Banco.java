package app.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.nome = "Banco Digital";
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println("Titular: " + conta.getTitular().getNome() + " | Saldo: " + conta.getSaldo());
        }
    }
}
