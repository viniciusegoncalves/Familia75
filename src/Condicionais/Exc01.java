package Condicionais;

import java.util.Scanner;

public class Exc01 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número A: ");
        a = sc.nextInt();

        System.out.println("Digite o número B: ");
        b = sc.nextInt();

        System.out.println("Digite o número C: ");
        c = sc.nextInt();

        if ((a+b) > c){
            System.out.println(b + " + " + a + " = " + (a+b) + " > " + c);
            System.out.println("A soma de A + B é Maior do que C");
        } else if ((a + b) < c) {
            System.out.println(b + " + " + a + " = " + (a+b) + " < " + c);
            System.out.println("A soma de A + B é Menor do que C");
        } else {
            System.out.println(b + " + " + a + " = " + (a+b) + " = " + c);
            System.out.println("A soma de A + B é Igual a C");
        }
    }
}
