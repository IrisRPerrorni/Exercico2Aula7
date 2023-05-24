import java.util.Scanner;

public class conversaoC {
    //Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
    // C = (°F - 32)/1,8.

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println( " Insira a temperatura em graus Fahrenheit: ");
        double fahr = entrada.nextDouble();

        double celsius = (fahr - 32) / 1.8 ;
        System.out.printf(" A temperatura em graus Celsius é: %.2f " , celsius);




    }
}
