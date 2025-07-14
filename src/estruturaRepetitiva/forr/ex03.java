package estruturaRepetitiva.forr;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de casos: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double media = 0;
            double peso = 2;
            System.out.printf("Conjunto %d%n", i + 1);

            for (int j = 0; j < 3; j++) {
                peso += j;
                System.out.printf("Valor %d: ", j + 1);
                double x = sc.nextDouble();
                media += x * peso;
            }
            media /= 10;
            System.out.printf("%.2f%n", media);
        }
        sc.close();
    }
}
