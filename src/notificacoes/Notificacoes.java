package notificacoes;

import java.util.LinkedList;
import java.util.Queue;

public class Notificacoes {
    private final Queue<String> notificacoes;

    public Notificacoes() {
        this.notificacoes = new LinkedList<>();
    }

    public void adicionarNotificacao(String mensagem) {
        notificacoes.add(mensagem);
    }

    public void mostrarNotificacoes() {
        System.out.println("=== Notificações ===");
        while (!notificacoes.isEmpty()) {
            System.out.println(notificacoes.poll());
        }
    }
}
