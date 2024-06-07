package Condicionais;

import java.util.Scanner;

public class Exc02 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        a = sc.nextInt();

        if (a > 0 && a % 2 == 0) {
            System.out.println("O Número " + a + " é par e positivo!");
        } else if (a > 0 && a % 2 != 0) {
            System.out.println("O Número " + a + " é ímpar e positivo!");
        } else if (a < 0 && a % 2 == 0) {
            System.out.println("O Número " + a + " é par e negativo!");
        } else if (a < 0 && a % 2 != 0) {
            System.out.println("O Número " + a + " é ímpar e negativo!");
        } else {
            System.out.println("O Número " + a + " é 0");
        }
    }
}
