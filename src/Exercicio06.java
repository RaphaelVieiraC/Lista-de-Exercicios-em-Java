import javax.swing.JOptionPane;

public class Exercicio06{

   public static void main(String[]args) {
    double raio = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o raio do circulo"));
    double pi = 3.14;
    double multiplicacao = raio*raio*pi;
      JOptionPane.showMessageDialog(null, "A area do circulo e "+ multiplicacao);

   }
}