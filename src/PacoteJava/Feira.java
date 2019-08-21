package PacoteJava;

import javax.swing.*;

public class Feira {

    public static void main(String[] args) {

        String a, st = "";
        int escolha;

       a = JOptionPane.showInputDialog(null, "Escolha uma opção:\n "
               + "1- Abacaxi \n "
               + "2- Abacate \n"
               + "3- Abobora \n "
               + "4- Chocolate \n "
               + "5- Coco \n "
               + "6- Laranja \n "
               + "7- Morango \n "
               + "8- Tangerina" + st);

        escolha = Integer.parseInt(a);

        switch (escolha) {
            case 1:st= "Abacaxi";break;
            case 2:st= "Abacate";break;
            case 3:st= "Abobora";break;
            case 4:st= "Chocolate";break;
            case 5:st= "Coco";break;
            case 6:st= "Laranja";break;
            case 7:st= "Morango";break;
            case 8:st= "Tangerina";break;
            default :st="Esta opção não existe";
        }
    
    JOptionPane.showMessageDialog(null,st);
    
    }
    

}
