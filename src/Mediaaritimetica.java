import java.util.Scanner;

public class Mediaaritimetica {
    //Faça um programa que receba 4 notas bimestrais e mostre a média aritmética.

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: "); // Imprimir
        double primeira = entrada.nextDouble();             // Inserir a primeira nota

        System.out.println("Digite a sua segunda nota: ");  // Imprimir
        double segunda = entrada.nextDouble();              // Inserir a segunda nota

        System.out.println("Digite a sua terceira nota: ");  // Imprimir
        double terceira = entrada.nextDouble();              // Inserir a terceira nota

        System.out.println("Digite a sua quarta nota: ");    // Imprimir
        double quarta = entrada.nextDouble();                // Inserir a quarta nota

        double media = (primeira + segunda + terceira + quarta)/4;       // Calcular a média aritmética
        System.out.println("A sua média aritimética final é: " + media); // Imprimir a média aritmética


    }
}
