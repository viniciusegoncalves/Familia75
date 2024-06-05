package JavaBasico;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        float salario;
        float abono;
        float novoSalario;

        System.out.println("Digite o seu Salário: ");
        Scanner sc = new Scanner(System.in);
        salario = sc.nextFloat();

        System.out.println("Digite o Abono: ");
        abono = sc.nextFloat();

        novoSalario = salario + abono;

        System.out.println("Novo salário: " + novoSalario);
    }
}
