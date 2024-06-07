package VetoresMatrizes;

import java.util.Scanner;

public class Exc03 {
    public static void main(String[] args) {
        int mat[][] = new int[3][3];
        int diagP[] = new int[3];
        int diagS[] = new int[3];
        int i, j, nP = 0, nS = 0, somaP = 0, somaS = 0;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Digite o número da posiçao: " + i + " , " + j);
                mat[i][j] = sc.nextInt();
                if (i == j) {
                    diagP[nP] = mat[i][j];
                    nP++;
                }
                if (i + j == 2) {
                    diagS[nS] = mat[i][j];
                    nS++;
                }
            }
        }
        System.out.println("Elementos da Diagonal Principal: " + diagP[0] + " " + diagP[1] + " " + diagP[2]);
        System.out.println("Elementos da Diagonal Secundária: " + diagS[0] + " " + diagS[1] + " " + diagS[2]);
        for (int x = 0; x < diagP.length; x++) {
            somaP += diagP[x];
        }
        System.out.println("Soma dos Elementos da Diagonal Principal: " + somaP);
        for (int x = 0; x < diagP.length; x++) {
            somaS += diagS[x];
        }
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaS);
    }
}
