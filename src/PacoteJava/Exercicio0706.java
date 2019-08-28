package PacoteJava;
import javax.swing.*;
public class Exercicio0706 {
    public static void main(String[] args) {
        String aux = "";
    double salario = 0, salario1 = 0,aliquota = 0,desconto = 0;
        try{
        aux = JOptionPane.showInputDialog(null, "Informe o seu Salário: ");
        salario = Double.parseDouble(aux);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Favor inserir somente números");
        }
        
        if (salario <= 965.67){
            salario1 = salario - (salario * 8.0 / 100);
            aliquota = 8.0;
            desconto = salario - salario1;
        }
        if (salario >= 965.68 && salario <= 1609.45){
           salario1  = salario - (salario * 9.0 / 100);
           aliquota = 9.0;
           desconto = salario - salario1;
        }
        if (salario >= 1609.45 && salario <= 3218.90 ){
           salario1  = salario - (salario * 11.0 / 100);
           aliquota = 11.0;
           desconto = salario - salario1;
        }
        if (salario > 3218.90){
            desconto = 354.07;
            salario1 = salario - desconto;
        }
         if (salario < 465.00){
            JOptionPane.showMessageDialog(null,"Valor inválido!");
            System.exit(0);
        }
   JOptionPane.showMessageDialog(null, "Salário: "+ salario + "\n Alíquota: " + aliquota +"\n Desconto: " + desconto + "\n Salario liquido: " + salario1);
   
    }
    
}
