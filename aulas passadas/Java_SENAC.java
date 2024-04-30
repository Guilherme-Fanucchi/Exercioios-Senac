
import java.util.Scanner;

public class Java_SENAC {

    public static void main(String[] args) 
     {
        // Definindo o preço por unidade de refrigerante
        double precoPorUnidade = 4.99;
 
        // Definindo o preço por unidade com desconto para compras a partir de 6 unidades
        double precoPorUnidadeComDesconto = 4.19;
 
        // Inicializando o scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);
 
        // Solicitando a quantidade desejada de refrigerantes
        System.out.println("Quantos refrigerantes de 600ml você deseja comprar?");
        int quantidade = ler.nextInt();
 
        // Calculando o valor total com base na quantidade adquirida
        double valorTotal;
 
        if (quantidade < 6)
        {
            valorTotal = precoPorUnidade * quantidade;
        }
        else
        {
            valorTotal = precoPorUnidadeComDesconto * quantidade;
        }
 
        // Exibindo o resultado
        System.out.println("Quantidade de refrigerantes: " + quantidade);
        System.out.printf("Valor total a ser pago: %.2f R$ ", valorTotal);
        
        // Fechando o scanner
        ler.close();
    }
}








