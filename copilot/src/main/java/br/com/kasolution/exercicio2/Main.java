package br.com.kasolution.exercicio2;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] header = {"Nome", "Idade", "Cidade"};
        String[][] data = {
            {"João", "30", "São Paulo"},
            {"Maria", "25", "Rio de Janeiro"},
            {"Pedro", "35", "Belo Horizonte"}
        };

        gerarCsv("dados.csv", header, data);
    }

    public static void gerarCsv(String fileName, String[] header, String[][] data) {
        try (FileWriter writer = new FileWriter(fileName)) {
            // Escreve o cabeçalho
            for (int i = 0; i < header.length; i++) {
                writer.append(header[i]);
                if (i < header.length - 1) {
                    writer.append(",");
                }
            }
            writer.append("\n");

            // Escreve os dados
            for (String[] row : data) {
                for (int i = 0; i < row.length; i++) {
                    writer.append(row[i]);
                    if (i < row.length - 1) {
                        writer.append(",");
                    }
                }
                writer.append("\n");
            }

            System.out.println("Arquivo CSV gerado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao gerar o arquivo CSV: " + e.getMessage());
        }
    }
}
