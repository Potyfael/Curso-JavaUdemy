package estruturaSequencial;

//        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//        casas decimais conforme exemplos.
//        Fórmula da área: area = π . raio2
//        Considere o valor de π = 3.14159

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        System.out.print("Digite o valor do raio: ");
        Scanner sc = new Scanner(System.in);
        double area, raio = sc.nextDouble();
        area = 3.14159 * (raio * raio);
        System.out.printf("Área = %.5f%n", area);
        sc.close();
    }
}
