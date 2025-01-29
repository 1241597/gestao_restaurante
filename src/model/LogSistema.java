package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LogSistema {
    public static void registrarAcao(String mensagem) {
        String nomeArquivoLog = "logs_" + LocalDate.now() + ".txt"; // Exemplo: logs_2025-01-15.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivoLog, true))) {
            String log = LocalDateTime.now() + " - " + mensagem;
            writer.write(log);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao registrar log: " + e.getMessage());
        }
    }
}
