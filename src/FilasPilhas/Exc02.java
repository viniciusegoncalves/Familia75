package FilasPilhas;


import java.util.Scanner;
import java.util.Stack;

public class Exc02 {
    public static void main(String[] args) {
        Stack<String> livros = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("************************************************");
            System.out.println("1 - Adicionar Livro na pilha");
            System.out.println("2 - Listar todos os Livros");
            System.out.println("3 - Retirar Livro da pilha");
            System.out.println("0 - Sair");
            System.out.println("************************************************");
            System.out.println("Entre com a opçao desejada: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Digite o nome de um livro: ");
                    String name = sc.nextLine();
                    livros.push(name);
                    System.out.println("Livro adicionado: " + name);
                    break;
                case 2:
                    System.out.println(livros);
                    break;
                case 3:
                    if (livros.size() == 0) {
                        System.out.println("A pilha está vazia!");
                        break;
                    } else {
                        livros.pop();
                        System.out.println("Um livro foi retirado da pilha!");
                    }
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o programa!");
                    break;
                default:
                    System.out.println("Opçao invalida!");
                    break;
            }
        } while (op != 0);
    }
}
