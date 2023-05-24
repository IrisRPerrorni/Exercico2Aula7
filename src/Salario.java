import java.util.Scanner;

public class Salario {

    //Faça um Programa que recebe o quanto você ganha por hora e o número de horas trabalhadas no mês.
    // Calcule e mostre o total do seu salário no referido mês.

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Insira o valor que você recebe por hora R$:  ");  // Imprimir
        double valor = entrada.nextDouble();                                   // Entrada do valor do R$ em horas

        System.out.println(" Insira as horas trabalhadas por mês: ");         // Imprimir
        double hora = entrada.nextDouble();                                   // Entrada das horas trabalhadas

        double salario = valor * hora;                                       // Calculo do salario do mês
        System.out.printf(" O seu salário nesse mês foi R$ %.2f " , salario);      // Imprimir o valor do salario mensal
    }
}
