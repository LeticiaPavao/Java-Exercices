import java.util.Scanner;

public class ExemploByte {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (byte): ");
        byte num1 = scanner.nextByte();

        System.out.print("Digite o segundo número (byte): ");
        byte num2 = scanner.nextByte();

        int soma = num1 + num2;
        int diferenca = num1 - num2;
        int produto = num1 * num2;
        int resto = num1 % num2;

        System.out.println("Soma: " + soma);
        System.out.println("Diferença: " + diferenca);
        System.out.println("Produto: " + produto);
        System.out.println("Resto da divisão: " + resto);
    } 
    
}












































// import java.util.Scanner;

// public class ExemploByte {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Digite o primeiro número (byte): ");
//         byte a = scanner.nextByte();
        
//         System.out.print("Digite o segundo número (byte): ");
//         byte b = scanner.nextByte();
        
        
//         int soma = a + b;
//         int diferenca = a - b;
//         int produto = a * b;
//         int resto = a % b;
        
//         System.out.println("Soma: " + soma);
//         System.out.println("Diferença: " + diferenca);
//         System.out.println("Produto: " + produto);
//         System.out.println("Resto da divisão: " + resto);
        
//         scanner.close();
//     }
// }

/*Exercício
Crie um programa que leia três valores do tipo byte e calcule a média aritmética deles. 
O resultado deve ser exibido como double.
*/