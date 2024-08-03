package EX20;

import java.util.Scanner;

public class TabuadaEspecifica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um valor inteiro para ver sua tabuada: ");

        int valor = 1;
        valor = input.nextInt();

        do {
            System.out.println("-----------------------------");
            System.out.println(" " + valor + " x 1 = " + valor);
            System.out.println(" " + valor + " x 2 = " + valor*2);
            System.out.println(" " + valor + " x 3 = " + valor*3);
            System.out.println(" " + valor + " x 4 = " + valor*4);
            System.out.println(" " + valor + " x 5 = " + valor*5);
            System.out.println(" " + valor + " x 6 = " + valor*6);
            System.out.println(" " + valor + " x 7 = " + valor*7);
            System.out.println(" " + valor + " x 8 = " + valor*8);
            System.out.println(" " + valor + " x 9 = " + valor*9);
            System.out.println(" " + valor + " x 10 = " + valor*10);
            System.out.println("-----------------------------");
        }while (valor < 0);

        input.close();
    }
}
