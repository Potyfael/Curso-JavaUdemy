package estruturaSequencial;

import java.util.Scanner;

//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
    //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
public class ex02 {
        public static void main(String[] args) {
            System.out.print("Digite quatro valores inteiros: ");
            Scanner sc = new Scanner(System.in);
            int n1, n2, n3, n4, dif;
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            n3 = sc.nextInt();
            n4 = sc.nextInt();
            dif = n1 * n2 - n3 * n4;
            sc.close();
            System.out.printf("A diferença é : %d%n", dif);
        }
}
