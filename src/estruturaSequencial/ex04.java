package estruturaSequencial;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//        decimais

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu id: ");
        int id = sc.nextInt();

        System.out.print("Horas trabalhadas: ");
        int horas = sc.nextInt();

        System.out.print("Quanto recebe por hora? ");
        double valorHora = sc.nextDouble();

        double salario = valorHora * horas;

        System.out.printf("Salário: R$ %.2f", salario);
        sc.close();
    }
}
