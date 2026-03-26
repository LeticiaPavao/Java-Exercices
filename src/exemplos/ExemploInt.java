import java.util.Scanner;

public class ExemploInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número (int): ");
        int a = scanner.nextInt();
        
        System.out.print("Digite o segundo número (int): ");
        int b = scanner.nextInt();
        
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;
        double raiz = Math.sqrt(a);   // raiz quadrada do primeiro
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);
        System.out.println("Raiz quadrada do primeiro: " + raiz);
        
        scanner.close();
    }
}

/**
 * Exercício
Escreva um programa que leia três números inteiros e mostre:

    A média aritmética

    O maior valor

    O menor valor
 */