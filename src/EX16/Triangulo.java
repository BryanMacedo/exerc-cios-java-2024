package EX16;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe três valores para criar um triângul: ");
        System.out.print("Informe um valor para o lado \'a\': ");
        double a = input.nextDouble();
        System.out.print("Informe um valor para o lado \'b\': ");
        double b = input.nextDouble();
        System.out.print("Informe um valor para o lado \'c\': ");
        double c = input.nextDouble();

        if (a + b > c || b + c > a || c + a > b){
            if ( a == b && b == c){
                System.out.println("Os valores passados formam um triângulo equilátero");
            } else if ((a == b && a != c) || ( b == c && b != a) || (c == a && c != b)) {
                System.out.println("Os valores passados formam um triângulo isósceles");
            }else if (a != b && b != c) {
                System.out.println("Os valores passados formam um triângulo escaleno");
            }
        }else {
            System.out.println("Os valores passados não formam um triângulo");
        }

        input.close();
    }
}
