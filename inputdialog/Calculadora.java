package inputdialog;
 /*
  @Guilherme Lemos Fanucchi
  */
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        
         //Métodos
        Object [] metodos = {"Adição","Subtração","Divisão","Multiplicação"};
        String metodo;
        //seleção dos Métodos
        metodo = (String)  JOptionPane.showInputDialog(null,"Escolha um Método","Métodos",1,null,metodos,metodos[0]);
        //ifs
    
        //soma
         if (metodo == metodos[0]) {
          //opção do numero 1
          String num1 = JOptionPane.showInputDialog(null, "Digite um nmero inteiro: ","Adição ",3);
          //opção do numero 2
          String num2 = JOptionPane.showInputDialog(null,"Digite um número inteiro: ","Adição ",3);
           //transformando variavel na resposta
          int n1 = Integer.parseInt(num1);
          int n2 = Integer.parseInt(num2);
           //soma
          int soma = n1 + n2;
          //Amostra da soma
          JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
   
      }

      //sub
      else if (metodo == metodos[1]) {
          //opção do numero 1
          String num3 = JOptionPane.showInputDialog(null,"Digite um número inteiro: ","Subtração ",3);
          //opção do numero 2
          String num4 = JOptionPane.showInputDialog(null, "Digite um número inteiro: ","Subtração ",3);
           //transformando variavel na resposta
          int n3 = Integer.parseInt(num3);
          int n4 = Integer.parseInt(num4);
           //soma
          int sub = n3 - n4;
          //Amostra da sub
          JOptionPane.showMessageDialog(null, "A subtração dos números é: " + sub);
      }

      //div
      else if (metodo == metodos[2]) {
          //opção do numero 1
          String num5 = JOptionPane.showInputDialog(null,"Digite um nmero inteiro: ", "Divisão ",3);
          //opção do numero 2
          String num6 = JOptionPane.showInputDialog(null,"Digite um número inteiro: ", "Divisão ",3);
           //transformando variavel na resposta
          int n5 = Integer.parseInt(num5);
          int n6 = Integer.parseInt(num6);
          //erro caso escolha 0
          if(n5 == 0)
          {
            JOptionPane.showMessageDialog(null, "Um número sempre dividido por zero é zero", "Erro",0);
            return;
          }
           //soma
          int div = n5 / n6;
          //Amostra da div
          JOptionPane.showMessageDialog(null, "A Divisão dos números é: " + div);
      }

      //Mult
       else if (metodo == metodos[3]) {
          //opção do numero 1
          String num7 = JOptionPane.showInputDialog(null, "Digite um nmero inteiro: ",  "Multiplicação ",3);
          //opção do numero 2
          String num8 = JOptionPane.showInputDialog(null, "Digite um número inteiro: ", "Multiplicação ",3);
           //transformando variavel na resposta
          int n7 = Integer.parseInt(num7);
          int n8 = Integer.parseInt(num8);
           //soma
          int mut = n7 * n8;
          //Amostra da mult
          JOptionPane.showMessageDialog(null, "A Multiplicação dos números é: " + mut);
      }
    } 
}
