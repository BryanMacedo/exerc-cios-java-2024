package EX10;

import java.util.Scanner;

public class NotasAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("--- Calculo de média de notas ---");
        System.out.print("\nInforme a primeira nota: ");
        double nota01 = input.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota02 = input.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double nota03 = input.nextDouble();

        double somaNotas = nota01 + nota02 + nota03;
        double[] notas = {nota01, nota02, nota03};
        double calculaMedia = somaNotas / notas.length;

        System.out.printf("\nA média do aluno é: %.1f", calculaMedia);
        System.out.println("\n-----------------------------------");


        input.close();
    }

}
