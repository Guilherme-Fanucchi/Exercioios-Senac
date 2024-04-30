// criar pasta com o mesmo nome
package inputdialog;

import javax.swing.JOptionPane;

public class InputDialog {
 
    public static void main(String[] args) {
        // escolha do curso
        String nome = JOptionPane.showInputDialog(null,"Digite seu nome: ","Cadastro",1);
        JOptionPane.showMessageDialog(null,"Curso escolhdo = " + nome);


    }

}
