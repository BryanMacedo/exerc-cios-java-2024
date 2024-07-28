package EX3;

import java.util.Scanner;

public class VerificaDoisValores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c;

        System.out.print("Informe um valor para a: ");
        int a = input.nextInt();

        System.out.print("Informe um valor para b: ");
        int b = input.nextInt();

        if (a == b){
            c = a + b;
            System.out.println("a e b são iguais e sua soma é: " + c);
        }else{
            c = a * b;
            System.out.println("a e b são diferentes e sua multiplicação é: " + c);
        }

        input.close();
    }
}
