public class Array {
    public static void main(String[] args){
        // array são estruturas de dados que armazenam uma coleção de elementos do mesmo tipo.
        int[] numeros = {10, 20, 30, 40, 50};
        String[] nomes = new String[3];

        nomes[0] = "Letícia";
        nomes[1] = "João";
        nomes[2] = "Maria";

        // Acessando cada elemento do array usando um loop (for) para iterar sobre os índices do array.
        // o método length é usado para obter o tamanho do array, 
        // garantindo que o loop percorra todos os elementos sem causar 
        // um erro de índice fora dos limites.
        System.out.println("Elementos do array numérico:");
        for (int i = 0; i < numeros.length; i++) {  
            System.out.println(numeros[i]);         
        }                                          

        System.out.println("Elementos do array de nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
    
}
