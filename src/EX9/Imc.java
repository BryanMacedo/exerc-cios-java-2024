package EX9;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- CALCULADOR DE IMC ---");
        System.out.println();
        System.out.print("Informe o seu peso: ");
        double peso = input.nextDouble();

        System.out.print("Informe o sua altura: ");
        double altura = input.nextDouble();

        double calculaImc = peso / (altura * altura);
        System.out.println("\n-------------------------------------------");
        System.out.printf("Seu IMC é: %.1f\n", calculaImc);

        if (calculaImc < 18.5){
            System.out.println("Você esta abaixo do peso");
            System.out.println("-------------------------------------------");
        } else if (calculaImc >= 18.6 && calculaImc <= 24.9) {
            System.out.println("Você esta no peso ideal");
            System.out.println("-------------------------------------------");
        } else if (calculaImc >= 25.0 && calculaImc <= 29.9) {
            System.out.println("Você esta levemente acima do peso");
            System.out.println("-------------------------------------------");
        } else if (calculaImc >= 30.0 && calculaImc <= 34.9) {
            System.out.println("Você esta com Obesidade grau I");
            System.out.println("-------------------------------------------");
        } else if (calculaImc >= 35.0 && calculaImc <= 39.9) {
            System.out.println("Você esta com Obesidade grau II (Severa)");
            System.out.println("-------------------------------------------");
        }else if (calculaImc >= 40.0){
            System.out.println("Você esta com Obesidade grau III (Mórbida)");
            System.out.println("-------------------------------------------");
        }

        input.close();
    }
}
