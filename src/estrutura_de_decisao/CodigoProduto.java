import java.util.Scanner;

public class CodigoProduto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        switch(codigo){
            case 1:
                System.out.println("Cadeira");
                break;
            case 2:
                System.out.println("Mesa");
                break;
            case 3:
                System.out.println("Computador");
                break;
            case 4:
                System.out.println("Monitor");
                break;
            case 5:
                System.out.println("Teclado");
                break;
            default:
                System.out.println("Nenhum produto encontrado");
                break;
        }

        scanner.close();
    }
}
