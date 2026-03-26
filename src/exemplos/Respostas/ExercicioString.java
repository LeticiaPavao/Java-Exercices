/**
 *  Leia uma palavra (String) e exiba:

    O primeiro caractere

    O último caractere

    O número total de caracteres
 */

import java.util.Scanner;

public class ExercicioString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        char primeiro = palavra.charAt(0);
        char ultimo = palavra.charAt(palavra.length() - 1);
        int tamanho = palavra.length();

        System.out.println("Primeiro caractere: " + primeiro);
        System.out.println("Último caractere: " + ultimo);
        System.out.println("Número de caracteres: " + tamanho);

        scanner.close();
    }
}