package Condicionais;

import java.util.Scanner;

public class Exc05 {
    public static void main(String[] args) {
        int codigoProduto, qtd;
        double preco;
        String produto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Código do produto: ");
        codigoProduto = sc.nextInt();

        System.out.println("Quantidade: ");
        qtd = sc.nextInt();

        switch (codigoProduto) {
            case 1:
                produto = "Cachorro Quente";
                preco = 10.00;
                System.out.println("Produto: " + produto);
                System.out.println("Valor total: R$ " + (qtd * preco));
                break;
            case 2:
                produto = "X-Salada";
                preco = 15.00;
                System.out.println("Produto: " + produto);
                System.out.println("Valor total: R$ " + (qtd * preco));
                break;
            case 3:
                produto = "X-Bacon";
                preco = 18.00;
                System.out.println("Produto: " + produto);
                System.out.println("Valor total: R$ " + (qtd * preco));
                break;
            case 4:
                produto = "Bauru";
                preco = 12.00;
                System.out.println("Produto: " + produto);
                System.out.println("Valor total: R$ " + (qtd * preco));
                break;
            case 5:
                produto = "Refrigerante";
                preco = 8.00;
                System.out.println("Produto: " + produto);
                System.out.println("Valor total: R$ " + (qtd * preco));
                break;
            case 6:
                produto = "Suco de laranja";
                preco = 13.00;
                System.out.println("Produto: " + produto);
                System.out.println("Valor total: R$ " + (qtd * preco));
                break;
            default:
                System.out.println("Código Inválido");
                break;
        }
    }
}
