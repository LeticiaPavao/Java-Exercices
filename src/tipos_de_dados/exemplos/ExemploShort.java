package exemplos;

import java.util.Scanner;

public class ExemploShort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número (short): ");
        short a = scanner.nextShort();
        
        System.out.print("Digite o segundo número (short): ");
        short b = scanner.nextShort();
        
        int soma = a + b;
        int produto = a * b;
        int divisaoInteira = a / b;   // divisão inteira
        int resto = a % b;
        
        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
        System.out.println("Divisão inteira: " + divisaoInteira);
        System.out.println("Resto: " + resto);
        
        scanner.close();
    }
}

/**
 * Exercício
Faça um programa que leia dois números short e calcule a potência do primeiro elevado ao 
segundo, usando Math.pow(). Exiba o resultado como double.
 */