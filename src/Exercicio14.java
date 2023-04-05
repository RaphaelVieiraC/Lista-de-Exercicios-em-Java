import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        //variaveis.
        double peso, excesso, multa;
        Scanner input = new Scanner(System.in);
        
        //Scanner.
        System.out.print("Informe o peso (em kg) dos peixes: ");
        peso = input.nextDouble();


        //Resposta ao cliente.
        if (peso > 50) {
            excesso = peso - 50;
            multa = excesso * 4.0;

            System.out.printf("Peso informado: %.2f kg%n", peso);
            System.out.printf("Limite de peso permitido: 50 kg%n");
            System.out.printf("Excesso de peso: %.2f kg%n", excesso);
            System.out.printf("Valor da multa a pagar: R$ %.2f%n", multa);
        } else {
            System.out.println("Peso dentro do limite permitido, sem multa a pagar.");
        }

        input.close();
    }

}
