import javax.swing.JOptionPane;

public class Exercicio07{

   public static void main(String[]args) {
   
    double largura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o raio do largura"));
    double calculo = largura*largura;  
    double multiplicacao = calculo*calculo; 
    double area2 = multiplicacao*2;
   
    JOptionPane.showMessageDialog(null, "O dobro da area do quadrado e  "+ area2);

   }
}