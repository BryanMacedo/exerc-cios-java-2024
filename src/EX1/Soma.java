package EX1;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("Digite um valor para a: ");
        a = input.nextInt();
        System.out.print("Digite um valor para b: ");
        b = input.nextInt();
        System.out.print("Digite um valor para c: ");
        c = input.nextInt();

        int soma = a + b;

        System.out.println();
        System.out.println("A soma de a mais b é: " + soma);
        System.out.println();

        if (soma < c){
            System.out.println("Soma é menor que c");
        }else {
            System.out.println("Soma é maior que c");
        }
    }
}
