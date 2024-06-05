package JavaBasico;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double valor1, valor2, resultado;
        boolean encerrar = false;
        int operacao;
        Scanner sc = new Scanner(System.in);

        while (!encerrar) {
            System.out.println("""
                    Para somar digite 1
                    Para subtrair digite 2
                    Para multiplicar digite 3
                    Para dividir digite 4
                    Para sair digite 0
                    """);
            operacao = sc.nextInt();
            switch (operacao) {
                case 1:
                    valor1 = sc.nextDouble();
                    valor2 = sc.nextDouble();
                    soma(valor1, valor2);
                    break;
                case 2:
                    valor1 = sc.nextDouble();
                    valor2 = sc.nextDouble();
                    subtracao(valor1, valor2);
                    break;
                case 3:
                    valor1 = sc.nextDouble();
                    valor2 = sc.nextDouble();
                    multiplicacao(valor1, valor2);
                    break;
                case 4:
                    valor1 = sc.nextDouble();
                    valor2 = sc.nextDouble();
                    divisao(valor1, valor2);
                    break;
                case 0:
                    System.out.println("Encerrando o programinha, té mais");
                    encerrar = true;
                    break;
                default:
                    System.out.println("Operação inválida");
                    break;
            }
        }
    }

    public static double soma(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public static double subtracao(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public static double multiplicacao(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public static double divisao(double valor1, double valor2) {
        return valor1 - valor2;
    }
}
