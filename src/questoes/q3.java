package questoes;

import java.util.Locale;
import java.util.Scanner;

public class q3 {

    public static boolean validaOverFlow(int n1, int n2) {
        long resultado = (long) n1 * n2;
        return resultado >= Integer.MIN_VALUE && resultado <= Integer.MAX_VALUE;
    }

    static void main() {
        String formato = "| %-7s | %-7s | %-22s | %-22s |%n";
        String linhaDivisoria = "+---------+---------+------------------------+------------------------+";

        System.out.println(linhaDivisoria);
        System.out.printf(formato, "TYPE", "BYTES", "MIN", "MAX");
        System.out.println(linhaDivisoria);
        System.out.printf(formato, "Short", Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.println(linhaDivisoria);
        System.out.printf(formato, "integer", Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(linhaDivisoria);
        System.out.printf(formato, "Long", Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println(linhaDivisoria);

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("\n");

        System.out.print("Digite o primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int n2 = sc.nextInt();

        if (validaOverFlow(n1, n2)) {
            System.out.println("O resultado é: " + (n1 * n2));
        } else {
            System.out.println("integer Overflow Detected, Operation Aborted.");
        }
    }
}