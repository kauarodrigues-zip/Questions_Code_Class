package questoes;

import java.text.DecimalFormat;

public class q2 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("=============================");
            System.out.println("Dados informados invalidos!");
            System.out.println("Modo de Uso:");
            System.out.println("Digite em sequencia: operando 1 Operador(+, -, x, /) operando 2");
            System.out.println("Ex: 12 x 3.12");
            System.out.println("=============================");
            return;
        }

        DecimalFormat df = new DecimalFormat("#.##");
        double n1 = Double.parseDouble(args[0]);
        String op = args[1].toLowerCase();
        double n2 = Double.parseDouble(args[2]);
        double res;

        System.out.println("=========================================");
        System.out.print("Operação Fornecida: ");
        System.out.println(n1 + " " + op + " " + n2 + " ");

        switch (op) {
            case "+" -> {
                System.out.print("A soma dos valores é: ");
                res = n1 + n2;
                System.out.println(df.format(res));
            }
            case "-" -> {
                System.out.print("A subtração dos valores é: ");
                res = n1 - n2;
                System.out.println(df.format(res));
            }
            case "x", "*" -> {
                System.out.print("A multiplicação dos valores é: ");
                res = n1 * n2;
                System.out.println(df.format(res));
            }
            case "/" -> {
                if (n2 == 0) {
                    System.out.println("Indeterminado, não é possível realizar divisão por zero");
                    System.out.println("=========================================");
                    return;
                } else {
                    System.out.print("A multiplicação dos valores é: ");
                    res = n1 / n2;
                    System.out.println(df.format(res));
                }
            }
        }
        System.out.println("=========================================");

    }
}