package EX18;

public class AnosAltura {
    public static void main(String[] args) {
        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;

        double crescimentoAnualFrancisco = 0.02;
        double crescimentoAnualSara = 0.03;

        int anos = 0;

        while (alturaSara <= alturaFrancisco){
            alturaSara = alturaSara + crescimentoAnualSara;
            alturaFrancisco = alturaFrancisco + crescimentoAnualFrancisco;
            anos++;
        }

        System.out.println("Será necessario " + anos + " anos para que sara seja maior que francisco");
    }
}
