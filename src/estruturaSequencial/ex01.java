package estruturaSequencial;

import java.util.Scanner;

public class ex01 {

    //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    //mensagem explicativa, conforme exemplos.

    public static void main(String[] args) {
        System.out.print("Digite dois valores inteiros: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.printf("A soma dos dois valores é: %d%n", sum);
        sc.close();
    }
}
