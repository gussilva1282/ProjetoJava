package PacoteJava;

import javax.swing.*;

public class Exercicio0707 {
    public static void main(String[] args) {
        String auxp = " ", auxa = " ";
        double peso = 0, altura = 0, imc = 0;
        try {
        auxp = JOptionPane.showInputDialog(null, "Informe o seu peso: ");
        auxp = auxp.replace(",",".");
        peso = Double.parseDouble(auxp);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Favor inserir somente numeros!");
        } 
            if (peso <= 0.5){
                JOptionPane.showMessageDialog(null,"Valor inválido!");
                System.exit(0);
        }
        try {
        auxa = JOptionPane.showInputDialog(null, "Informe a sua altura: ");
        auxa = auxa.replace(",",".");
        altura = Double.parseDouble(auxa);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Favor inserir somente numeros!");
        }     
        if (altura <= 0.1){
                JOptionPane.showMessageDialog(null,"Valor inválido!");
                System.exit(0);
        }
        imc = (peso / (altura*altura));
        
        if (imc < 18.5){
            JOptionPane.showMessageDialog(null,"Seu IMC é: " + imc + " \n Excesso de Magreza!");
        }
        if(imc >= 18.5 && imc <= 25){
            JOptionPane.showMessageDialog(null,"Seu IMC é: " + imc + "\n Peso normal");
        }
        if(imc >= 25 && imc <= 30){
            JOptionPane.showMessageDialog(null,"Seu IMC é: " + imc + "\n Excesso de peso!");
        }
        if(imc >= 30 && imc <= 35){
            JOptionPane.showMessageDialog(null,"Seu IMC é: " + imc + "\n Obesidade (Grau I)");
        }
        
        if(imc >= 35 && imc <= 40){
            JOptionPane.showMessageDialog(null,"Seu IMC é: " + imc + "\n Obesidade (Grau II)");
        }
       if(imc > 40){
            JOptionPane.showMessageDialog(null,"Seu IMC é: " + imc + "\n Obesidade (Grau III)");
        }
    }

}
