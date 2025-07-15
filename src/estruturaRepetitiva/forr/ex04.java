package estruturaRepetitiva.forr;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble(), b = sc.nextDouble();
            if (b == 0) {
                System.out.println("Divisao impossivel");
            } else {
                System.out.printf("%.1f%n", a / b);
            }
        }
        sc.close();
    }
}
