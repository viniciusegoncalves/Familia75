package Colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exc01 {
    public static void main(String[] args) {

        ArrayList<String> cores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Sigite 5 cores");
        for(int i = 0; i<5; i++) {
            String cor = sc.nextLine();
            cores.add(cor);
        }

        System.out.println("Todas as cores: ");
        System.out.println(cores);

        Collections.sort(cores);

        System.out.println("Cores Ordenadas: ");
        System.out.println(cores);
    }
}
