package PacoteJava;
import javax.swing.*;
public class Exercicio0706 {
    public static void main(String[] args) {
        String aux = "";
    double salario = 0, salario1 = 0;  
    
        aux = JOptionPane.showInputDialog(null, "Informe o seu Salário: ");
        salario = Double.parseDouble(aux);
        
        if (salario <= 965.67){
            salario1 = salario - (salario * 8 / 100);
            JOptionPane.showMessageDialog(null, "Novo salario: " + salario1);
        }
        if (salario >= 965.68 && salario <= 1609.45){
           salario1  = salario - (salario * 9 / 100);
           JOptionPane.showMessageDialog(null, "Novo salario: " + salario1);
        }
        if (salario >= 1609.45 && salario <= 3218.90 ){
           salario1  = salario - (salario * 11 / 100);
           JOptionPane.showMessageDialog(null, "Novo salario: " + salario1);
        }
        
   
    }
}
