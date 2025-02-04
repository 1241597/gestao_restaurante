package model;

import java.util.List;

public class Pedido {
    private int mesaId;
    private List<Prato> pratos;

    public Pedido(int mesaId, List<Prato> pratos) {
        this.mesaId = mesaId;
        this.pratos = pratos;
    }

    public int getMesaId() {
        return mesaId;
    }

    public List<Prato> getPratos() {
        return pratos;
    }
}
