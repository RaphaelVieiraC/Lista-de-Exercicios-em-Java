import javax.swing.JOptionPane;

public class Exercicio10{

   public static void main(String[]args) {
    double C = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a temperatura em Celsius? "));
    double F = ((C * 9/5)+32);
    
      JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit e " + F );

   }
}