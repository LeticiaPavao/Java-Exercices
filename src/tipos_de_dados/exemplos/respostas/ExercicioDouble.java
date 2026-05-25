package exemplos.respostas;
/**
 * Leia os valores dos dois catetos de um triângulo retângulo (double) e calcule a hipotenusa 
 * usando a fórmula: hip = Math.sqrt(cateto1*cateto1 + cateto2*cateto2).
 * 
 * formula da hipotenusa: raiz quadrada de (cateto1)^2 + (cateto2)^2
 */

import java.util.Scanner;

public class ExercicioDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Digite o valor do segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        System.out.println("Hipotenusa: " + hipotenusa);

        scanner.close();
    }
}