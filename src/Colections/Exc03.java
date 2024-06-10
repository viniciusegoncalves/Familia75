package Colections;

import java.util.HashSet;
import java.util.Scanner;

public class Exc03 {
    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10 ; i++) {
            int val = sc.nextInt();
            mySet.add(val);
        }

        for(Integer i : mySet){
            System.out.println(i);
        }
    }
}
