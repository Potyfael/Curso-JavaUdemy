package estruturaSequencial;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código da peça: ");
        int cod1 = sc.nextInt();

        System.out.print("Quantidade: ");
        int quant1 = sc.nextInt();

        System.out.print("Preço unitário: ");
        double preco1 = sc.nextDouble();

        System.out.println("-=-=-=-=-=-=-=-=-=-=");

        System.out.print("Código da peça: ");
        int cod2 = sc.nextInt();

        System.out.print("Quantidade: ");
        int quant2 = sc.nextInt();

        System.out.print("Preço unitário: ");
        double preco2 = sc.nextDouble();

        double total1 = quant1 * preco1;
        double total2 = quant2 * preco2;
        double total = total1 + total2;
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
