package exemplos;

import java.util.Scanner;

public class ExemploChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um caractere: ");
        char letra = scanner.next().charAt(0);   // leitura de um caractere, o 0 indica que queremos o primeiro caractere
        
        int codigo = (int) letra;                // código ASCII/Unicode
        char proximo = (char) (letra + 1);       // caractere seguinte
        boolean ehDigito = letra >= '0' && letra <= '9';
        
        System.out.println("Caractere: " + letra);
        System.out.println("Código: " + codigo);
        System.out.println("Próximo caractere: " + proximo);
        System.out.println("É dígito? " + ehDigito);
        
        scanner.close();
    }
}

/**
 * 
 * Exercício
Leia um caractere e verifique se ele é uma vogal (maiúscula ou minúscula). 
Dica: compare com 'a', 'e', 'i', 'o', 'u' e as versões maiúsculas.
 */