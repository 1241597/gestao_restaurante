package TF_lp1;

public class Mesa {
    private int id;
    private int capacidade;
    private boolean disponivel;

    public Mesa(int id, int capacidade) {
        this.id = id;
        this.capacidade = capacidade;
        this.disponivel = true;
    }

    public int getId() {
        return id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void ocupar(Cliente cliente) {
        this.disponivel = false;
    }

    public void liberar() {
        this.disponivel = true;
    }
}
