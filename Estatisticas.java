package TF_lp1;

public class Estatisticas {
    private int clientesAtendidos;
    private int clientesNaoAtendidos;

    public void incrementarClientesAtendidos() {
        clientesAtendidos++;
    }

    public void incrementarClientesNaoAtendidos() {
        clientesNaoAtendidos++;
    }

    public void gerarRelatorio() {
        System.out.println("Relatório do dia:");
        System.out.println("Clientes atendidos: " + clientesAtendidos);
        System.out.println("Clientes não atendidos: " + clientesNaoAtendidos);
    }
}

