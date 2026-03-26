import java.util.Scanner;

public class ExemploCombinado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o raio da esfera (double): ");
        double raio = scanner.nextDouble();

        //raio do círculo: PI * raio * raio
        //fórmula da circunferência: 2 * PI * raio
        //volume da esfera: 4/3 * PI * raio * raio * raio (raio elevado ao cubo)
        
        double areaCirculo = Math.PI * Math.pow(raio, 2);
        double comprimentoCircunferencia = 2 * Math.PI * raio;
        double volumeEsfera = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
        
        System.out.println("Área do círculo: " + areaCirculo);
        System.out.println("Comprimento da circunferência: " + comprimentoCircunferencia);
        System.out.println("Volume da esfera: " + volumeEsfera);
        
        scanner.close();
    }
}

/**
 * 
 * Exercício
Leia as coordenadas de dois pontos no plano cartesiano (x1, y1) e (x2, y2) como double e calcule a 
distância entre eles usando a fórmula:
distancia = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) )
 */