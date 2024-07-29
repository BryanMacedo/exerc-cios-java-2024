package EX8;

import java.util.Scanner;

public class Decrescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor01 = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor02 = input.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor03 = input.nextInt();

        if (valor01 > valor02 && valor02 > valor03){
            System.out.println(valor01 +  " - " + valor02 + " - " + valor03);
        } else if (valor01 > valor03 && valor03 > valor02) {
            System.out.println(valor01 +  " - " + valor03 + " - " + valor02);
        } else if (valor02 > valor01 && valor01 > valor03) {
            System.out.println(valor02 +  " - " + valor01 +  " - " + valor03);
        }else if (valor02 > valor03 && valor03 > valor01) {
            System.out.println(valor02 +  " - " + valor03 +  " - " + valor01);
        }else if (valor03 > valor01 && valor01 > valor02) {
            System.out.println(valor03 +  " - " + valor01 +  " - " + valor02);
        }else if (valor03 > valor02 && valor02 > valor01) {
            System.out.println(valor03 +  " - " + valor02 +  " - " + valor01);
        }

        input.close();
    }
}
