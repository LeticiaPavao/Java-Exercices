/*Exercício
Crie um programa que leia três valores do tipo byte e calcule a média aritmética deles. 
O resultado deve ser exibido como double.
*/

import java.util.Scanner;

public class ExercicioByte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor (byte): ");
        byte a = scanner.nextByte();

        System.out.print("Digite o segundo valor (byte): ");
        byte b = scanner.nextByte();

        System.out.print("Digite o terceiro valor (byte): ");
        byte c = scanner.nextByte();

        double media = (a + b + c) / 3.0;  // divisão com double

        System.out.println("Média aritmética: " + media);

        scanner.close();
    }
}