import javax.swing.JOptionPane;

public class Exercicio16{

   public static void main(String[]args) {
    int metrosNecessarios = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos metros quadrados e necessario?"));
    //variaveis
    int tinta1litro = 3; 
    int lata = 18;
    int preço = 80;
    //Calculo
    float calculo1 = metrosNecessarios/tinta1litro;
    double calculo2 = Math.ceil(calculo1 / lata);
    double calculo3 = calculo2 * preço;

      JOptionPane.showMessageDialog(null, "Quantidade de latas necessarias "+ calculo2);
      JOptionPane.showMessageDialog(null, "O valor a pagar e  "+ calculo3);

   }
}