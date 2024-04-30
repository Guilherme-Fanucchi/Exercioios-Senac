import java.util.Scanner;

public class lista {
    public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);        
    int n = ler.nextInt();

    for (int i = 0; i < n; i++) 
    {
        System.out.println("i = " + i);
    }
    ler.close();
    }

   
}
