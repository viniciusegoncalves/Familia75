package Lacos;

import java.util.Scanner;

public class Exc03 {
    public static void main(String[] args) {
        int idade, contA = 0, contB = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        idade = sc.nextInt();

        while (idade >= 0) {
            if(idade < 21) {
                contA++;
            } else if (idade > 50) {
                contB++;
            }
            System.out.println("Digite uma idade: ");
            idade = sc.nextInt();
        }
        System.out.println("Total de pessoas menores de 21 anos: " + contA);
        System.out.println("Total de pessoas maiores de 50 anos: " + contB);
    }
}
