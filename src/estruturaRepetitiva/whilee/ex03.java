package estruturaRepetitiva.whilee;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[1] ÁLCOOL");
        System.out.println("[2] GASOLINA");
        System.out.println("[3] DIESEL");
        System.out.println("[4] FIM");


        int qntAlcool = 0, qntGasolina = qntAlcool, qntDiesel = qntAlcool;
        while (true) {
            System.out.println("Digite aqui: ");
            int resposta = sc.nextInt();

            if (resposta >= 1 && resposta <= 3) {
                System.out.println("Produto selecionado.");
                switch (resposta) {
                    case 1 -> qntAlcool++;
                    case 2 -> qntGasolina++;
                    default -> qntDiesel++;
                }
            } else if (resposta == 4) {
                break;
            }
        }
        sc.close();
        System.out.println("Muito obrigado");
        System.out.printf("Alcool: %d%n", qntAlcool);
        System.out.printf("Gasolina: %d%n", qntGasolina);
        System.out.printf("Diesel: %d%n", qntDiesel);
    }
}
