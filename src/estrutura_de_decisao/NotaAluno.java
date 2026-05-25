import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = scanner.nextDouble();

        if(nota >= 9){
            System.out.println("MB");
        } else if(nota >= 7 && nota < 9){
            System.out.println("B");
        } else if(nota >= 5 && nota < 7){
            System.out.println("R");
        } else if(nota < 5){
            System.out.println("I");
        } else {
            System.out.println("Nota inválida");
        }

        scanner.close();
    }
}
