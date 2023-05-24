import java.util.Scanner;

public class MetrosECentimetros {

    //Faça um programa que converta metros para centímetros.

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Digite o valor em metros: ");  // Imprimir na tela
        double metro = entrada.nextDouble();

        double centimetros = metro * 100 ;
        System.out.println(" O valor " + metro + "m equivale a " + centimetros + " cm");

    }

}
