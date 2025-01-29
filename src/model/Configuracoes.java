package model;

public class Configuracoes {
    private String caminhoArquivos;
    private String separador;
    private int unidadesTempoDia;
    private int tempoEsperaCliente;
    private double custoClienteNaoAtendido;
    private String senhaConfiguracoes;

    public Configuracoes() {
        // Valores padrão
        this.caminhoArquivos = "dados/";
        this.separador = ";";
        this.unidadesTempoDia = 24;
        this.tempoEsperaCliente = 5;
        this.custoClienteNaoAtendido = 10.0;
        this.senhaConfiguracoes = "admin";
    }

    // Getters e Setters
    public String getCaminhoArquivos() {
        return caminhoArquivos;
    }

    public void setCaminhoArquivos(String caminhoArquivos) {
        this.caminhoArquivos = caminhoArquivos;
    }

    public String getSeparador() {
        return separador;
    }

    public void setSeparador(String separador) {
        this.separador = separador;
    }

    public int getUnidadesTempoDia() {
        return unidadesTempoDia;
    }

    public void setUnidadesTempoDia(int unidadesTempoDia) {
        this.unidadesTempoDia = unidadesTempoDia;
    }

    public int getTempoEsperaCliente() {
        return tempoEsperaCliente;
    }

    public void setTempoEsperaCliente(int tempoEsperaCliente) {
        this.tempoEsperaCliente = tempoEsperaCliente;
    }

    public double getCustoClienteNaoAtendido() {
        return custoClienteNaoAtendido;
    }

    public void setCustoClienteNaoAtendido(double custoClienteNaoAtendido) {
        this.custoClienteNaoAtendido = custoClienteNaoAtendido;
    }

    public String getSenhaConfiguracoes() {
        return senhaConfiguracoes;
    }

    public void setSenhaConfiguracoes(String senhaConfiguracoes) {
        this.senhaConfiguracoes = senhaConfiguracoes;
    }
}
