package inputdialog;

import javax.swing.JOptionPane;

public class Soma 
{
 
    public static void main(String[] args) {
        //opção do numero 1
       String num1 = JOptionPane.showInputDialog(null,
       "Digite um nmero inteiro: ",
       "Adição ",3);
       //opção do numero 2
       String num2 = JOptionPane.showInputDialog(null,
       "Digite um número inteiro: ",
       "Adição ",3);
        //transformando variavel na resposta
       int n1 = Integer.parseInt(num1);
       int n2 = Integer.parseInt(num2);
        //soma
       int soma = n1 + n2;
       //Amostra da soma
       JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);

    }

}

