package inputdialog;

import javax.swing.JOptionPane;

public class AplicationInputDialog {
    public static void main(String[] args) {
        //dias da semana
        Object[] dias = {"seg","ter","quar","quin","sex"};
        //seleção dos dias da semana
        JOptionPane.showInputDialog(null,"Escolha um Dia","DIAS",1, null, dias, dias[3]);
        


    }
}
