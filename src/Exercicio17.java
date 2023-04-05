import java.util.Scanner;

public class Exercicio17{

   public static void main(String[]args) {
      Scanner input = new Scanner (System.in);

          //variaveis
          double tinta1litro = 6; 
          double lata = 18;
          double precoLata = 80;
          double galao = 3.6;
          double precoGalao = 25;
          double metrosNecessarios;
          double tintaNecessaria;
          double  quantidadeLatas;
          double valorLatas;
          double quantidadeGaloes;
          double valorGalao;
          
   
   //Captura.      
   System.out.print ("Informe a quantidade em metros quadrados: ");
        metrosNecessarios = input.nextDouble();
    
    
    //Calculo.
      tintaNecessaria = metrosNecessarios / tinta1litro;

    //lata.
      quantidadeLatas = Math.ceil(tintaNecessaria / lata);
      valorLatas = precoLata * quantidadeLatas;

    //Galões.
      quantidadeGaloes = Math.ceil(tintaNecessaria / galao);
      valorGalao = precoGalao * quantidadeGaloes;
    
    //Lata e Galões.

    


    //Resposta ao cliente
      System.out.printf("Quantidade de latas necessarias " + quantidadeLatas + "Valor:R$" + valorLatas);
      
      System.out.printf("Quantidade de galões necessarias " + quantidadeGaloes + "Valor:R$" + valorGalao);
      

      input.close();
   }
}