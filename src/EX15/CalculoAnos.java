package EX15;

import java.util.Scanner;

public class CalculoAnos {
    public static void main(String[] args) {
        // PROGRAMA FEITO PARA SER USADO DIA 1 DE AGOSTO DE 2024
        Scanner input = new Scanner(System.in);
        int anoAtual = 2024;

        System.out.print("Informe seu ano de nascimento: ");
        int anoNascimento = input.nextInt();

        int calculaIdade = anoAtual - anoNascimento;
        System.out.println("Você possui " + calculaIdade + " anos, 7 meses e 1 dia de vida!");

        input.close();
    }
}
