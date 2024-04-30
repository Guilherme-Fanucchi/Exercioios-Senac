import java.util.Scanner;
 
public class estrutura_de_repetiçao {
    public static void main(String[] args)
    {
        try (Scanner ler = new Scanner(System.in))
        {
            int  n,i;
            System.out.println("Digite um numero inteiro");
             n = ler.nextInt();
             
            for (i = 0; i <= n ; i++)
            {
                if (i % 2 == 0)
                {
                   
                System.out.println("Os numeros pares de 1 até " + n + " são: " + i);
                }
            }    
           
 
        }      
    }
}
