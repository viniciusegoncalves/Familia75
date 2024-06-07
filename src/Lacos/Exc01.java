package Lacos;

import java.util.Scanner;

public class Exc01 {
    public static void main(String[] args) {
        int n1, n2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número do intervalo: ");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo número do intervalo: ");
        n2 = sc.nextInt();

        if(n2 > n1) {
            System.out.println("No intervalo entre " + n1 + " e " + n2);
            for(int n = n1; n >= n1 && n <=n2; n++){
                if(n%3 == 0 && n%5 ==0) {
                    System.out.println(n + " é multiplo de 3 e 5");
                }
            }
        }else {
            System.out.println("Intervalo Inválido!");
        }

    }
}
