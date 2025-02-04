package menu;

import config.Configuracoes;
import notificacoes.Notificacoes;

import java.util.Scanner;

public class MenuPrincipal {
    private final Configuracoes configuracoes;
    private final Notificacoes notificacoes;

    public MenuPrincipal() {
        this.configuracoes = new Configuracoes();
        this.notificacoes = new Notificacoes();
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Gerir mesas");
            System.out.println("2. Gerir menus");
            System.out.println("3. Simular dia-a-dia");
            System.out.println("4. Consultar estatísticas");
            System.out.println("5. Configurações");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Opção Gerir Mesas ainda não implementada.");
                case 2 -> System.out.println("Opção Gerir Menus ainda não implementada.");
                case 3 -> System.out.println("Opção Simular Dia-a-Dia ainda não implementada.");
                case 4 -> System.out.println("Opção Consultar Estatísticas ainda não implementada.");
                case 5 -> configurar();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void configurar() {
        System.out.println("=== Configurações ===");
        System.out.println("Caminho dos ficheiros: " + configuracoes.getCaminhoFicheiros());
        System.out.println("Separador: " + configuracoes.getSeparador());
        System.out.println("Unidades de tempo por dia: " + configuracoes.getUnidadesTempoDia());
        System.out.println("Tempo de espera por cliente: " + configuracoes.getTempoEsperaCliente());
        System.out.println("Custo por cliente não atendido: " + configuracoes.getCustoClienteNaoAtendido());
        System.out.println("Password: " + configuracoes.getPassword());
    }
}
