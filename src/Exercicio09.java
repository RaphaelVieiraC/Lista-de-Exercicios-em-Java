import javax.swing.JOptionPane;

public class Exercicio09{

   public static void main(String[]args) {
    double F = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a temperatura em Fahrenheit? "));
    double C = 5 * ((F-32) / 9);
    
      JOptionPane.showMessageDialog(null, "Temperatura em Celsius e " + C );

   }
}