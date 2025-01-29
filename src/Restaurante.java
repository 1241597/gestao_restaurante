package TF_lp1;

import java.util.*;

public class Restaurante {
    private List<Mesa> mesas;
    private List<Cliente> clientes;
    private Estatisticas estatisticas;
    private int tempoAtual;

    public Restaurante() {
        this.mesas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.estatisticas = new Estatisticas();
        this.tempoAtual = 0;
        carregarMesas();
        carregarClientes();
    }

    private void carregarMesas() {
        // Exemplo: Carregar mesas disponíveis (substituir por leitura de arquivo, se necessário)
        mesas.add(new Mesa(1, 4));
        mesas.add(new Mesa(2, 2));
    }

    private void carregarClientes() {
        // Exemplo: Carregar clientes de um arquivo ou adicionar manualmente
        clientes.add(new Cliente("Reserva A", 3, 1, 1, 5, 10, 0));
        clientes.add(new Cliente("Reserva B", 2, 1, 0, 4, 8, 2));
    }

    public void iniciarDia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simulação do dia iniciada.");

        while (tempoAtual < 24) { // Exemplo: Limite de 24 unidades de tempo
            System.out.println("Unidade de tempo atual: " + tempoAtual);

            // Processar chegada de clientes
            processarClientes();

            System.out.println("Avançar tempo? (s/n)");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("s")) {
                tempoAtual++;
            } else {
                break;
            }
        }

        estatisticas.gerarRelatorio();
        System.out.println("Simulação concluída.");
    }

    private void processarClientes() {
        for (Cliente cliente : clientes) {
            if (cliente.getTempoChegada() == tempoAtual) {
                System.out.println("Cliente " + cliente.getNome() + " chegou.");
                alocarMesa(cliente);
            }
        }
    }

    private void alocarMesa(Cliente cliente) {
        for (Mesa mesa : mesas) {
            if (mesa.isDisponivel() && mesa.getCapacidade() >= cliente.getNumeroPessoas()) {
                mesa.ocupar(cliente);
                System.out.println("Cliente " + cliente.getNome() + " alocado à mesa " + mesa.getId() + ".");
                return;
            }
        }

        System.out.println("Não há mesas disponíveis para o cliente " + cliente.getNome() + ".");
        estatisticas.incrementarClientesNaoAtendidos();
    }
}
