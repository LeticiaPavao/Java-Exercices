public class Variaveis {
    public static void main(String[] args) {

        // --- Inteiros ---
        byte nivelBateria = 100;               
        short ano = 2026;                       
        int idade = 26;                          
        long populacao = 7_800_000_000L;         

        System.out.println("--- Inteiros ---");
        System.out.println("byte (nivelBateria): " + nivelBateria);
        System.out.println("short (ano): " + ano);
        System.out.println("int (idade): " + idade);
        System.out.println("long (populacao): " + populacao);
        System.out.println();

        // --- Ponto flutuante ---
        float peso = 57.3f;                     
        double altura = 1.53;                    

        System.out.println("--- Ponto Flutuante ---");
        System.out.println("float (peso): " + peso + " kg");
        System.out.println("double (altura): " + altura + " m");
        System.out.println();

        // --- Caractere ---
        char sexo = 'F';                         
        char simbolo = '©';

        System.out.println("--- Caractere ---");
        System.out.println("char (sexo): " + sexo);
        System.out.println("char (símbolo): " + simbolo);
        System.out.println();

        // --- Booleano ---
        boolean temFilhos = false;                
        boolean maiorIdade = (idade >= 18);

        System.out.println("--- Booleano ---");
        System.out.println("boolean (temFilhos): " + temFilhos);
        System.out.println("boolean (maiorIdade): " + maiorIdade);
        System.out.println();

        // --- Constantes (final) ---
        final double PI = 3.14159;
        final double DESCONTO_INSS = 0.11;

        System.out.println("--- Constantes ---");
        System.out.println("final double PI = " + PI);
        System.out.println("final double DESCONTO_INSS = " + (DESCONTO_INSS * 100) + "%");
        System.out.println();

        // --- String ---
        String nome = "Letícia";
        String sobrenome = "Pavão";

        System.out.println("--- String ---");
        System.out.println("String (nome): " + nome);
        System.out.println("String (sobrenome): " + sobrenome);
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println();

        // --- Array (de inteiros) ---
        int[] numeros = {10, 20, 30, 40, 50};
        String[] cidades = new String[2];
        cidades[0] = "São Paulo";
        cidades[1] = "Rio de Janeiro";

        System.out.println("--- Array ---");
        System.out.print("Array de inteiros: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("Primeira cidade: " + cidades[0]);
        System.out.println("Segunda cidade: " + cidades[1]);
        System.out.println();

        // --- Enum ---
        DiaSemana hoje = DiaSemana.QUINTA;

        System.out.println("--- Enum ---");
        System.out.println("Hoje é: " + hoje);
        System.out.println();

        // --- Object ---
        Object objetoQualquer = "Posso guardar qualquer coisa";
        Object outroObjeto = 12345; 

        System.out.println("--- Object ---");
        System.out.println("Object com String: " + objetoQualquer);
        System.out.println("Object com Integer: " + outroObjeto);
        System.out.println();

        System.out.println("========== RESUMO GERAL ==========");
        System.out.printf(
            "Nome: %s | Idade: %d | Altura: %.2fm | Peso: %.2fkg | Sexo: %c | Tem filhos? %s | PI: %.2f | Desconto: %.0f%% | Hoje: %s%n",
            nome, idade, altura, peso, sexo, (temFilhos ? "Sim" : "Não"), PI, DESCONTO_INSS * 100, hoje
        );
        System.out.println("===================================");
    }
}