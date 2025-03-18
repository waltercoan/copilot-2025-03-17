package br.com.kasolution.exercicio3;

public class Main {

    public static void main(String[] args) {
        String email = "exemplo@dominio.com";
        boolean isValid = validarEmail(email);
        System.out.println("O email " + email + " é válido? " + isValid);
    }

    public static boolean validarEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
}
