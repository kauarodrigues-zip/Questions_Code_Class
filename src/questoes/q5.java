package questoes;

import java.util.Scanner;

public class q5 {
    static void main() {
        // Em Java, não há passagem de parâmetros por referência como em C++.
        // Por isso, a leitura é feita diretamente no main.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu salario Atual: ");
        double salarioAtual = sc.nextDouble();

        double novoSalario = calcularReajuste(salarioAtual, 50);
        exibirRelatorio(nome, salarioAtual, novoSalario);
    }

    static double calcularReajuste(double salario, double percentual) {
        percentual = percentual / 100;
        percentual *= salario;
        return salario + percentual;
    }

    static void exibirRelatorio(String nome, double salarioAntigo, double novoSalario){
        System.out.println("==================================================");
        System.out.println("Nome do Colaborador: " + nome);
        System.out.println("Salário atual do colaborador: " + salarioAntigo);
        System.out.println("Novo Salário do colaborador: " + novoSalario);
        System.out.println("==================================================");
    }
}
