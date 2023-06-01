package exercicios;
import java.util.Scanner;

public class Juros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double investimentoMensal;
        double taxaJurosMensal;

        System.out.print("Informe o valor do investimento mensal: ");
        investimentoMensal = teclado.nextDouble();

        System.out.print("Informe a taxa de juros mensal (em decimal): ");
        taxaJurosMensal = teclado.nextDouble();

        double saldo = 0;
        int numMeses = 12;

        for (int i = 1; i <= numMeses; i++) {
            saldo += investimentoMensal;
            saldo *= (1 + taxaJurosMensal);
        }

        System.out.println("Saldo do investimento após 1 ano: " + saldo);

        char opcao;
        do {
            System.out.print("Deseja processar mais um ano? (S/N): ");
            opcao = teclado.next().charAt(0);

            if (opcao == 'S' || opcao == 's') {
                saldo = (saldo + investimentoMensal) * (1 + taxaJurosMensal);

                System.out.println("Saldo do investimento após mais um ano: " + saldo);
            }
        } while (opcao == 'S' || opcao == 's');

        teclado.close();
    }
}
