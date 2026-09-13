package questoes;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class q1 {
    static void main() {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Quantas temperaturas deseja ler? ");
        int t = sc.nextInt();

        double [] temperaturas = new double[t];
        double soma = 0;
        double media;
        double menor = 0;
        double maior = 0;
        ArrayList<Double> minus0 = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            System.out.print("Digite a " + (i + 1) + "ª temperatura: ");
            temperaturas[i] = sc.nextDouble();

            soma += temperaturas[i];

            if (i == 0) {
                menor = temperaturas[i];
                maior = temperaturas[i];
            } else {
                if (temperaturas[i] < menor) {
                    menor = temperaturas[i];
                }

                if (temperaturas[i] > maior) {
                    maior = temperaturas[i];
                }
            }

            if (temperaturas[i] < 0) {
                minus0.add(temperaturas[i]);
            }
        }

        media = soma/t;

        System.out.println("============================");
        System.out.println("Media das Temperaturas: " + df.format(media) + "ºC");
        System.out.println("Menor temperatura: " + menor + "ºC");
        System.out.println("Maior temperatura: " + maior + "ºC");

        if (!minus0.isEmpty()) {
            System.out.println("============================");
            System.out.println("Temperaturas abaixo de Zero:");
            System.out.println("============================");

            for (double m : minus0) {
                System.out.println(m + "ºC");
            }
        }
    }
}
