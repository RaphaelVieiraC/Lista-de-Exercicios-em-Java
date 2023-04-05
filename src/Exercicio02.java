import java.util.Scanner;

public class Exercicio02{

   public static void main(String[]args) {
     Scanner numero = new Scanner(System.in);
      String str;
       System.out.println("Digite um Número");
        str = numero.nextLine();
         System.out.println("O número informado foi  " + str);

     numero.close();

   }
}