package Condicionais;

import java.util.Scanner;

public class Exc03 {
    public static void main(String[] args) {
        int age;
        String name;
        boolean firstTime;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do doador: ");
        name = sc.nextLine();

        System.out.println("Digite a idade do doador: ");
        age = sc.nextInt();

        System.out.println("Primeira doação de sangue? ");
        firstTime = sc.nextBoolean();

        if(age >= 18 && age <= 69){
            if(age >= 60 && !firstTime) {
                System.out.println(name + " está apto para doar sangue!");
            } else {
                System.out.println(name + " não está apto para doar sangue!");
            }
        } else {
            System.out.println(name + " não está apto para doar sangue!");
        }
    }
}
