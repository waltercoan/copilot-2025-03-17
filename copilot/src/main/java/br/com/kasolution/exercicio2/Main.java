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

        // Testando o novo método
        int numero = 5;
        System.out.println(numero + " é " + verificarParOuImpar(numero));
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

    /**
     * Faz uma requisição HTTP GET para a URL fornecida e imprime a resposta no console.
     *
     * @param urlString A URL para a qual a requisição GET será feita.
     */
    public static void chamarApiRest(String urlString) {
        try {
            // Cria um objeto URL a partir da string fornecida
            URL url = new URL(urlString);
            
            // Abre uma conexão HTTP com a URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            // Define o método HTTP como GET
            connection.setRequestMethod("GET");

            // Obtém o código de resposta da requisição
            int responseCode = connection.getResponseCode();
            
            // Verifica se a resposta foi bem-sucedida (código 200)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Cria um BufferedReader para ler a resposta da API
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                // Lê cada linha da resposta e adiciona ao StringBuilder
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                // Fecha o BufferedReader
                in.close();
                
                // Imprime a resposta da API no console
                System.out.println("Response: " + content.toString());
            } else {
                // Imprime uma mensagem de erro se a requisição falhar
                System.out.println("GET request failed. Response Code: " + responseCode);
            }
        } catch (IOException e) {
            // Captura e imprime qualquer exceção de I/O que ocorra durante o processo
            e.printStackTrace();
        }
    }

    /**
     * Verifica se um número é par ou ímpar.
     *
     * @param numero O número a ser verificado.
     * @return Uma string indicando se o número é "par" ou "ímpar".
     */
    public static String verificarParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return "par";
        } else {
            return "ímpar";
        }
    }
}
