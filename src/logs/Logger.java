package logs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private final String caminhoLog;

    public Logger(String caminhoLog) {
        this.caminhoLog = caminhoLog;
    }

    public void registrar(String mensagem) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoLog, true))) {
            writer.write(mensagem);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao gravar log: " + e.getMessage());
        }
    }
}
