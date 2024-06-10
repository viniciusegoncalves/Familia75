package FilasPilhas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exc01 {
    public static void main(String[] args) {
        Queue<String> chegadaCLientes = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("************************************************");
            System.out.println("1 - Adicionar Cliente na Fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retirar Cliente da fila");
            System.out.println("0 - Sair");
            System.out.println("************************************************");
            System.out.println("Entre com a opçao desejada: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.println("Digite um nome: ");
                    String pessoa = sc.nextLine();
                    chegadaCLientes.add(pessoa);
                    System.out.println("Cliente adicionado: " + pessoa);
                    break;
                case 2:
                    System.out.println(chegadaCLientes);
                    break;
                case 3:
                    if(chegadaCLientes.size() == 0) {
                        System.out.println("A Fila está vazia!!");
                        break;
                    }else {
                        chegadaCLientes.remove();
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o programa!");
                    break;
                default:
                    System.out.println("Opçao invalida!");
                    break;
            }
        } while (op !=0);
    }
}
