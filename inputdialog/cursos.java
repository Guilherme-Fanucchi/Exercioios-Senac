package inputdialog;

import javax.swing.JOptionPane;

public class cursos {
    public static void main(String[] args) {
        //dias da semana
        Object[] cursos = {"ADM","IoT","MMD","TI"};
        //seleção dos dias da semana
        JOptionPane.showOptionDialog(null,"Escolha um Curso","Cursos",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,cursos,"TI");
        


    }
}