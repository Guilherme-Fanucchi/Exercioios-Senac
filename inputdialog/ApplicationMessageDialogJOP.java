package inputdialog;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

public class ApplicationMessageDialogJOP {
    public static void main(String[] args) {

        ImageIcon java = new ImageIcon("C:\\Users\\guilherme.lfanucchi\\OneDrive\\VS Code\\Java\\mesagem\\images-removebg-preview.png");
       
        JOptionPane.showMessageDialog(null,
        "olá!",
        "OPA",
         JOptionPane.INFORMATION_MESSAGE, java);

    }
}
