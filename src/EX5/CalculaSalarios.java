package EX5;

import java.util.Scanner;

public class CalculaSalarios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double SALARIO_MINIMO = 1293.20;

        System.out.print("Informe o seu salario: ");
        double salarioUsuario = input.nextDouble();

        double calculaQntdSalario = salarioUsuario / SALARIO_MINIMO;

        System.out.printf("Você recebe aproximadamente: %.1f salários minimos" ,calculaQntdSalario);

        input.close();
    }
}
