package exemplos.respostas;
/*
 * Crie um programa que leia um valor em segundos (tipo long) e converta para horas, 
 * minutos e segundos. 
 * 
 * Exemplo: 3665 segundos → 1 hora, 1 minuto, 5 segundos.
 */

import java.util.Scanner;

public class ExercicioLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de segundos: ");
        long totalSegundos = scanner.nextLong();

        long horas = totalSegundos / 3600;
        long resto = totalSegundos % 3600;
        long minutos = resto / 60;
        long segundos = resto % 60;

        System.out.println(totalSegundos + " segundos = " +
                            horas + " hora(s), " +
                            minutos + " minuto(s), " +
                            segundos + " segundo(s)");

        scanner.close();
    }
}