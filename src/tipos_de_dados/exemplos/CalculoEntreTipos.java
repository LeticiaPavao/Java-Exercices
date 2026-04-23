import java.util.Scanner;

public class CalculoEntreTipos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de valores de tipos diferentes
        System.out.print("Digite um valor byte: ");
        byte valorByte = scanner.nextByte();

        System.out.print("Digite um valor short: ");
        short valorShort = scanner.nextShort();

        System.out.print("Digite um valor int: ");
        int valorInt = scanner.nextInt();

        System.out.print("Digite um valor long: ");
        long valorLong = scanner.nextLong();

        System.out.print("Digite um valor float: ");
        float valorFloat = scanner.nextFloat();

        System.out.print("Digite um valor double: ");
        double valorDouble = scanner.nextDouble();

        System.out.print("Digite um caractere: ");
        char valorChar = scanner.next().charAt(0);

        System.out.print("Digite um valor boolean (true/false): ");
        boolean valorBoolean = scanner.nextBoolean();

        // ------------------------------------------------
        // 1. Soma entre byte e short -> promovido para int
        // ------------------------------------------------
        int somaByteShort = valorByte + valorShort;
        System.out.println("\n1. byte + short = int: " + somaByteShort);

        // ------------------------------------------------
        // 2. Multiplicação entre int e long -> promovido para long
        // ------------------------------------------------
        long produtoIntLong = valorInt * valorLong;
        System.out.println("2. int * long = long: " + produtoIntLong);

        // ------------------------------------------------
        // 3. Divisão entre float e double -> promovido para double
        // ------------------------------------------------
        double divisaoFloatDouble = valorFloat / valorDouble;
        System.out.println("3. float / double = double: " + divisaoFloatDouble);

        // ------------------------------------------------
        // 4. Operação com char (é tratado como número)
        //    char + int -> promovido para int
        // ------------------------------------------------
        int somaCharInt = valorChar + valorInt;
        System.out.println("4. char + int = int: " + somaCharInt);
        System.out.println("   (código do caractere '" + valorChar + "' é " + (int)valorChar + ")");

        // ------------------------------------------------
        // 5. Operação mista com boolean (usamos operador lógico)
        //    Não se pode fazer aritmética com boolean
        // ------------------------------------------------
        boolean resultadoLogico = valorBoolean && (valorInt > 0);
        System.out.println("5. boolean AND (valorInt>0): " + resultadoLogico);

        // ------------------------------------------------
        // 6. Expressão com vários tipos – promoção ao maior
        //    byte + short + int + long + float -> float (pois float é maior que long)
        // ------------------------------------------------
        float expressaoMista = valorByte + valorShort + valorInt + valorLong + valorFloat;
        System.out.println("6. byte+short+int+long+float = float: " + expressaoMista);

        // ------------------------------------------------
        // 7. Uso de casting explícito (forçar resultado em tipo menor)
        //    Ex: soma de dois ints pode ser guardada em short com cast
        // ------------------------------------------------
        int somaInt = valorInt + 1000;
        short somaComCast = (short) somaInt;   // pode haver perda de dados
        System.out.println("7. Casting: (short) (int+1000) = " + somaComCast);

        // ------------------------------------------------
        // 8. Operação com Math.sqrt – retorna double
        // ------------------------------------------------
        double raizDeInt = Math.sqrt(valorInt);
        double raizDeFloat = Math.sqrt(valorFloat);
        System.out.println("8. sqrt(" + valorInt + ") = " + raizDeInt);
        System.out.println("   sqrt(" + valorFloat + ") = " + raizDeFloat);

        // ------------------------------------------------
        // 9. Cálculo de porcentagem usando double e int
        // ------------------------------------------------
        double porcentagem = (valorDouble * valorInt) / 100.0;
        System.out.println("9. " + valorDouble + " * " + valorInt + "% = " + porcentagem);

        // ------------------------------------------------
        // 10. Uso do operador resto (%) com tipos mistos
        //     O resto é calculado após promoção para double (se houver float/double)
        // ------------------------------------------------
        double restoDouble = valorDouble % valorInt;
        System.out.println("10. " + valorDouble + " % " + valorInt + " = " + restoDouble);

        scanner.close();
    }
}