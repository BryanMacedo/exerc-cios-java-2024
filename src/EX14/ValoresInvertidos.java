package EX14;

import java.util.Scanner;

public class ValoresInvertidos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Insira um valor para a: ");
        a = input.nextInt();

        System.out.print("Insira um valor para b: ");
        b = input.nextInt();

        System.out.println("\nVocê digitou: " + a + " para a e: " + b + " para b");

        c = a;
        a = b;
        b = c;

        System.out.println("\nValores trocados: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        input.close();
    }
}
