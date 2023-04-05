import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        //Variaveis.
        Double salarioBruto,salarioLiquido,horasMes,salarioHora;
        Scanner input = new Scanner (System.in);

        //Funções.
        System.out.print ("Informe o Valor por Hora recebido:");
        salarioHora = input.nextDouble();

        System.out.print ("Informe quantas horas por mês você trabalha:");
        horasMes = input.nextDouble();

        salarioBruto = salarioHora*horasMes;
        
        double IR,INSS,Sindicato;
        IR = salarioBruto * 0.11;
        INSS = salarioBruto * 0.08;
        Sindicato = salarioBruto * 0.05;

        salarioLiquido = salarioBruto - IR - INSS - Sindicato;

        System.out.printf("Salario Bruto:R$" + salarioBruto);
        System.out.printf("IR:R$" + IR);
        System.out.printf("INSS:R$" + INSS);
        System.out.printf("Sindicato:R$" + Sindicato);
        System.out.printf("Salario Liquido:R$" + salarioLiquido);

        input.close();
    }
    
}
