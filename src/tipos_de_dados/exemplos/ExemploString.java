package exemplos;


import java.util.Scanner;

public class ExemploString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        
        String nomeCompleto = nome + " " + sobrenome;
        int comprimento = nomeCompleto.length();
        String maiusculas = nomeCompleto.toUpperCase();
        
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Número de caracteres: " + comprimento);
        System.out.println("Em maiúsculas: " + maiusculas);
        
        scanner.close();
    }
}


/**
 * Exercício
Leia uma palavra (String) e exiba:

    O primeiro caractere

    O último caractere

    O número total de caracteres
 */