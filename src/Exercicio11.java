import javax.swing.JOptionPane;

public class Exercicio11{

   public static void main(String[]args) {
   //Variaveis.
      double inteiro1,inteiro2,real;

   //Funções.
      inteiro1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero em inteiro "));
      inteiro2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe outro numero inteiro "));
      real = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero real "));
   //Variaveis.
      double quest1,quest2,quest3;

   //Funções. 
   //O produto do dobro do primeiro com metade do segundo.
      quest1 = ((inteiro1 * 2)+ inteiro2/2);   
   
   //A soma do triplo do primeiro com o terceiro.
      quest2 = ((inteiro1 * 3)+ real);

   //O terceiro elevado ao cubo.
      quest3 = (real*real*real);

   //Respostas.
      JOptionPane.showMessageDialog(null, "O produto do dobro do primeiro com metade do segundo.  "+ quest1);
      JOptionPane.showMessageDialog(null, "A soma do triplo do primeiro com o terceiro. "+ quest2);
      JOptionPane.showMessageDialog(null, "O terceiro elevado ao cubo.  "+ quest3);

   }
}