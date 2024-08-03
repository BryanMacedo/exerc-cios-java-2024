package EX21;

import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int valorAleatorio = random.nextInt(101);

        System.out.println("Valor Aleatório: " + valorAleatorio);
    }
}
