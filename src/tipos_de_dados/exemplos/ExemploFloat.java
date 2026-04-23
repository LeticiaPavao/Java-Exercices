import java.util.Scanner;

public class ExemploFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número (float): ");
        float a = scanner.nextFloat();
        
        System.out.print("Digite o segundo número (float): ");
        float b = scanner.nextFloat();
        
        float soma = a + b;
        float subtracao = a - b;
        float multiplicacao = a * b;
        float divisao = a / b;
        float media = (a + b) / 2;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Média: " + media);
        
        scanner.close();
    }
}

/**
 * 
 * Exercício
Leia três notas float e calcule a média ponderada com pesos 2, 3 e 5, 
respectivamente. Fórmula: (n1*2 + n2*3 + n3*5) / (2+3+5).
 */