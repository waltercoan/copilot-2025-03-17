package br.com.kasolution.exercicio4;

public class Main {

    public static void main(String[] args) {
        String cpf = "123.456.789-10";
        boolean isValid = validarCPF(cpf);
        System.out.println("O CPF " + cpf + " é válido? " + isValid);
    }

    public static boolean validarCPF(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("\\D", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcula os dígitos verificadores
        int[] pesos = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * pesos[i];
        }
        int primeiroDigitoVerificador = 11 - (soma % 11);
        primeiroDigitoVerificador = (primeiroDigitoVerificador > 9) ? 0 : primeiroDigitoVerificador;

        pesos = new int[]{11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * pesos[i];
        }
        int segundoDigitoVerificador = 11 - (soma % 11);
        segundoDigitoVerificador = (segundoDigitoVerificador > 9) ? 0 : segundoDigitoVerificador;

        // Verifica se os dígitos verificadores são iguais aos calculados
        return cpf.charAt(9) - '0' == primeiroDigitoVerificador && cpf.charAt(10) - '0' == segundoDigitoVerificador;
    }
}