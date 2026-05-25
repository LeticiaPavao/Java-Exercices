package exemplos;

import java.util.Scanner;

public class ExemploDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número (double): ");
        double a = scanner.nextDouble();
        
        System.out.print("Digite o segundo número (double): ");
        double b = scanner.nextDouble();
        
        double soma = a + b;
        double produto = a * b;
        double quociente = a / b;
        double raizSoma = Math.sqrt(soma);
        
        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
        System.out.println("Quociente: " + quociente);
        System.out.println("Raiz quadrada da soma: " + raizSoma);
        
        scanner.close();
    }
}

/**
 * Exercício
Leia os valores dos dois catetos de um triângulo retângulo (double) e calcule 
a hipotenusa usando a fórmula: hip = Math.sqrt(cateto1*cateto1 + cateto2*cateto2).
 */