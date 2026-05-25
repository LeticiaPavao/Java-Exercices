package exemplos;

import java.util.Scanner;

public class ExemploBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        boolean positivo = numero > 0;
        boolean par = numero % 2 == 0;
        boolean positivoEPar = positivo && par;
        
        System.out.println("O número é positivo? " + positivo);
        System.out.println("O número é par? " + par);
        System.out.println("É positivo e par? " + positivoEPar);
        
        scanner.close();
    }
}

/**
 * Exercício
Leia dois números inteiros e determine:

    Se o primeiro é múltiplo do segundo

    Se ambos são positivos

Exiba o resultado usando variáveis do tipo boolean.
 */