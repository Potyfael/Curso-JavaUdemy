package estruturaCondicional;

import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de x e y: ");
        double x = sc.nextDouble(), y = sc.nextDouble();
        sc.close();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x != 0 && y == 0) {
            System.out.println("Eixo X");
        } else {
            System.out.println("Eixo Y");
        }
    }
}
