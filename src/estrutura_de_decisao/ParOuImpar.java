import java.util.Scanner;;

public class ParOuImpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        String resultado = (num % 2 == 0) ? "par" : "ímpar";

        System.out.println("O número digitado é: " + resultado);
        scanner.close();
    }
}