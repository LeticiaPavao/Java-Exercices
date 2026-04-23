/**
 * Leia um caractere e verifique se ele é uma vogal (maiúscula ou minúscula). 
 * Dica: compare com 'a', 'e', 'i', 'o', 'u' e as versões maiúsculas.
 */

import java.util.Scanner;

public class ExercicioChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char letra = scanner.next().charAt(0);

        boolean vogal = (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                        letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U');

        System.out.println("O caractere '" + letra + "' é vogal? " + vogal);

        scanner.close();
    }
}