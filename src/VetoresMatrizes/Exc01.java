package VetoresMatrizes;

import java.util.Scanner;

public class Exc01 {
    public static void main(String[] args) {

        int[] vet = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int n;
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número que deseja verificar: ");
        n = sc.nextInt();

        for (int i = 0; i < vet.length; i++) {
            if (n == vet[i]) {
                System.out.println("O número " + (n) + " está localizado na posição: " + (i));
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O número " + n + " não foi encontrado.");
        }
    }
}
