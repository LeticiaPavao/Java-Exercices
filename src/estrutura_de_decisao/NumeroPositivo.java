import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if(numero > 0 && numero % 2 == 0){
            System.out.println("O número é positivo e par.");
        }
        scanner.close();
    }
}