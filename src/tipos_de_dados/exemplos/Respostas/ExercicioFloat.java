/**
 * Leia três notas float e calcule a média ponderada com 
 * pesos 2, 3 e 5, respectivamente. 
 * Fórmula: (n1*2 + n2*3 + n3*5) / (2+3+5).
 * 
 * media ponderada significa que cada nota tem um peso diferente de 1 para o calculo da media
 */

import java.util.Scanner;

public class ExercicioFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota (float): ");
        float n1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota (float): ");
        float n2 = scanner.nextFloat();

        System.out.print("Digite a terceira nota (float): ");
        float n3 = scanner.nextFloat();

        float mediaPonderada = (n1 * 2 + n2 * 3 + n3 * 5) / (2 + 3 + 5);

        System.out.println("Média ponderada: " + mediaPonderada);

        scanner.close();
    }
}