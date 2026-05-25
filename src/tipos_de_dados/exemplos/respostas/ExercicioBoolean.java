package exemplos.respostas;
/**
 * Leia dois números inteiros e determine:

    Se o primeiro é múltiplo do segundo // um numero é multiplo quando ele e divisivel por outro

    Se ambos são positivos

Exiba o resultado usando variáveis do tipo boolean.
*/

import java.util.Scanner;

public class ExercicioBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        boolean multiplo = (num1 % num2 == 0); 
        boolean ambosPositivos = (num1 > 0 && num2 > 0);

        System.out.println(num1 + " é múltiplo de " + num2 + "? " + multiplo);
        System.out.println("Ambos são positivos? " + ambosPositivos);

        scanner.close();
    }
}