package Colections;

import java.util.HashSet;
import java.util.Scanner;

public class Exc04 {
    public static void main(String[] args) {
        HashSet<Integer> myList = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int myNum, count = 0;
        boolean find = false;
        myList.add(2);
        myList.add(5);
        myList.add(1);
        myList.add(3);
        myList.add(4);
        myList.add(9);
        myList.add(7);
        myList.add(8);
        myList.add(10);
        myList.add(6);

        System.out.println("Digite o  número que deseja encontrar: ");
        myNum = sc.nextInt();
        for (int i : myList) {
            if (myNum == i) {
                System.out.println("O número " + myNum + " está localizado na posição: " + count);
                find = true;
                break;
            }
            count++;
        }
        if (!find) {
            System.out.println("O número " + myNum + " não foi encontrado!");
        }
    }
}
