import javax.swing.JOptionPane;

public class Exercicio03{

   public static void main(String[]args) {
    int N1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para o calculo de soma"));
    int N2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu segundo número"));

    
    int soma = N1 + N2; 

      JOptionPane.showMessageDialog(null, "A soma e  "+ soma);

   }
}