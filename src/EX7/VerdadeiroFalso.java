package EX7;

import java.util.Scanner;

public class VerdadeiroFalso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite \"true\" para um ter um valor lógico verdadeiro e \"false\" para um valor lógico falso: ");
        System.out.println("--- Primeiro valor ---");
        boolean valor1 = input.nextBoolean();

        System.out.println("--- Segundo valor ---");
        boolean valor2 = input.nextBoolean();

        if (valor1 && valor2){
            System.out.println("Os valores 1 e 2 são verdadeiros");
        } else if (!valor1 && !valor2) {
            System.out.println("Os valores 1 e 2 são falsos");
        }else if (valor1 && !valor2){
            System.out.println("O valor 1 é verdadeiro e o valor é falso");
        }else if (!valor1 && valor2){
            System.out.println("O valor 1 é falso e o valor é verdadeiro");
        }

        input.close();
    }
}
