package estruturaRepetitiva.whilee;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        while (true) {
            System.out.print("Digite o valor de x e y respectivamente: ");
            x = sc.nextInt();
            y = sc.nextInt();
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 & y < 0) {
                System.out.println("Terceiro");
            } else {
                break;
            }
        }
        sc.close();
    }
}
