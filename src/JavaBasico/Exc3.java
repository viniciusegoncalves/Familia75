package JavaBasico;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
        Scanner sc = new Scanner(System.in);

        System.out.println("Salário Bruto: ");
        salarioBruto = sc.nextFloat();

        System.out.println("Adicional Noturno: ");
        adicionalNoturno = sc.nextFloat();

        System.out.println("Horas extras: ");
        horasExtras = sc.nextFloat();

        System.out.println("Descontos: ");
        descontos = sc.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno +(horasExtras * 5) - descontos;
        System.out.printf("Salário  Liquido: %.2f", salarioLiquido);

    }
}
