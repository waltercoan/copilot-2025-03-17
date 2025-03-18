// filepath: copilot/src/main/java/br/com/kasolution/exercicio6/Caixa.java
package br.com.kasolution.exercicio6;

import java.util.Scanner;

public class Caixa {
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean fecharCaixa = false;

        while (!fecharCaixa) {
            Carrinho carrinho = new Carrinho();
            System.out.println("Novo cliente. Adicione os itens ao carrinho.");

            boolean maisItens = true;
            while (maisItens) {
                System.out.print("Digite o nome do item: ");
                String nome = scanner.nextLine();

                System.out.print("Digite o preço do item: ");
                double preco = Double.parseDouble(scanner.nextLine());

                carrinho.adicionarItem(new Item(nome, preco));

                System.out.print("Deseja adicionar mais itens? (s/n): ");
                maisItens = scanner.nextLine().equalsIgnoreCase("s");
            }

            double total = carrinho.calcularTotal();
            System.out.println("Total da compra: R$ " + total);

            System.out.print("Deseja fechar o caixa? (s/n): ");
            fecharCaixa = scanner.nextLine().equalsIgnoreCase("s");
        }

        System.out.println("Caixa fechado. Até a próxima!");
        scanner.close();
    }
}