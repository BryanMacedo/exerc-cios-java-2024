package EX12;

import java.util.Scanner;

public class CalculaProduto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cauculaPorcentagem;

        System.out.print("Informe o valor do produto: ");
        double valor = input.nextDouble();
        double valorPago;

        System.out.println("\nInforme a forma de pagamento: ");
        System.out.println("*Digite 1 para avista em dinheiro");
        System.out.println("*Digite 2 para avista no cartão de crédito");
        System.out.println("*Digite 3 para parcelado no cartão de crédito em duas vezes");
        System.out.println("*Digite 4 para parcelado no cartão de crédito em três vezes ou mais");
        System.out.print("Informe sua escolha: ");
        int formaPagamento = input.nextInt();

        switch (formaPagamento){
            case 1:
                System.out.println("Avista tem 15% de desconto!");
                cauculaPorcentagem = valor * 0.15;
                valorPago = valor - cauculaPorcentagem;
                System.out.println("Valor final: " + valorPago);
                break;
            case 2:
                System.out.println("Avista no cartão tem 10% de desconto!");
                cauculaPorcentagem = valor * 0.10;
                valorPago = valor - cauculaPorcentagem;
                System.out.println("Valor final: " + valorPago);
                break;
            case 3:
                System.out.println("Parcelado em até duas vezes é o preço normal!");
                valorPago = valor;
                System.out.println("Valor final: " + valorPago);
                break;
            case 4:
                System.out.println("Prcelado em três vezes ou mais possui juros de 10%!");
                cauculaPorcentagem = valor * 0.10;
                valorPago = valor + cauculaPorcentagem;
                System.out.println("Valor final: " + valorPago);
                break;
        }

        input.close();
    }
}
