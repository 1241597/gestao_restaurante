package model;

public class Prato {
    private String nome;
    private String categoria;
    private double precoCusto;
    private double precoVenda;
    private int tempoPreparacao;
    private int tempoConsumo;
    private boolean disponivel;

    public Prato(String nome, String categoria, double precoCusto, double precoVenda, int tempoPreparacao, int tempoConsumo) {
        this.nome = nome;
        this.categoria = categoria;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.tempoPreparacao = tempoPreparacao;
        this.tempoConsumo = tempoConsumo;
        this.disponivel = true;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public int getTempoPreparacao() {
        return tempoPreparacao;
    }

    public int getTempoConsumo() {
        return tempoConsumo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
