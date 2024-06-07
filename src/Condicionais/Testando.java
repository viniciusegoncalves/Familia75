package Condicionais;

import java.util.Scanner;

public class Testando {
    public static void main(String[] args) {
        float x,y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor X: ");
        x = sc.nextFloat();

        System.out.println("Valor Y: ");
        y = sc.nextFloat();

        if(x == 0 && y==0) {
            System.out.println("Origem");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x == 0 && y != 0) {
            System.out.println("Eixo X");
        } else if (x != 0 && y == 0) {
            System.out.println("Eixo Y");
        } else {
            System.out.println("Inválido");
        }
    }
}
