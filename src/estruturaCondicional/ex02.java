package estruturaCondicional;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int n = sc.nextInt();

        if (n % 2 != 0)
            System.out.println("IMPAR");
        else
            System.out.println("PAR");
    }
}
