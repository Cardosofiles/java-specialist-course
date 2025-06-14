package fundamentals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== CALCULADORA JAVA ===");
            System.out.println("1. Operações Básicas");
            System.out.println("2. Cálculos Financeiros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> basicOperations(input);
                case 2 -> financialOperations(input);
                case 0 -> {
                    System.out.println("Encerrando calculadora...");
                    input.close();
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    static void basicOperations(Scanner input) {
        System.out.print("Digite o primeiro número: ");
        int numberOne = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int numberTwo = input.nextInt();

        System.out.println("Soma: " + (numberOne + numberTwo));
        System.out.println("Subtração: " + (numberOne - numberTwo));
        System.out.println("Multiplicação: " + (numberOne * numberTwo));
        if (numberTwo != 0) {
            System.out.println("Divisão: " + ((double) numberOne / numberTwo));
            System.out.println("Módulo: " + (numberOne % numberTwo));
        } else {
            System.out.println("Divisão por zero não é permitida.");
        }
    }

    static void financialOperations(Scanner input) {
        System.out.println("\n=== CÁLCULOS FINANCEIROS ===");
        System.out.println("1. Valor Futuro (VF)");
        System.out.println("2. Valor Presente (VP)");
        System.out.println("3. Taxa de Juros (i)");
        System.out.println("4. Tempo (n)");
        System.out.print("Escolha uma opção: ");

        int choice = input.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Digite o Valor Presente (VP): ");
                double vp = input.nextDouble();
                System.out.print("Digite a taxa de juros (i) em decimal (ex: 0.05): ");
                double i = input.nextDouble();
                System.out.print("Digite o tempo (n): ");
                int n = input.nextInt();
                double vf = vp * Math.pow(1 + i, n);
                System.out.println("Valor Futuro (VF): " + vf);
            }
            case 2 -> {
                System.out.print("Digite o Valor Futuro (VF): ");
                double vf = input.nextDouble();
                System.out.print("Digite a taxa de juros (i) em decimal: ");
                double i = input.nextDouble();
                System.out.print("Digite o tempo (n): ");
                int n = input.nextInt();
                double vp = vf / Math.pow(1 + i, n);
                System.out.println("Valor Presente (VP): " + vp);
            }
            case 3 -> {
                System.out.print("Digite o Valor Presente (VP): ");
                double vp = input.nextDouble();
                System.out.print("Digite o Valor Futuro (VF): ");
                double vf = input.nextDouble();
                System.out.print("Digite o tempo (n): ");
                int n = input.nextInt();
                double i = Math.pow(vf / vp, 1.0 / n) - 1;
                System.out.println("Taxa de Juros (i): " + (i * 100) + "%");
            }
            case 4 -> {
                System.out.print("Digite o Valor Presente (VP): ");
                double vp = input.nextDouble();
                System.out.print("Digite o Valor Futuro (VF): ");
                double vf = input.nextDouble();
                System.out.print("Digite a taxa de juros (i) em decimal: ");
                double i = input.nextDouble();
                double n = Math.log(vf / vp) / Math.log(1 + i);
                System.out.println("Tempo (n): " + n);
            }
            default -> System.out.println("Opção inválida.");
        }
    }
}
