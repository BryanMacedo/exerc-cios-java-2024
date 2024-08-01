package EX17;

import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe uma temperatura em fahrenheit e converta para celsius: ");
        double fahrenheit = input.nextDouble();

        double celsius = (5 * (fahrenheit - 32) / 9);
        System.out.println(fahrenheit + "°F são " + celsius + "°C");

        input.close();
    }
}
