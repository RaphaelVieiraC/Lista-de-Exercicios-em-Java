import javax.swing.JOptionPane;

public class Exercicio08{

   public static void main(String[]args) {
    double valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto ganha por hora?"));
    double hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas horas trabalhadas no mês?"));
    double Calculo = valor*hora;
    
      JOptionPane.showMessageDialog(null, "Valor do salario "+ Calculo);

   }
}