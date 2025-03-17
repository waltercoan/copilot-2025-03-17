public class Main {
    // defina um método main para esta classe
    public static void main(String[] args) {
        //código para chamar o método calcularMedia
        double[] numeros = {1.0, 2.0, 3.0, 4.0, 5.0};
        double media = calcularMedia(numeros);
        System.out.println("A média é: " + media);
    }

    // defina um método para calcular a média de uma lista de números
    public static double calcularMedia(double[] numeros) {
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma / numeros.length;
    }
    //defina um método para calcular a média de uma lista de números utilizando o método stream
    public static double calcularMediaStream(double[] numeros) {
        return java.util.Arrays.stream(numeros).average().orElse(0.0);
    }

}
