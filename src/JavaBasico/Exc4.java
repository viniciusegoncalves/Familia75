package JavaBasico;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        float n1,n2,n3,n4,diferenca;
        Scanner sc = new Scanner(System.in);

        System.out.println("numero1: ");
        n1 = sc.nextFloat();

        System.out.println("numero2: ");
        n2 = sc.nextFloat();

        System.out.println("numero3: ");
        n3 = sc.nextFloat();

        System.out.println("numero4: ");
        n4 = sc.nextFloat();

        diferenca = (n1 * n2) - (n3 * n4);

        System.out.printf("Diferença: %.1f", diferenca);
    }
}
