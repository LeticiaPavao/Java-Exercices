package exemplos;

import java.util.Scanner;

public class ExemploLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número (long): ");
        long a = scanner.nextLong();
        
        System.out.print("Digite o segundo número (long): ");
        long b = scanner.nextLong();
        
        long soma = a + b;
        long produto = a * b;
        long diferenca = a - b;
        
        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
        System.out.println("Diferença: " + diferenca);
        
        scanner.close();
    }
}

/**
 * Exercício
Crie um programa que leia um valor em segundos (tipo long) e converta para horas, 
minutos e segundos. 
Exemplo: 3600 segundos → 1 hora, 0 minuto, 0 segundos.
 */