import java.util.Scanner;

public class Exercicio12 {
   public static void main(String[] args) {

      //Scanner
      Scanner input = new Scanner(System.in);

      //Funções.
      System.out.print("Digite sua altura em metros: ");
    
      //Variavel.
      double altura, calculo;
      
      //Funções
      altura = input.nextDouble();  
      calculo = ((72.7*altura) - 58);
      
      //Resposta ao cliente.
      System.out.println("Seu peso ideal e. " + calculo);

      input.close();
   }
}