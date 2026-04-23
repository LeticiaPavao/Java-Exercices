import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a sua idade?");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Pode tirar a CNH");
        } else {
            System.out.println("Ainda não pode tirar a CNH");
        }
        scanner.close();
    }
}