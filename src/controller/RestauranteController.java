package controller;

import model.Mesa;
import model.Prato;
import model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class RestauranteController {
    private List<Mesa> mesas = new ArrayList<>();
    private List<Prato> menu = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    // Mesas
    public void adicionarMesa(int capacidade) {
        int id = mesas.size() + 1;
        mesas.add(new Mesa(id, capacidade));
    }

    public void listarMesas() {
        for (Mesa mesa : mesas) {
            System.out.println("ID: " + mesa.getId() + ", Capacidade: " + mesa.getCapacidade() + ", Ocupada: " + (mesa.isOcupada() ? "Sim" : "Não"));
        }
    }

    public void removerMesa(int id) {
        mesas.removeIf(mesa -> mesa.getId() == id);
    }

    public boolean existemMesasDisponiveis() {
        for (Mesa mesa : mesas) {
            if (!mesa.isOcupada()) {
                return true;
            }
        }
        return false;
    }

    // Pratos
    public void adicionarPrato(String nome, String categoria, double precoCusto, double precoVenda, int tempoPreparacao, int tempoConsumo) {
        menu.add(new Prato(nome, categoria, precoCusto, precoVenda, tempoPreparacao, tempoConsumo));
    }

    public void listarPratos() {
        for (Prato prato : menu) {
            System.out.println("Nome: " + prato.getNome() + ", Categoria: " + prato.getCategoria() + ", Disponível: " + (prato.isDisponivel() ? "Sim" : "Não"));
        }
    }

    public void removerPrato(String nome) {
        menu.removeIf(prato -> prato.getNome().equalsIgnoreCase(nome));
    }

    public boolean existemPratosNoMenu() {
        return !menu.isEmpty();
    }

    // Pedidos
    public void registrarPedido(int mesaId, List<Prato> pratos) {
        pedidos.add(new Pedido(mesaId, pratos));
    }

    public void listarPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println("Mesa ID: " + pedido.getMesaId() + ", Total de Pratos: " + pedido.getPratos().size());
        }
    }

    public void removerPedido(int mesaId) {
        pedidos.removeIf(pedido -> pedido.getMesaId() == mesaId);
    }
}
