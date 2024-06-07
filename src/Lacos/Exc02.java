package Lacos;

import java.util.Scanner;

public class Exc02 {
    public static void main(String[] args) {
        int num, contP=0, contI=0;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <=10; i++){
            System.out.println("Digite o " + i + "º número: ");
            num = sc.nextInt();
            if(num%2 == 0) {
                contP++;
            } else {
                contI++;
            }
        }
        System.out.println("Total de números pares: " + contP);
        System.out.println("Total de números ímpares: " + contI);
    }
}
