package config;

import java.io.*;
import java.util.Properties;

public class Configuracoes {
    private String caminhoFicheiros;
    private String separador;
    private int unidadesTempoDia;
    private int tempoEsperaCliente;
    private double custoClienteNaoAtendido;
    private String password;

    public Configuracoes() {
        carregarConfiguracoes();
    }

    public void carregarConfiguracoes() {
        String nomeArquivo = "config.txt"; // Nome do arquivo de configurações
        File arquivoConfig = new File(nomeArquivo);

        if (!arquivoConfig.exists()) {
            System.err.println("Erro: O arquivo de configurações '" + nomeArquivo + "' não foi encontrado.");
            System.err.println("Certifique-se de que o arquivo está na mesma pasta do programa ou forneça o caminho correto.");
            return;
        }

        try (InputStream input = new FileInputStream(arquivoConfig)) {
            Properties prop = new Properties();
            prop.load(input);

            // Carregar as configurações do arquivo
            caminhoFicheiros = prop.getProperty("caminhoFicheiros", "data/");
            separador = prop.getProperty("separador", ",");
            unidadesTempoDia = Integer.parseInt(prop.getProperty("unidadesTempoDia", "24"));
            tempoEsperaCliente = Integer.parseInt(prop.getProperty("tempoEsperaCliente", "5"));
            custoClienteNaoAtendido = Double.parseDouble(prop.getProperty("custoClienteNaoAtendido", "10.0"));
            password = prop.getProperty("password", "admin");

            System.out.println("Configurações carregadas com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao carregar o arquivo de configurações: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro: Alguma configuração numérica no arquivo está em formato inválido.");
            System.err.println("Por favor, revise o conteúdo do arquivo '" + nomeArquivo + "'.");
        }
    }


    public void salvarConfiguracoes() {
        try (OutputStream output = new FileOutputStream("config.txt")) {
            Properties prop = new Properties();

            prop.setProperty("caminhoFicheiros", caminhoFicheiros);
            prop.setProperty("separador", separador);
            prop.setProperty("unidadesTempoDia", String.valueOf(unidadesTempoDia));
            prop.setProperty("tempoEsperaCliente", String.valueOf(tempoEsperaCliente));
            prop.setProperty("custoClienteNaoAtendido", String.valueOf(custoClienteNaoAtendido));
            prop.setProperty("password", password);

            prop.store(output, null);
        } catch (IOException e) {
            System.err.println("Erro ao salvar configurações: " + e.getMessage());
        }
    }

    // Getters e setters...

    public String getCaminhoFicheiros() {
        return caminhoFicheiros;
    }

    public void setCaminhoFicheiros(String caminhoFicheiros) {
        this.caminhoFicheiros = caminhoFicheiros;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
