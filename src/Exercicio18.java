import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        
    Scanner input = new Scanner (System.in);


//Variaveis
double tamanhoArquivo;
double taxaDownload = 100;
double tempo;

System.out.print ("Informe o tamanho do arquivo para download:");
tamanhoArquivo = input.nextDouble();


tempo = Math.ceil(tamanhoArquivo / taxaDownload);


System.out.printf("O tempo para o termino do download e: " + tempo + " minutos" );






input.close();
    } 
}
