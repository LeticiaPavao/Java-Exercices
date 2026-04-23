/**
 * Faça um programa que leia dois números short e calcule a potência do primeiro elevado ao 
 * segundo, usando Math.pow(). Exiba o resultado como double.
 */

import java.util.Scanner;

public class ExercicioShort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base (short): ");
        short base = scanner.nextShort();

        System.out.print("Digite o expoente (short): ");
        short expoente = scanner.nextShort();

        double potencia = Math.pow(base, expoente);

        System.out.println(base + " elevado a " + expoente + " = " + potencia);

        scanner.close();
    }
}