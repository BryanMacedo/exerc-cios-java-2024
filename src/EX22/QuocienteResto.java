package EX22;

import java.util.Scanner;

public class QuocienteResto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe dois valores abaixo: ");
        System.out.print("Valor A: ");
        int a = input.nextInt();
        System.out.print("Valor B: ");
        int b = input.nextInt();

        int divisao = a / b;
        int resto = a % b;

        System.out.println("O quociente de " + a + " dividido por " + b + " é: " + divisao);
        System.out.println("O resto de " + a + " dividido por " + b + " é: " + resto);

        input.close();
    }
}
