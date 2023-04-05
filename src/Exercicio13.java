import java.util.Scanner;

public class Exercicio13 {
   public static void main(String[] args) {

      //Scanner
      Scanner input = new Scanner(System.in);

      //Variavel.
      double altura, calculo1,calculo2;
      
   

      //Captura.

      System.out.println("Digite se e homem ou mulher: ");
      String resposta = input.nextLine();

      boolean homem = resposta.equalsIgnoreCase("homem");
      boolean mulher = resposta.equalsIgnoreCase("mulher");
   
      System.out.println("Digite sua altura em metros: ");
      altura = input.nextDouble();  

      
      //Funções
      calculo1 = ((72.7*altura) - 58);
      calculo2 = ((62.1*altura) - 44.7); 


 //Resposta ao cliente.
       if(homem){
      System.out.println("Seu peso ideal e. " + calculo1);
   }  

      else if(mulher) {
      System.out.println("Seu peso ideal e. " + calculo2);
   }
     
      

      input.close();
   }
}