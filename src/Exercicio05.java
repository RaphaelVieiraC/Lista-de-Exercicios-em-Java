import javax.swing.JOptionPane;

public class Exercicio05{

   public static void main(String[]args) {
    double metros = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos metros"));
    double centimetros = 100;
    double multiplicacao = metros*centimetros;
      JOptionPane.showMessageDialog(null, "Quantidade em centimetros e "+ multiplicacao);

   }
}