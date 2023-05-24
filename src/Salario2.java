import java.util.Scanner;

public class Salario2 {
    //Faça um Programa que receba o quanto você ganha por hora e o número de horas trabalhadas no mês.
    //Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê respectivamente:
    //Salário bruto.
    //Quanto pagou ao INSS.
    //Quanto pagou ao sindicato.
    //Qual o salário líquido do funcionário.

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Insira o valor que você recebe por hora R$:  ");  // Imprimir
        double valor = entrada.nextDouble();                                   // Entrada do valor do R$ em horas

        System.out.println(" Insira as horas trabalhadas por mês: ");         // Imprimir
        double hora = entrada.nextDouble();                                   // Entrada das horas trabalhadas

        double salario = valor * hora;                                       // Calcular o valor do salario
        System.out.printf(" O seu salário bruto é R$ %.2f " , salario);      // imprimir o valor do salario bruto

        System.out.println(" ");                                             // pular linha

        double imposto = salario * 0.11;                                     // calculo do imposto de renda
        System.out.printf(" Valor descontado referente ao imposto de renda R$: %.2f " , imposto ); // imprimir o valor do imposto de renda

        System.out.println(" ");                                             // pular linha

        double inss = salario * 0.08;                                        // calculo do INSS
        System.out.printf( " Valor descontado referente ao INSS R$: %.2f " , inss);    // Imprimir o valor do INSS

        System.out.println(" ");                                          // pular linha

        double sindicato = salario * 0.05 ;                               // calcular o valor do sindicato
        System.out.printf( " Valor descontado referente ao sindicato R$: %.2f " , sindicato); // imprimir o valor do sindicato

        System.out.println(" ");                                       // pular linha

        double saliq = salario - imposto - inss - sindicato ;           // calcular o valor do salario liquido
        System.out.printf(" O salario líguido corresponde a R$: %.2f " , saliq); // imprimir o valor do salario liquido


    }

}
