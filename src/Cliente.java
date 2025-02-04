package TF_lp1;

public class Cliente {
    private String nome;
    private int numeroPessoas;
    private int entradas;
    private int sobremesas;
    private int tempoEsperaMesa;
    private int tempoEsperaAtendimento;
    private int tempoChegada;

    public Cliente(String nome, int numeroPessoas, int entradas, int sobremesas, int tempoEsperaMesa, int tempoEsperaAtendimento, int tempoChegada) {
        this.nome = nome;
        this.numeroPessoas = numeroPessoas;
        this.entradas = entradas;
        this.sobremesas = sobremesas;
        this.tempoEsperaMesa = tempoEsperaMesa;
        this.tempoEsperaAtendimento = tempoEsperaAtendimento;
        this.tempoChegada = tempoChegada;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public int getTempoChegada() {
        return tempoChegada;
    }
}
