package EX11;

import java.util.Scanner;

public class AlunoAprovado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o nome do aluno: ");
        String nome = input.nextLine();

        System.out.println("-------------------------------------------------------------------");
        System.out.println("--- Calculo de média de notas do(a) " + nome + " ---");
        System.out.print("\nInforme a primeira nota: ");
        double nota01 = input.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota02 = input.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double nota03 = input.nextDouble();

        System.out.print("Informe a quarta nota: ");
        double nota04 = input.nextDouble();

        double somaNotas = nota01 + nota02 + nota03 + nota04;
        double[] notas = {nota01, nota02, nota03, nota04};
        double media = (somaNotas / notas.length);

        if (media < 7) {
            System.out.println("A média do aluno(a) " + nome + " foi de: " + media + " e foi REPROVADO!!");
        } else {
            System.out.println("A média do aluno(a) " + nome + " foi de: " + media + " e foi APROVADO!!");
        }
        System.out.println("-------------------------------------------------------------------");


        input.close();
    }
}
