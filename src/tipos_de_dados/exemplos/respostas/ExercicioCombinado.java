package exemplos.respostas;
/**
 * Leia as coordenadas de dois pontos no plano cartesiano (x1, y1) e (x2, y2) como double e calcule a 
 * distância entre eles usando a fórmula:
 * 
distancia = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) )

formula da distância: raiz quadrada de (x2 - x1)^2 + (y2 - y1)^2
 */

import java.util.Scanner;

public class ExercicioCombinado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Digite y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Digite x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Digite y2: ");
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distância entre os pontos: " + distancia);

        scanner.close();
    }
}