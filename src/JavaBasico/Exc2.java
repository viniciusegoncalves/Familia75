package JavaBasico;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        float nota1,nota2,nota3,nota4, resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1: ");
        nota1 = sc.nextFloat();
        System.out.println("Nota 2: ");
        nota2 = sc.nextFloat();
        System.out.println("Nota 3: ");
        nota3 = sc.nextFloat();
        System.out.println("Nota 4: ");
        nota4 = sc.nextFloat();

        resultado = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.printf("Média final: %.1f", resultado);
    }
}
