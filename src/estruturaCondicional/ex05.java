package estruturaCondicional;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CÓDIGO     ESPECIFICAÇÃO       PREÇO");
        System.out.println("1          Cachorro Quente     R$4.00");
        System.out.println("2          X-Salada            R$4.50");
        System.out.println("3          X-Bacon             R$5.00");
        System.out.println("4          Torrada simples     R$2.00");
        System.out.println("5          Refrigerante        R$1.50");

        System.out.print("Digite o código do item: ");
        int cod = sc.nextInt();

        System.out.print("Digite a quantidade do item: ");
        int quant = sc.nextInt();

        double total = quant;
        if (cod == 1) {
            total *= 4;
        } else if (cod == 2) {
            total *= 4.50;
        } else if (cod ==3) {
            total *= 5;
        } else if (total == 4) {
            total *= 2;
        } else if (total == 5) {
            total *= 1.50;
        } else {
            total *= 0;
        }

        System.out.printf("TOTAL: R$ %.2f%n", total);

    }
}
