package estruturaCondicional;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaInicial = sc.nextInt();
        System.out.print("Hora final: ");
        int horaFinal = sc.nextInt();
        int duracao;

        if (horaInicial > horaFinal) {
            duracao = 24 - (horaInicial - horaFinal);
        } else if (horaFinal > horaInicial) {
           duracao = 24 - (horaFinal - horaInicial);
        } else {
            duracao = 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
    }

}
