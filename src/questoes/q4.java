package questoes;
import java.util.Scanner;

public class q4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();
        sanitizar(texto);
    }

    public static void sanitizar(String text) {
        System.out.println("Quantidade de caracteres antes da sanitização: " + text.length() + " - " + text);

        text = text.trim();

        System.out.println("Quantidade de caracteres após a sanitização: " + text.length() + " - " +  text);
    }
}
