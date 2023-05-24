import java.util.Scanner;

public class AnteeSuce {

    //Faça um programa que leia um número inteiro e imprima o seu antecessor e seu sucessor.

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print( "Insira um número inteiro: "); // Imprimir
        int num = entrada.nextInt();                    // Inserir o valor

        int antes = num - 1 ;                          // Calcular o antecessor
        System.out.println(" O antecessor deste número é: " + antes); // Imprimir o valor do antecessor

        int depois = num + 1 ;                        // calcular o sucessor
        System.out.println( " O sucessor deste número é: " + depois);  // imprimir o valor do sucessor
    }
}
