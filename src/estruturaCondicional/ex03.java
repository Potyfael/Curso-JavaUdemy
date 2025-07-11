package estruturaCondicional;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor inteiro A: ");
        int a = sc.nextInt();

        System.out.print("Valor inteiro B: ");
        int b = sc.nextInt();

        int greater = Math.max(a, b);
        int smaller = Math.min(a, b);

        if (greater % smaller == 0)
            System.out.println("SAO MULTIPLOS");
        else
            System.out.println("NAO SAO MULTIPLOS");

    }
}
