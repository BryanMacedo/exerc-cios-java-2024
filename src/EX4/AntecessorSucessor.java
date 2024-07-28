package EX4;

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();

        int antecessor = num;
        antecessor = antecessor - 1;

        int sucessor = num;
        sucessor = sucessor + 1;

        System.out.println("Você digitou o número " + num +
                ", seu antecessor é: " + antecessor +
                " e seu sucessor é: " + sucessor);

        input.close();

    }

}
