package exemplos.respostas;
/**
 *  Escreva um programa que leia três números inteiros e mostre:

    A média aritmética

    O maior valor

    O menor valor
 */
import java.util.Scanner;

public class ExercicioInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int c = scanner.nextInt();

        double media = (a + b + c) / 3.0;

        int maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;

        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        System.out.println("Média: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        scanner.close();
    }
}