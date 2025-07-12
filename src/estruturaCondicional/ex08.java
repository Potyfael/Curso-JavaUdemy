package estruturaCondicional;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double sal = sc.nextDouble();
        double tax = 0;
        sc.close();

        if (sal <= 2000) {
            System.out.println("Isento");
        } else if (sal <= 3000) {
            tax = (sal - 2000) * 8/100;
        } else if (sal <= 4500) {
            tax = (sal - 3000) * 18/100 + (double) (1000 * 8) /100;
        } else {
            tax = (sal - 4500) * 28/100 + (double) (1500 * 18) /100 + (double) (1000 * 8) /100;
        }
        System.out.printf("Taxa: R$: %.2f%n", tax);
    }
}
