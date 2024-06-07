package Condicionais;

import java.util.Scanner;

public class Exc06{
    public static void main(String[] args) {
        String nome;
        int cargo;
        float salario;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do colaborador: ");
        nome = sc.nextLine();

        System.out.println("Cargo: ");
        cargo = sc.nextInt();

        System.out.println("Salário: R$ ");
        salario = sc.nextFloat();


        switch (cargo) {
            case 1:
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: Gerente");
                System.out.printf("Salário: R$ %.2f", salario + salario*0.1);
                break;
            case 2:
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: Vendedor");
                System.out.printf("Salário: R$ %.2f", salario + salario*0.07);
                break;
            case 3:
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: Supervisor");
                System.out.printf("Salário: R$ %.2f", salario + salario*0.09);
                break;
            case 4:
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: Motorista");
                System.out.printf("Salário: R$ %.2f", salario + salario*0.06);
                break;
            case 5:
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: Estoquista");
                System.out.printf("Salário: R$ %.2f", salario + salario*0.05);
                break;
            case 6:
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: Técnico de TI");
                System.out.printf("Salário: R$ %.2f", salario + salario*0.08);
                break;
            default:
                System.out.println("Código Inválido");
                break;
        }
    }
}
