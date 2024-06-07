package Condicionais;

import java.util.Scanner;

public class Testando02 {
    public static void main(String[] args) {
        double salario;

        Scanner sc = new Scanner(System.in);

        System.out.println("Salário: ");
        salario = sc.nextDouble();

        if (salario <= 2000) {
        //Salario do 0 a 2000 - Ela isenta de imposto

            System.out.println("Isento");

        } else if (salario > 2000 && salario <= 3000) {

            System.out.println((salario - 2000)*0.08);

        } else if (salario > 3000 && salario <= 4500) {

            System.out.println(((salario - 3000)*0.18) + 80);

        } else if (salario > 4500) {

            System.out.println(((salario - 4500)*0.28) + 350);

        } else {
            System.out.println("Inválido");
        }
    }
}
