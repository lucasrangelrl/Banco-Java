import java.util.ArrayList;
import java.util.List;

public class Extrato {
    private List<String> transacoes;

    public Extrato() {
        this.transacoes = new ArrayList<>();
    }

    public void registrarTransacao(String transacao) {
        transacoes.add(transacao);
    }

    public void exibirExtrato() {
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
    }
}
