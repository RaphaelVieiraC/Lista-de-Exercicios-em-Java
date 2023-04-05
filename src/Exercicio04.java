import javax.swing.JOptionPane;

public class Exercicio04{

   public static void main(String[]args) {
    double matematica = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual e a nota em Matemática?"));
    double portugues = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual e a nota em português?"));
    double fisica = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual e a nota em Física?"));
    double biologia = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual e a nota em Biologia?"));
    
    
    double soma = matematica + portugues + fisica + biologia;
    double media = soma/4;
    
      JOptionPane.showMessageDialog(null, "A soma da nota e  "+ soma);
      JOptionPane.showMessageDialog(null, "A media da nota e  "+ media);

   }
}