package EX13;

import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade < 18 && idade > 0){
            System.out.println("O usuario " + nome + " tem " + idade + " anos e é menor de idade");
        }else if (idade <= 0){
            System.out.println("IDADE INVALIDA!!");
        }else {
            System.out.println("O usuario " + nome + " tem " + idade + " anos e é maior de idade");
        }

        input.close();
    }
}
