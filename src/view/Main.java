package view;

import controller.RestauranteController;
import model.Prato;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RestauranteController controller = new RestauranteController();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema de Gestão de Restaurante ---");
            System.out.println("1. Adicionar Mesa");
            System.out.println("2. Listar Mesas");
            System.out.println("3. Remover Mesa");
            System.out.println("4. Adicionar Prato ao Menu");
            System.out.println("5. Listar Pratos");
            System.out.println("6. Remover Prato do Menu");
            System.out.println("7. Sair");
            System.out.println("8. Gerir Configurações");
            System.out.println("9. Visualizar Logs");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1: // Adicionar mesa
                    System.out.print("Digite a capacidade da mesa: ");
                    int capacidade = scanner.nextInt();
                    controller.adicionarMesa(capacidade);
                    System.out.println("Mesa adicionada com sucesso!");
                    break;

                case 2: // Listar mesas
                    if (controller.existemMesasDisponiveis()) {
                        controller.listarMesas();
                    } else {
                        System.out.println("Nenhuma mesa disponível no momento.");
                    }
                    break;

                case 3: // Remover mesa
                    System.out.print("Digite o ID da mesa para remover: ");
                    int id = scanner.nextInt();
                    controller.removerMesa(id);
                    System.out.println("Mesa removida com sucesso!");
                    break;

                case 4: // Adicionar prato
                    System.out.print("Digite o nome do prato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a categoria (Entrada/Prato Principal/Sobremesa): ");
                    String categoria = scanner.nextLine();
                    System.out.print("Digite o preço de custo: ");
                    double precoCusto = scanner.nextDouble();
                    System.out.print("Digite o preço de venda: ");
                    double precoVenda = scanner.nextDouble();
                    System.out.print("Digite o tempo de preparação (em minutos): ");
                    int tempoPrep = scanner.nextInt();
                    System.out.print("Digite o tempo de consumo (em minutos): ");
                    int tempoCons = scanner.nextInt();
                    controller.adicionarPrato(nome, categoria, precoCusto, precoVenda, tempoPrep, tempoCons);
                    System.out.println("Prato adicionado com sucesso!");
                    break;

                case 5: // Listar pratos
                    if (controller.existemPratosNoMenu()) {
                        controller.listarPratos();
                    } else {
                        System.out.println("O menu está vazio. Adicione pratos antes de listar.");
                    }
                    break;

                case 6: // Remover prato
                    if (controller.existemPratosNoMenu()) {
                        System.out.print("Digite o nome do prato para remover: ");
                        String pratoNome = scanner.nextLine();
                        controller.removerPrato(pratoNome);
                        System.out.println("Prato removido com sucesso!");
                    } else {
                        System.out.println("Não há pratos no menu para remover.");
                    }
                    break;

                case 7: // Sair
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;


                    

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);

        scanner.close();
    }
}
