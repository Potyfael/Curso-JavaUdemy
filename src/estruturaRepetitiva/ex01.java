package estruturaRepetitiva;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        int guess = 0;
        int tentativas = 0;
        while (guess != senha) {
            System.out.print("Senha: ");
            guess = sc.nextInt();
            tentativas++;
            if (senha != guess)
                System.out.println("Senha invalida");
        }
        System.out.println("Acesso permitido");
        System.out.printf("Tentativas: %d%n", tentativas);
    }
}
