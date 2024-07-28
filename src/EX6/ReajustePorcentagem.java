package EX6;

import java.util.Scanner;

public class ReajustePorcentagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um valor: ");
        double num = input.nextDouble();

        double valorReajuste = num + (5 * num / 100);
        System.out.println("O valor: " + num + " com um reajuste de 5% é: " + valorReajuste);

        input.close();
    }
}
