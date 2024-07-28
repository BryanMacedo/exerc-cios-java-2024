package EX2;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite qualquer número: ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.print(num + " é um número par e");
        }else {
            System.out.print(num + " é um número impar e");
        }

        if (num == 0){
            System.out.print(" não é nem positivo nem negativo");
        } else if (num < 0) {
            System.out.print(" é um número negativo");
        }else {
            System.out.print(" é um número positivo");
        }

        input.close();
    }
}
