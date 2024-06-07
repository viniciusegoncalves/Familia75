package Lacos;

import java.util.Scanner;

public class Exc05 {
    public static void main(String[] args) {
        int num, cont = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        do {
            if(num > 0){
                cont+=num;
            }
            System.out.println("Digite um número: ");
            num = sc.nextInt();

        } while (num != 0);

        System.out.println("A soma dos números positivos é: " + cont);
    }
}
