package estruturaRepetitiva.forr;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20)
                in++;
            else
                out++;
        }
        sc.close();
        System.out.printf("%d in%n%d out%n", in, out);
    }
}
