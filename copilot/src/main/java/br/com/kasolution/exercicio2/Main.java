package br.com.kasolution.exercicio2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        String[] header = {"Nome", "Idade", "Cidade"};
        String[][] data = {
            {"João", "30", "São Paulo"},
            {"Maria", "25", "Rio de Janeiro"},
            {"Pedro", "35", "Belo Horizonte"}
        };

        gerarCsv("dados.csv", header, data);
        chamarApiRest("https://api.exemplo.com/dados");
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

    public static void chamarApiRest(String apiUrl) {
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                System.out.println("Resposta da API: " + response.toString());
            } else {
                System.out.println("Erro na chamada da API: " + responseCode);
            }
        } catch (IOException e) {
            System.err.println("Erro ao chamar a API: " + e.getMessage());
        }
    }
}
